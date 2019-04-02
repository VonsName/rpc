package com.von.rpc.common.netty;

import com.alibaba.fastjson.JSON;
import com.von.rpc.common.entity.MRpcRequest;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.handler.codec.MessageToByteEncoder;

/**
 * @author ： fjl
 * @date ： 2019/4/2/002 16:48
 */
public class ProtoBufRequestEncoder extends MessageToByteEncoder<MRpcRequest> {

    @Override
    protected void encode(ChannelHandlerContext channelHandlerContext, MRpcRequest request, ByteBuf byteBuf) throws Exception {
        byte[] bytes = request.toString().getBytes();
        byteBuf.writeBytes(bytes);
    }
}
