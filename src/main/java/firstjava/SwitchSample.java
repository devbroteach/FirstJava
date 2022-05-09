package firstjava;

public class SwitchSample {
    public static void main(String[] args) {
        var a = 3;

        switch (a) {
            case 1, 2 -> System.out.println("1, 2,");
            case 3 -> System.out.println("3");
            case 4 -> System.out.println("4");
            case 5 -> System.out.println("5");
            default -> System.out.println("기타");
        }
    }
}
