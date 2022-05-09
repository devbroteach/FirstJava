package firstjava;

import java.util.Arrays;

public class ExamRegex14 {
    public static void main(String[] args) {
        String s = "jfslj47924fjslk24729djldja492824";
        String regex = "[0-9]+";
        System.out.println(Arrays.toString(s.split(regex)));
    }
}
