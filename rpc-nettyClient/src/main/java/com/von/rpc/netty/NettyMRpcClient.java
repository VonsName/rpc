package com.von.rpc.netty;

import com.von.rpc.AbstractMRpcClient;
import com.von.rpc.netty.handler.MRpcClientHandler;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.string.StringDecoder;
import io.netty.handler.codec.string.StringEncoder;

/**
 * @author ： fjl
 * @date ： 2019/4/2/002 16:11
 */
public class NettyMRpcClient extends AbstractMRpcClient {

    public void connect(int port, String host) {
        EventLoopGroup group = new NioEventLoopGroup();
        Bootstrap bootstrap = new Bootstrap();
        bootstrap.group(group).channel(NioSocketChannel.class)
                .option(ChannelOption.TCP_NODELAY, true)
                .handler(new ChannelInitializer<SocketChannel>() {
                    @Override
                    protected void initChannel(SocketChannel ch) {
//                        ch.pipeline().addLast(new ObjectDecoder(1024 * 1024, ClassResolvers.cacheDisabled(this.getClass().getClassLoader())));
//                        ch.pipeline().addLast(new ObjectEncoder());
//                        ch.pipeline().addLast(new MRpcClientHandler());

                        ch.pipeline().addLast(new StringDecoder());
                        ch.pipeline().addLast(new StringEncoder());
                        ch.pipeline().addLast(new MRpcClientHandler());
                    }
                });

        try {
            ChannelFuture sync = bootstrap.connect(host, port);
            sync.channel().closeFuture().sync();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            group.shutdownGracefully();
        }

    }

    public static void main(String[] args) {
        NettyMRpcClient client = new NettyMRpcClient();
        client.connect(8080, "localhost");
    }
}
