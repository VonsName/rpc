package com.von.rpc.common.encipher;

import com.von.rpc.common.entity.MRpcProtoBufResponse;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

/**
 * @author : vons
 * @version : 1.0
 * @date : 2019/4/6 23:05
 */
public class MRpcProtoBufResponseDecoder extends ChannelInboundHandlerAdapter {

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {

        ByteBuf buf = (ByteBuf) msg;
        byte[] bytes = new byte[buf.readableBytes()];
        buf.readBytes(bytes);

        MRpcProtoBufResponse.ProtoBufMRpcResponse rpcResponse = MRpcProtoBufResponse.ProtoBufMRpcResponse.parseFrom(bytes);
        System.out.println("解码服务端返回的数据:" + rpcResponse);

        ctx.fireChannelRead(rpcResponse);
    }
}
