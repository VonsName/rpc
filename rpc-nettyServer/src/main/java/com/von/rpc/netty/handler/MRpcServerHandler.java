package com.von.rpc.netty.handler;

import com.alibaba.fastjson.JSON;
import com.von.rpc.common.entity.MRpcRequest;
import com.von.rpc.common.entity.MRpcResponse;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.channel.SimpleChannelInboundHandler;

/**
 * @author : vons
 * @version : 1.0
 * @date : 2019/4/2 22:17
 * ChannelInboundHandlerAdapter
 */
public class MRpcServerHandler extends SimpleChannelInboundHandler<MRpcRequest> {


    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        System.out.println("客户端连接成功");
    }

//    @Override
//    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
//        MRpcRequest request = JSON.parseObject(msg.toString(), MRpcRequest.class);
//        System.out.println("接收到客户端的消息:" + request);
//
//        ByteBuf buffer1 = Unpooled.buffer();
//        MRpcResponse mRpcResponse = new MRpcResponse();
//        mRpcResponse.setRequestId(request.getRequestId());
//        ByteBuf buffer = ctx.alloc().buffer();
//        buffer.writeBytes(JSON.toJSONString(mRpcResponse).getBytes());
//        ctx.writeAndFlush(buffer);
//    }

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, MRpcRequest msg) throws Exception {
        System.out.println("接收到客户端的消息:" + msg);

//        ByteBuf buffer = Unpooled.buffer();
        ByteBuf buffer = ctx.alloc().buffer();
        MRpcResponse mRpcResponse = new MRpcResponse();
        mRpcResponse.setRequestId(msg.getRequestId());
        buffer.writeBytes(JSON.toJSONString(mRpcResponse).getBytes());
        ctx.writeAndFlush(buffer);
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        cause.printStackTrace();
        ctx.close();
    }
}
