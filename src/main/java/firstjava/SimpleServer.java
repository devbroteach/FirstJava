package firstjava;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServer {
    public static void main(String[] args) throws IOException {
        Socket sk = null;
        InputStream is = null;
        try {
            var server = new ServerSocket(1599);
            System.out.println("기다려주세요...");
            sk = server.accept();
            System.out.println("연결: " + sk.getInetAddress());
            is = sk.getInputStream();
            System.out.println(is.read());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            is.close();
            sk.close();
        }

    }
}
