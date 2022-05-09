package firstjava;

public class ForSample {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            if(i==2) {
                System.out.println("finish");
                break;
            }
            System.out.println(i);
        }
        /*
        for (int i = 20; i > 0; i-=3) {
            System.out.println(i);
        }

        int i = 0;
        while(i<5) {
            System.out.println(i);
            i++;
        }
         */
    }
}
