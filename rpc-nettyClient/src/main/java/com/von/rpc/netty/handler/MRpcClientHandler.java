package com.von.rpc.netty.handler;

import com.alibaba.fastjson.JSON;
import com.von.rpc.common.entity.MRpcProtoBufRequest;
import com.von.rpc.common.entity.MRpcResponse;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.util.ReferenceCountUtil;

import java.util.UUID;

/**
 * @author : vons
 * @version : 1.0
 * @date : 2019/4/2 22:24
 * ChannelInboundHandlerAdapter
 */
public class MRpcClientHandler extends ChannelInboundHandlerAdapter {


    /**
     * 客户端与服务端连接成功 发送数据到服务端
     *
     * @param ctx
     * @throws Exception
     */
    @Override
    public void channelActive(ChannelHandlerContext ctx) {
        System.out.println("客户端与服务端连接成功");
//        MRpcRequest request = new MRpcRequest();
//        request.setRequestId(UUID.randomUUID().toString());
//        ByteBuf buffer = ctx.alloc().buffer();
//        buffer.writeBytes(JSON.toJSONString(request).getBytes());
        MRpcProtoBufRequest.ProtoBufMRpcRequest request = MRpcProtoBufRequest.ProtoBufMRpcRequest.newBuilder()
                .setRequestId(UUID.randomUUID().toString())
                .setRequestUrl("com.von.UserService")
                .build();
        ctx.writeAndFlush(request);
    }


    /**
     * ???接收不到服务端返回的数据????
     *
     * @param ctx
     * @param msg
     */
    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) {
        System.out.println("服务端返回的数据:" + msg);
    }
//    @Override
//    protected void channelRead0(ChannelHandlerContext ctx, MRpcResponse response) throws Exception {
//        System.out.println("服务端返回的数据：" + response);
//    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        ctx.close();
    }
}
