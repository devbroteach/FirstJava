package firstjava;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExamRegex9 {
    public static void main(String[] args) {
        String s1 = "My name is <div>Sage</div>";
        String s2 = "I am a <span>Human</span>";
        String s3 = "<span>Hello World</div>";
        String regex = "<(div|span)>.*?<\\/\\1>";

        Pattern p = Pattern.compile(regex);
        System.out.println("패턴: "+ regex);

        check(p, s1);
        check(p, s2);
        check(p, s3);

    }

    private static void check(Pattern p, String target) {
        Matcher m = p.matcher(target);

        if(m.find()) {
            System.out.println("Match! " + target);
        } else {
            System.out.println("Unmatch! " + target);
        }
    }
}
