package com.hongguo.netty.six;

import com.hongguo.netty.proto.DataInfo;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

/**
 * @author hongguo_cheng
 * @date 2019-03-05
 * @description
 */
public class ProtoClientHandler extends SimpleChannelInboundHandler<DataInfo.Student> {
    @Override
    protected void channelRead0(ChannelHandlerContext ctx, DataInfo.Student msg) throws Exception {
        System.out.println(msg.getName());
        System.out.println(msg.getAge());
        System.out.println(msg.getAddress());
    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        DataInfo.Person person = DataInfo.Person.newBuilder().setName("张三").setAge(30).setAddress("北京").build();
        ctx.writeAndFlush(person);
    }
}
