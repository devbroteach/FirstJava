package firstjava;

import java.util.regex.Pattern;

/**
 * 그룹을 이름으로 캡쳐하는 패턴
 */
public class ExamRegex8 {
    public static void main(String[] args) {
        var s = "휴대폰은 010-222-0000입니다. 집전화는 031-123-4567입니다.";
        var ptn = Pattern.compile("(?<area>\\d{2,4})-(?<city>\\d{2,4})-(?<local>\\d{4})");
        var match = ptn.matcher(s);

        while (match.find()) {
            System.out.println("시작위치: " + match.start());
            System.out.println("종료위치: " + match.end());
            System.out.println("매칭문자열: " + match.group());
            System.out.println("앞자리번호 : " + match.group("area"));
            System.out.println("중간번호: " + match.group("city"));
            System.out.println("끝자리번호: " + match.group("local"));
        }
    }
}
