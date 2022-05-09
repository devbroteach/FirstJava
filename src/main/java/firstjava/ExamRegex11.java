package firstjava;

/**
 * 문자열 대체
 * replaceAll 메소드
 */
public class ExamRegex11 {
    public static void main(String[] args) {
        var s = "문의는 여기 https://devbro.xyz로 해주세요.";
        System.out.println(s.replaceAll("(?i)http(s)?://([\\w-]+\\.)+[\\w-]+(/[\\\\w ./?%&=-]*)?",
                "<a href=\"$0\">$0</a>"));
    }
}
