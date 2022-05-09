package firstjava;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServer2 {
    public static void main(String[] args) throws IOException {
        var server = new ServerSocket(1599);
        System.out.println("기다려주세요...");
        try (Socket sk = server.accept();
             InputStream is = sk.getInputStream()) {
            System.out.println("연결: " + sk.getInetAddress());
            System.out.println(is.read());
        }
    }
}
