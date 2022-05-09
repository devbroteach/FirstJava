package firstjava;

/**
 * 소수점 판단 패턴
 * \\d+ => 숫자 다수
 * \\.
 * (\\.\\d+)? =>괄호안에 0개 또는 1개
 */
public class ExamRegex15 {
    public static void main(String[] args) {
        String s = "12.5";
        String regex = "\\d+(\\.\\d+)?";
        if(s.matches(regex))  {
            System.out.println(Double.parseDouble(s));
        } else {
            System.out.println("double아님!");
        }
    }
}
