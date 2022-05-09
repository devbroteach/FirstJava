package firstjava;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSample1 {
    public static void main(String[] args) {
        var data = List.of("홍길동외전", "이순신전기", "신사임당");
        var result = data.stream()
                .filter(a -> a.length() >= 5)
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println(result);
    }

}
