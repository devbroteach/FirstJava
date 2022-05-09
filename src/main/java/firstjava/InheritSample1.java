package firstjava;

import java.util.List;

public class InheritSample1 {
    static class User {
        String name;
        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return "%s = %s".formatted(getClass().getSimpleName(), getName());
        }
    }
    static class Student extends User {
        int score;
        Student(String name, int score) {
            this.name = name;
            this.score = score;
        }
        public int getScore() {
            return score;
        }
    }
    static class Teacher extends User {
        String subject;
        Teacher(String name, String subject) {
            this.name = name;
            this.subject = subject;
        }
        public String getSubject() {
            return subject;
        }
    }
    public static void main(String[] args){
        List<User> people = List.of(
                new Student("sage", 89),
                new Teacher("Lee", "English"));
        for (var p : people) {
            System.out.println("안녕하세요 %s 님".formatted(p.getName()));
            System.out.println(p);
        }



    }
}
