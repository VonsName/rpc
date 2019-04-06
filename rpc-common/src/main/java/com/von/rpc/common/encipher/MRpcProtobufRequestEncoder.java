package com.von.rpc.common.encipher;

import com.alibaba.fastjson.JSONObject;
import com.von.rpc.common.entity.MRpcProtoBufRequest;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelOutboundHandlerAdapter;
import io.netty.channel.ChannelPromise;

import java.util.Base64;

/**
 * @author : vons
 * @version : 1.0
 * @date : 2019/4/6 22:13
 */
public class MRpcProtobufRequestEncoder extends ChannelOutboundHandlerAdapter {

    @Override
    public void write(ChannelHandlerContext ctx, Object msg, ChannelPromise promise) throws Exception {

//        JSONObject jsonObject = JSONObject.parseObject(msg.toString());
//        System.out.println("jsonObject:" + jsonObject);
        MRpcProtoBufRequest.ProtoBufMRpcRequest request = (MRpcProtoBufRequest.ProtoBufMRpcRequest) msg;
        ByteBuf buffer = Unpooled.buffer();

        Base64.Encoder encoder = Base64.getEncoder();
        //Base64编码
//        buffer.writeBytes(encoder.encode(request.toByteArray()));
        //writeBytes 把request.toByteArray()的数据写到ByteBuf中
        buffer.writeBytes(request.toByteArray());
//        buffer.writeBytes("\r\n".getBytes());
//        System.out.println(buffer.readableBytes());
        ctx.write(buffer, promise);
    }

    @Override
    public void flush(ChannelHandlerContext ctx) throws Exception {
        super.flush(ctx);
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        cause.printStackTrace();
        ctx.close();
    }
}
