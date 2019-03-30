package com.hongguo.netty.bytebuf;

import io.netty.buffer.ByteBufUtil;
import org.junit.Test;

/**
 * @author: chenghongguo
 * @date: 2019-03-14
 * @description:
 */
public class ByteBufUtilTest {

    @Test
    public void test1() {
        String s = ByteBufUtil.hexDump("Netty".getBytes());
        System.out.println(s);
    }
}
