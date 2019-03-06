package com.hongguo.netty.six;

import com.hongguo.netty.proto.DataInfo;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

import java.util.Random;

/**
 * @author hongguo_cheng
 * @date 2019-03-05
 * @description
 */
public class ProtoClientHandler extends SimpleChannelInboundHandler<DataInfo.MyDataInfo> {
    @Override
    protected void channelRead0(ChannelHandlerContext ctx, DataInfo.MyDataInfo msg) throws Exception {

    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {

        int random = new Random().nextInt(3);
        DataInfo.MyDataInfo myDataInfo;
        if (random == 0) {
            myDataInfo = DataInfo.MyDataInfo.newBuilder().setDataType(DataInfo.MyDataInfo.DataType.PERSON)
                    .setPerson(DataInfo.Person.newBuilder().setName("zhangsan").setAge(30).setAddress("beijing").build())
                    .build();
        } else if (random == 1) {
            myDataInfo = DataInfo.MyDataInfo.newBuilder().setDataType(DataInfo.MyDataInfo.DataType.DOG)
                    .setDog(DataInfo.Dog.newBuilder().setName("dog").setAge(3).build())
                    .build();
        } else {
            myDataInfo = DataInfo.MyDataInfo.newBuilder().setDataType(DataInfo.MyDataInfo.DataType.CAT)
                    .setCat(DataInfo.Cat.newBuilder().setName("cat").setAge(2).build())
                    .build();
        }
        ctx.writeAndFlush(myDataInfo);
    }
}
