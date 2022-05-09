package firstjava;

public class Exam1103 {
    /**
     * 받은 문자열의 알파벳을 처음은 소문자로 출력하고
     * 0을 입력받으면 다음 알파벳 대문자
     * 1을 입력받으면 다음 알파벳 소문로 처리
     */
    public static void main(String[] args) {
         var data = "aa0bcd1efg1gg0abc";
         boolean isCheck = true;

         for (char ch : data.toCharArray()) {
             if(ch == '0') {
                 isCheck = false;
             } else if (ch == '1') {
                 isCheck = true;
             } else {
                 System.out.print(isCheck? ch : (char)(ch - 32));
             }
         }
    }
}
