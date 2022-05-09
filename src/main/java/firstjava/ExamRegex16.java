package firstjava;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ExamRegex16 {
    public static void main(String[] args) {
        String s = "2022-05-01";
        String regex = "\\d{4}\\-\\d{2}\\-\\d{2}";
        if(s.matches(regex)) {
            try {
                System.out.println(new SimpleDateFormat("yyyy-MM-dd").parse(s));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("날짜 아님!");
        }
    }
}
