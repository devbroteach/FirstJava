package firstjava;

public class IfSample {
    public static void main(String[] args) {
        var a = 8;
        if(a<3) {
            System.out.println(" 작다");
        } else if (a < 7) {
            System.out.println(" 보통");
        } else {
            System.out.println(" 크다");
        }
    }
}
