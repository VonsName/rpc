package com.von.rpc.netty.server;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

/**
 * @author : vons
 * @version : 1.0
 * @date : 2019/4/2 22:17
 */
public class MRpcServerHandler extends ChannelInboundHandlerAdapter {


    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        System.out.println("客户端连接成功");
    }

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        String request = (String) msg;
        System.out.println("接收到客户端的消息" + request);

//        MRpcResponse mRpcResponse = new MRpcResponse();
//        mRpcResponse.setRequestId(request.getRequestId());
//        System.out.println("发送给客户端的消息:" + mRpcResponse);
        ctx.writeAndFlush("服务器响应你了".getBytes());
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        ctx.close();
    }
}
