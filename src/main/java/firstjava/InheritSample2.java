package firstjava;

import java.util.List;

public class InheritSample2 {
    static abstract class User {
        String name;

        public User(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        abstract String profile();

        @Override
        public String toString() {
            return profile();
        }
    }
    static class Student extends User {
        int score;
        Student(String name, int score) {
            super(name);
            //this.name = name;
            this.score = score;
        }
        public int getScore() {
            return score;
        }

        @Override
        String profile() {
            return "학생: %s, %d 점".formatted(getName(), getScore());
        }
    }
    static class Teacher extends User {
        String subject;
        Teacher(String name, String subject) {
            super(name);
            //this.name = name;
            this.subject = subject;
        }
        public String getSubject() {
            return subject;
        }

        @Override
        String profile() {
            return "선생님 %s, 교과목: %s".formatted(getName(), getSubject());
        }
    }
    public static void main(String[] args){
        List<User> people = List.of(
                new User("dummy") {
                    @Override
                    String profile() {
                        return "dummy";
                    }
                },
                new Student("sage", 89),
                new Teacher("Lee", "English"));
        for (var p : people) {
            System.out.println("안녕하세요 %s 님".formatted(p.getName()));
            System.out.println(p);
        }

    }
}
