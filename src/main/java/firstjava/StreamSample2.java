package firstjava;

import java.util.List;

public class StreamSample2 {
    public static void main(String[] args) {
        var data = List.of("홍길동외전", "이순신전기", "신사임당");
        var result = (int) data.stream()
                .filter(s -> s.length() >= 5)
                .count();
        System.out.println(result);
    }
}
