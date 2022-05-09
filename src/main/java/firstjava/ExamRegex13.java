package firstjava;

public class ExamRegex13 {
    public static void main(String[] args) {
        String s = "010-1111-2222";
        String[] s2 = s.split("-");
        for(String str: s2) {
            System.out.print(str);
        }
    }
}
