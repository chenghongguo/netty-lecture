package com.hongguo.netty.bytebuf;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.junit.Test;

/**
 * @author hongguo_cheng
 * @date 2019-03-13
 * @description
 */
public class UnpooledTest {

    @Test
    public void test2() {
        ByteBuf buf = Unpooled.wrappedBuffer(new byte[128], new byte[256]);
        buf.writeBytes("Netty in action".getBytes());
        System.out.println(buf.capacity() + ", " + buf.readerIndex() + ", " + buf.writerIndex());
        buf.resetReaderIndex();
        System.out.println(buf.readerIndex() + ", " + buf.writerIndex());
        int length = buf.readableBytes();
        for (int i = 0; i < length; i++) {
            byte b = buf.readByte();
            System.out.println((char)b);
            System.out.println(buf.readerIndex() + ", " + buf.writerIndex());
        }
        buf.clear();
    }

    @Test
    public void test1() {
        // ByteBuf buf = wrappedBuffer(new byte[8], new byte[7]);
        ByteBuf buf = Unpooled.buffer(256);
        buf.writeBytes("Netty in action".getBytes());
        System.out.println(buf.readerIndex() + ", " + buf.writerIndex());
        buf.resetReaderIndex();
        System.out.println(buf.readerIndex() + ", " + buf.writerIndex());
        int length = buf.readableBytes();
        for (int i = 0; i < length; i++) {
            byte b = buf.readByte();
            System.out.println((char)b);
            System.out.println(buf.readerIndex() + ", " + buf.writerIndex());
        }
    }
}
