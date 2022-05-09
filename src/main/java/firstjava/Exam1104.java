package firstjava;

public class Exam1104 {
    /**
     *  문자열을 받고 숫자 이외는 그대로 출력
     *  숫자가 오면 이전 문자를 해당 숫자에 1을 더한 문자수만큼 출력
     */

    public static void main(String[] args) {
        var data = "ab0c1ba2bc9cd9";
        char t = 0;

        for (char ch : data.toCharArray()) {
            if (ch > 90) {
                System.out.print(ch);
            } else {
                System.out.print(String.valueOf(t).repeat(ch - 47));
            }
            t = ch;
        }

    }

}
