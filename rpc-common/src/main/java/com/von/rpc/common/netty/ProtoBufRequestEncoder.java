package com.von.rpc.common.netty;

import com.von.rpc.common.entity.MRpcRequest;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

/**
 * @author ： fjl
 * @date ： 2019/4/2/002 16:48
 */
public class ProtoBufRequestEncoder extends SimpleChannelInboundHandler<MRpcRequest> {


    @Override
    protected void messageReceived(ChannelHandlerContext ctx, MRpcRequest msg) throws Exception {

    }
}
