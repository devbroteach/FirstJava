package firstjava;

import java.util.Arrays;

public class Exam1102 {

    public static void main(String[] args) {
        int[] n = {3, 6, 9, 4, 2, 1, 5};

        for(int i=0; i<n.length-1; i++){
            if(n[i] < n[i+1]) {
                n[i] = n[i+1];
            }
        }
        System.out.println(Arrays.toString(n));
    }

}
