package firstjava;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class ClassSample1  {


    static final class Student {
        private String name;
        private final int score;

        Student(String name, int score) {
            this.name = name;
            this.score = score;
        }
        Student(String name) {
            this(name, 0);
            //this.name = name;
        }
        Student() {
            this("no name");
        }

        public String name() {
            return this.name;
        }
        public void setName(String name) {
            this.name = name;
        }

        public int score() {
            return score;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj == this) return true;
            if (obj == null || obj.getClass() != this.getClass()) return false;
            var that = (Student) obj;
            return Objects.equals(this.name, that.name) &&
                    this.score == that.score;
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, score);
        }

        @Contract(pure = true)
        @Override
        public @NotNull String toString() {
            return "Student[" +
                    "name=" + name + ", " +
                    "score=" + score + ']';
        }
    }

    public static void main(String[] args) {
        var s = new Student("sage", 88);

        System.out.println(s);

    }
}
