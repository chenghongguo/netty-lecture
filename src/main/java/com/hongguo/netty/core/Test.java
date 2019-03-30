package com.hongguo.netty.core;

/**
 * @author: chenghongguo
 * @date: 2019-03-30
 * @description:
 */
public class Test {

    @org.junit.Test
    public void test() {
        boolean powerOfTwo = isPowerOfTwo(10);
        System.out.println(powerOfTwo);
    }

    private boolean isPowerOfTwo(int val) {
        // 原码 & 补码 == 原码
        return (val & -val) == val;
    }
}
