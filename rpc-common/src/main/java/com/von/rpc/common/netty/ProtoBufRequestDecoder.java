package com.von.rpc.common.netty;

import com.von.rpc.common.entity.MRpcRequest;
import com.von.rpc.common.entity.MRpcResponse;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerAdapter;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.handler.codec.MessageToByteEncoder;

/**
 * @author ： fjl
 * @date ： 2019/4/2/002 16:19
 */
public class ProtoBufRequestDecoder extends MessageToByteEncoder<MRpcRequest> {

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        System.out.println("客户端连接成功");
    }

    @Override
    protected void encode(ChannelHandlerContext channelHandlerContext, MRpcRequest request, ByteBuf byteBuf) throws Exception {
        System.out.println(request);
    }
}
