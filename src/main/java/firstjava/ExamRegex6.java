package firstjava;

import java.util.regex.Pattern;

/**
 * 구분하여 출력 패턴
 */
public class ExamRegex6 {
    public static void main(String[] args) {
        var s = "보고싶다\n보고싶다\n보고싶다\nYES";

        var ptn = Pattern.compile("^.+", Pattern.DOTALL);
        var match = ptn.matcher(s);

        while(match.find()) {
            System.out.println(match.group());
        }
    }
}
