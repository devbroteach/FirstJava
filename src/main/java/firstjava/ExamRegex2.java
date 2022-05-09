package firstjava;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 앞/뒤/부분 일치 정규식
 */
public class ExamRegex2 {
    public static void main(String[] args) {
        String s = "000012-345-6789";
        Pattern p = Pattern.compile(".*\\d{2,4}-\\d{2,4}-\\d{4}.*"); // 부분일치
        //Pattern p = Pattern.compile(".*\\d{2,4}-\\d{2,4}-\\d{4}"); //뒷부분 일치
        //Pattern p = Pattern.compile("\\d{2,4}-\\d{2,4}-\\d{4}"); //앞부분 일치
        Matcher m = p.matcher(s);

        System.out.println(m.find());
    }
}
