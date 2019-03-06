package com.hongguo.netty.six;

import com.hongguo.netty.proto.DataInfo;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

/**
 * @author hongguo_cheng
 * @date 2019-03-04
 * @description
 */
public class ProtoServerHandler extends SimpleChannelInboundHandler<DataInfo.MyDataInfo> {

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, DataInfo.MyDataInfo msg) throws Exception {

        if (msg.getDataType() == DataInfo.MyDataInfo.DataType.PERSON) {
            System.out.println(msg.getPerson().getName());
            System.out.println(msg.getPerson().getAge());
            System.out.println(msg.getPerson().getAddress());
        } else if (msg.getDataType() == DataInfo.MyDataInfo.DataType.DOG) {
            System.out.println(msg.getDog().getName());
            System.out.println(msg.getDog().getAge());
        } else {
            System.out.println(msg.getCat().getName());
            System.out.println(msg.getCat().getAge());
        }
    }
}
