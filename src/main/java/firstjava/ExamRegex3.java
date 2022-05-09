package firstjava;

import java.util.regex.Pattern;

/**
 * 일치하느 문자열 추출
 * 패턴클래스의 컴팩트 메소드에서 패턴 객체
 * while(match.find()) - find메소드가 false가 될때까지 일치하는 것을 체크하는 것을 반복하여 문자열 시작 및 끝, 일치문자열 가져옴
 */
public class ExamRegex3 {
    public static void main(String[] args) {
        var s = "휴대폰은 010-222-0000입니다. 집전화는 031-123-4567입니다.";
        var ptn = Pattern.compile("(\\d{2,4})-(\\d{2,4})-(\\d{4})");
        var match = ptn.matcher(s);

        while(match.find()) {
            System.out.println("시작위치: "+ match.start());
            System.out.println("종료위치: "+ match.end());
            System.out.println("매칭문자열: "+ match.group());
            System.out.println("앞자리번호 : " + match.group(1));
            System.out.println("중간번호: " + match.group(2));
            System.out.println("끝자리번호: " + match.group(3));
        }
    }
}
