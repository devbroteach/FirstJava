package firstjava;

public class RunLengthCompression {
    public static void main(String[] args) {
        final var COUNTER_BASE = -1;
        var data = "abbcccbaaaabccccccccccccddd";
        var count = COUNTER_BASE;
        char prev = 0;
        var builder = new StringBuilder();
        for (var ch : data.toCharArray()) {
            if (prev == ch) {
                // 같은 문자를 붙일 떄
                count++;
                if (count == 9) {
                    builder.append('9');
                    count = COUNTER_BASE;
                    prev = 0;
                }
            } else {
                // 다른 문자가 올때
                if (count >= 0) {
                    // 이전 문자가 연속이므로 숫자 출력
                    builder.append((char) ('0' + count));
                    count = COUNTER_BASE;
                }
                builder.append(ch);
                prev = ch;
            }
        }
        // 마지막 문자가 연속이면 숫자 출력
        if (count >= 0) {
            builder.append((char) ('0' + count));
        }
        var result = builder.toString();
        System.out.println(data);
        System.out.println(result);
    }
}
