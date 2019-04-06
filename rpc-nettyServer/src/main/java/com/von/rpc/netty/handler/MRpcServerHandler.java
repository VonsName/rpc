package com.von.rpc.netty.handler;

import com.alibaba.fastjson.JSON;
import com.von.rpc.common.entity.MRpcProtoBufRequest;
import com.von.rpc.common.entity.MRpcProtoBufResponse;
import com.von.rpc.common.entity.MRpcResponse;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

/**
 * @author : vons
 * @version : 1.0
 * @date : 2019/4/2 22:17
 * ChannelInboundHandlerAdapter
 */
public class MRpcServerHandler extends ChannelInboundHandlerAdapter {


    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        System.out.println("客户端连接成功");
    }

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
//        MRpcRequest request = JSON.parseObject(msg.toString(), MRpcRequest.class);
        System.out.println("接收到客户端的消息:" + msg);
        MRpcProtoBufRequest.ProtoBufMRpcRequest request = (MRpcProtoBufRequest.ProtoBufMRpcRequest) msg;
//        ByteBuf buffer1 = Unpooled.buffer();
//        MRpcResponse mRpcResponse = new MRpcResponse();
//        mRpcResponse.setRequestId(request.getRequestId());
//        ByteBuf buffer = ctx.alloc().buffer();
//        buffer.writeBytes(JSON.toJSONString(mRpcResponse).getBytes());
//        ctx.writeAndFlush(buffer);
        System.out.println("向客服端写回数据");
        MRpcProtoBufResponse.ProtoBufMRpcResponse response = MRpcProtoBufResponse.ProtoBufMRpcResponse.newBuilder()
                .setRequestId(request.getRequestId())
                .setResult("成功收到你的数据了 我给你返回来啦")
                .setException("没有异常")
                .setExceptionClass("null")
                .build();
        ctx.writeAndFlush(response);
    }

//    @Override
//    protected void channelRead0(ChannelHandlerContext ctx, MRpcProtoBufRequest.ProtoBufMRpcRequest msg) throws Exception {
//        System.out.println("接收到客户端的消息:" + msg);
//
////        ByteBuf buffer = Unpooled.buffer();
//        ByteBuf buffer = ctx.alloc().buffer();
//        MRpcResponse mRpcResponse = new MRpcResponse();
//        mRpcResponse.setRequestId(msg.getRequestId());
//        buffer.writeBytes(JSON.toJSONString(mRpcResponse).getBytes());
//        ctx.writeAndFlush(buffer);
//    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        cause.printStackTrace();
        ctx.close();
    }
}
