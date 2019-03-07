package com.hongguo.netty.proto.repeated;

/**
 * @author: chenghongguo
 * @date: 2019-03-07
 * @description:
 */
public class RepeatedTest {
    public static void main(String[] args) {
        RepeatedMessage.RepeatedObject message = RepeatedMessage.RepeatedObject.newBuilder()
                .setName("repeated").setAge(10).addHobbies("basketball").build();
        System.out.println(message);
    }
}
