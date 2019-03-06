package com.hongguo.netty.proto;

/**
 * @author hongguo_cheng
 * @date 2019-03-05
 * @description
 */
public class DataInfoTest {

    public static void main(String[] args) throws Exception{
        DataInfo.Person student = DataInfo.Person.newBuilder().setName("张三").setAge(30).setAddress("北京").build();

        byte[] bytes = student.toByteArray();

        DataInfo.Person student1 = DataInfo.Person.parseFrom(bytes);
        System.out.println(student1.getName());
        System.out.println(student1.getAge());
        System.out.println(student1.getAddress());
    }
}
