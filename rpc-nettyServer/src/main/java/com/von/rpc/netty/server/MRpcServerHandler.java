package com.von.rpc.netty.server;

import com.alibaba.fastjson.JSON;
import com.von.rpc.common.entity.MRpcRequest;
import com.von.rpc.common.entity.MRpcResponse;
import io.netty.buffer.ByteBuf;
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
        MRpcRequest request = JSON.parseObject(msg.toString(), MRpcRequest.class);
        System.out.println("接收到客户端的消息:" + request);

        MRpcResponse mRpcResponse = new MRpcResponse();
        mRpcResponse.setRequestId(request.getRequestId());
        ByteBuf buffer = ctx.alloc().buffer();
        buffer.writeBytes(JSON.toJSONString(mRpcResponse).getBytes());
        ctx.writeAndFlush(buffer);
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        ctx.close();
    }
}
