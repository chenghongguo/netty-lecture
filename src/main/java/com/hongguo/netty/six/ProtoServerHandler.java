package com.hongguo.netty.six;

import com.hongguo.netty.proto.DataInfo;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

/**
 * @author hongguo_cheng
 * @date 2019-03-04
 * @description
 */
public class ProtoServerHandler extends SimpleChannelInboundHandler<DataInfo.Student> {

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, DataInfo.Student msg) throws Exception {
        System.out.println(msg.getName());
        System.out.println(msg.getAge());
        System.out.println(msg.getAddress());

        DataInfo.Person person = DataInfo.Person.newBuilder().setName("李四").setAge(20).setAddress("上海").build();
        ctx.channel().writeAndFlush(person);
    }
}
