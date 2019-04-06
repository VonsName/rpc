package com.von.rpc.common.encipher;

import com.von.rpc.common.entity.MRpcProtoBufResponse;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelOutboundHandlerAdapter;
import io.netty.channel.ChannelPromise;

/**
 * @author : vons
 * @version : 1.0
 * @date : 2019/4/6 23:04
 */
public class MRpcProtoBufResponseEncoder extends ChannelOutboundHandlerAdapter {

    @Override
    public void write(ChannelHandlerContext ctx, Object msg, ChannelPromise promise) throws Exception {

        MRpcProtoBufResponse.ProtoBufMRpcResponse response = (MRpcProtoBufResponse.ProtoBufMRpcResponse) msg;
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeBytes(response.toByteArray());
        ctx.write(buffer,promise);
    }

    @Override
    public void flush(ChannelHandlerContext ctx) throws Exception {
        super.flush(ctx);
    }
}
