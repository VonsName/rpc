package com.von.rpc.common.netty;

import com.von.rpc.common.entity.MRpcResponse;
import io.netty.channel.ChannelHandlerAdapter;
import io.netty.channel.ChannelHandlerContext;

/**
 * @author ： fjl
 * @date ： 2019/4/2/002 16:19
 */
public class ProtoBufRequestDecoder extends ChannelHandlerAdapter {

    private MRpcResponse rpcResponse;

    public ProtoBufRequestDecoder() {
        rpcResponse = new MRpcResponse();
    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        System.out.println("客户端连接成功");
    }

    @Override
    public void channelInactive(ChannelHandlerContext ctx) throws Exception {
        System.out.println("客户端失去连接");
    }

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {

    }

    @Override
    public void channelReadComplete(ChannelHandlerContext ctx) throws Exception {
        ctx.write(rpcResponse);
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        cause.printStackTrace();
        ctx.close();
    }
}
