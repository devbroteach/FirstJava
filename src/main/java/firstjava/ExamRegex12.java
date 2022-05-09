package firstjava;

public class ExamRegex12 {
    public static void main(String[] args) {
        String s = "abc$de@fgh0ijk^lmn";
        String[] s2 = s.split("[^a-zA-Z]");
        for(String str : s2) {
            System.out.println(str);
        }
    }
}
