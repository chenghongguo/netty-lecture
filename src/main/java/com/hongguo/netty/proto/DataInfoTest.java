package com.hongguo.netty.proto;

/**
 * @author hongguo_cheng
 * @date 2019-03-05
 * @description
 */
public class DataInfoTest {

    public static void main(String[] args) throws Exception{
        DataInfo.Student student = DataInfo.Student.newBuilder().setName("张三").setAge(30).setAddress("北京").build();

        byte[] bytes = student.toByteArray();

        DataInfo.Student student1 = DataInfo.Student.parseFrom(bytes);
        System.out.println(student1.getName());
        System.out.println(student1.getAge());
        System.out.println(student1.getAddress());
    }
}
