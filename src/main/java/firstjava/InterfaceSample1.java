package firstjava;

import java.util.List;

public class InterfaceSample1 {
    interface Named {
        String name();
    }
    record Student(String name, int score) implements Named {
    }
    record Teacher(String name, String subject) implements Named {
    }

    static class Passenger implements Named {

        @Override
        public String name() {
            return  "지나감";
        }
    }

    public static void main(String[] args) {
        var people = List.of(new Student("sage", 88), new Teacher("hong",
                "Math"), new Passenger());
        for (Named p : people) {
            var n = p.name();
            System.out.println("안녕하세요 %s 님".formatted(n));
        }
    }
}
