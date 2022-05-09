package firstjava;

import java.util.List;

public class ForEachListSample {
    public static void main(String[] args) {
        // var strs = List.of("apple", "grape", "watermelon");
        var strs = List.of("홍길동","이순신","신사임당");

        for (String str : strs) {
            System.out.println(str);
        }
    }

}
