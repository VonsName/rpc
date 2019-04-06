package com.von.rpc.common.encipher;

import com.von.rpc.common.entity.MRpcProtoBufRequest;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

import java.util.Base64;

/**
 * @author : vons
 * @version : 1.0
 * @date : 2019/4/6 22:12
 */
public class MRpcProtobufRequestDecoder extends ChannelInboundHandlerAdapter {

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        ByteBuf buffer = (ByteBuf) msg;
        byte[] b = new byte[buffer.readableBytes()];
        Base64.Decoder decoder = Base64.getDecoder();

        //Protocol message contained an invalid tag
        //这里Api使用错了 使用成了 buffer.writeBytes(b);
        //readBytes 把ByteBuf的数据读到 b 数组中
        buffer.readBytes(b);
        //Base64解码
//        byte[] decode = decoder.decode(b);

        MRpcProtoBufRequest.ProtoBufMRpcRequest request = MRpcProtoBufRequest.ProtoBufMRpcRequest.parseFrom(b);
        System.out.println("========decoder:==============" + request);
        ctx.fireChannelRead(request);
    }
}
