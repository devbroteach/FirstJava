package firstjava;

import java.util.regex.Pattern;

/**
 * 이전문자열과 마지막문자열 유무와 일치 판단 패턴
 *  - A(?=B): B -> A 바로뒤를 따르는 경우에만 A와 일치
 *  - A(?!B) -> A가 바로 뒤따르지 않는 경우에만 A와 일치
 *  - (?<=B)A -> A바로 앞에 B가 있는경우에만 A와 일치
 *  - (?<!B)A -> A직전에 B가 없는 경우에만 A와 일치
 */
public class ExamRegex10 {
    public static void main(String[] args) {
        var r1 = Pattern.compile("우리(?=예)");
        var r2 = Pattern.compile("우리(?!예)");
        var r3 = Pattern.compile("(?<=x)우리");
        var r4 = Pattern.compile("(?<!x)우리");

        var s1 = "우리는 인간이다x";
        var s2 = "우리는 과일입니다x 우리는 아무것도 없다x";

        match(r1, s1);
        match(r1, s2);
        match(r2, s1);
        match(r2, s2);
        match(r3, s1);
        match(r3, s2);
        match(r4, s1);
        match(r4, s2);

    }

    private static void match(Pattern ptn, String input) {
        var match = ptn.matcher(input);
        while(match.find()) {
            System.out.println(match.group());
        }
        System.out.println("======");
    }
}
