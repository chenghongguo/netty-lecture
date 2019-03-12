package com.hongguo.netty.bytebuf;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.CompositeByteBuf;
import io.netty.buffer.Unpooled;
import org.junit.Test;

import java.nio.charset.Charset;

/**
 * @author: chenghongguo
 * @date: 2019-03-12
 * @description:
 */
public class ByteBufTest {

    public static void main(String[] args) {
        ByteBuf buf = Unpooled.buffer();
        System.out.println(buf.capacity());
//        if (buf.hasArray()) {
//            int offset = buf.arrayOffset() + buf.readerIndex();
//            int length = buf.readableBytes();
//            System.out.println(offset);
//            System.out.println(length);
//        }

        ByteBuf byteBuf = Unpooled.directBuffer();
        System.out.println(byteBuf.capacity());
        if (!byteBuf.hasArray()) {
            int length = byteBuf.readableBytes();
            System.out.println("length = " + length);
        }


        Charset utf8 = Charset.forName("UTF-8");
        ByteBuf buf1 = Unpooled.copiedBuffer("Netty in Action rocks", utf8);
        ByteBuf sliced = buf1.slice(0, 15);
        System.out.println(sliced.toString(utf8));

        buf1.setByte(0, (byte) 'J');
        System.out.println(buf1.getByte(0) == sliced.getByte(0));
    }

    @Test
    public void test1() {
        // 创建ByteBuf
        // 创建堆缓冲区
        ByteBuf buf = Unpooled.buffer();
        System.out.println(buf.capacity());
        System.out.println(buf.isDirect());
        // 创建直接缓冲区
        buf = Unpooled.directBuffer();
        System.out.println(buf.capacity());
        System.out.println(buf.isDirect());
        // 复合缓冲区
        CompositeByteBuf compositeByteBuf = Unpooled.compositeBuffer();
        System.out.println(compositeByteBuf.capacity());
        ByteBuf headerBuf = Unpooled.buffer();
        ByteBuf bodyBuf = Unpooled.directBuffer();
        compositeByteBuf.addComponents(headerBuf, bodyBuf);
        System.out.println(compositeByteBuf.capacity());
        System.out.println(compositeByteBuf.isDirect());
        for (ByteBuf b : compositeByteBuf) {
            System.out.println(b.toString());
        }
    }

    @Test
    public void test2() {
        Charset utf8 = Charset.forName("UTF-8");
        ByteBuf buf = Unpooled.copiedBuffer("Netty in Action rocks", utf8);
        byte[] array = buf.array();
        System.out.println("length = " + array.length);
        System.out.println("readableBytes = " + buf.readableBytes());
        for (int i = 0; i < buf.readableBytes(); i++) {
            byte b = buf.getByte(i);
            System.out.println((char)b);
            System.out.println(buf.readerIndex() + ", " + buf.writerIndex());
        }
    }
}
