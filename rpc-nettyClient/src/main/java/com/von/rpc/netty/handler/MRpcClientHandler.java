package com.von.rpc.netty.handler;

import com.alibaba.fastjson.JSON;
import com.von.rpc.common.entity.MRpcRequest;
import com.von.rpc.common.entity.MRpcResponse;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.UnpooledHeapByteBuf;
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
public class MRpcClientHandler extends SimpleChannelInboundHandler<MRpcResponse> {


    /**
     * 客户端与服务端连接成功 发送数据到服务端
     *
     * @param ctx
     * @throws Exception
     */
    @Override
    public void channelActive(ChannelHandlerContext ctx) {
        System.out.println("客户端与服务端连接成功");
        MRpcRequest request = new MRpcRequest();
        request.setRequestId(UUID.randomUUID().toString());
        ByteBuf buffer = ctx.alloc().buffer();
        buffer.writeBytes(JSON.toJSONString(request).getBytes());
        ctx.writeAndFlush(buffer);
    }


    /**
     * ???接收不到服务端返回的数据????
     *
     * @param ctx
     * @param msg
     */
//    @Override
//    public void channelRead(ChannelHandlerContext ctx, Object msg) {
//        try {
//            MRpcResponse response = JSON.parseObject(msg.toString(), MRpcResponse.class);
//            System.out.println(response);
//        } finally {
//            ReferenceCountUtil.release(msg);
//        }
//    }

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, MRpcResponse response) throws Exception {
        System.out.println("服务端返回的数据：" + response);
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        ctx.close();
    }
}
