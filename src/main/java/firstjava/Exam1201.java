package firstjava;

import java.util.List;

public class Exam1201 {
    @FunctionalInterface
    interface Named {
        String name();

        default String greeting() {
            return "Hi %s".formatted(name());
        }
    }
    static void msg(Named named) {
        System.out.println("Hello " + named.name());
    }
    record Staff(String name, String job) implements Named {}
    record Student(String name, int score) implements Named { }
    record Teacher(String name, String subject) implements Named { }

    interface Figure {
        int width();
        int height();
    }

    record Box(int width, int height) {}
    record Oval(int width, int height) {}

    public static void main(String[] args) {
        var people = List.of(new Student("sage", 88), new Teacher("hong",
                "Math"), new Staff("test", "driver") );

        for(Named p : people) {
            var n = p.name();
            var m = p.greeting();
            System.out.println("안녕하세요 %s 님".formatted(n));
            System.out.println(m);
        }

        msg(() -> "no name");

        msg(new Named() {
            @Override
            public String name() {
                return "no name";
            }
        });
        msg(new Student("sage", 90));
    }
}
