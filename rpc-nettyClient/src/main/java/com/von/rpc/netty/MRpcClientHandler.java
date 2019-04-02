package com.von.rpc.netty;

import com.von.rpc.common.entity.MRpcRequest;
import com.von.rpc.common.entity.MRpcResponse;
import io.netty.channel.ChannelHandlerAdapter;
import io.netty.channel.ChannelHandlerContext;
import io.netty.util.ReferenceCountUtil;

import java.util.Date;
import java.util.UUID;

/**
 * @author : vons
 * @version : 1.0
 * @date : 2019/4/2 22:24
 */
public class MRpcClientHandler extends ChannelHandlerAdapter {


    /**
     * 客户端与服务端连接成功 发送数据到服务端
     *
     * @param ctx
     * @throws Exception
     */
    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        while (true) {
//            MRpcRequest request = new MRpcRequest();
//            request.setRequestId(UUID.randomUUID().toString());
            ctx.writeAndFlush(new Date()+":helloWord");
            Thread.sleep(2000);
        }
    }


    /**
     * ???接收不到服务端返回的数据????
     * @param ctx
     * @param msg
     * @throws Exception
     */
    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        try {
            System.out.println("服务端相应...");
            String response = (String) msg;
            System.out.println(response);
        } finally {
            ReferenceCountUtil.release(msg);
        }
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        ctx.close();
    }
}
