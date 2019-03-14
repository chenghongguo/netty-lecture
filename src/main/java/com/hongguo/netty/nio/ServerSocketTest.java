package com.hongguo.netty.nio;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Arrays;

/**
 * @author hongguo_cheng
 * @date 2019-03-14
 * @description
 */
public class ServerSocketTest {
    public static void main(String[] args) throws Exception {
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        serverSocketChannel.socket().bind(new InetSocketAddress(8899));

        SocketChannel socketChannel = serverSocketChannel.accept();

        long messageLength = 2 + 3 + 4;

        ByteBuffer[] buffers = new ByteBuffer[3];
        buffers[0] = ByteBuffer.allocate(2);
        buffers[1] = ByteBuffer.allocate(3);
        buffers[2] = ByteBuffer.allocate(4);

        while (true) {
            int read = 0;
            while (read < messageLength) {
                long s = socketChannel.read(buffers);
                read += s;
                System.out.println("read buf: " + read);
                Arrays.asList(buffers).stream()
                        .map(buffer -> "position: " + buffer.position() + ", limit: " + buffer.limit())
                        .forEach(System.out::println);
            }
            Arrays.asList(buffers).forEach(byteBuffer -> byteBuffer.flip());
            int write = 0;
            while (write < messageLength) {
                long w = socketChannel.write(buffers);
                write += w;
            }
            Arrays.asList(buffers).stream().forEach(buffer -> buffer.clear());
            System.out.println("read: " + read + ", write: " + write + ", message: " + messageLength);
        }


    }
}
