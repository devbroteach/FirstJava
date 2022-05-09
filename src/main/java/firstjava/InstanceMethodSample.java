package firstjava;

public class InstanceMethodSample {

    record Student(String name, int englishScore, int mathScore) {
        int average() {
            return (this.englishScore() + this.mathScore()) / 2;
        }
        int sum() {
            return this.englishScore() + this.mathScore();
        }
        void showResult() {
            System.out.println(this.name() + "님의 평균점수는 " + average() + "점입니다.");
        }

        public int maxScore() {
            return Math.max(englishScore(), mathScore());
        }
    }

    public static void main(String[] args) {
        var sage = new Student("sage", 60, 80);
        var a = sage.average();
        var s = sage.sum();

        int max = sage.maxScore();



        System.out.println("합계: %d".formatted(s));
        System.out.println("평균점수: %d".formatted(a));
        System.out.println("최고점수: %d".formatted(max));
        sage.showResult();
    }


}
