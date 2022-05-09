package firstjava;

import java.util.ArrayList;
import java.util.List;

public class StreamSample3 {
    public static void main(String[] args) {
        var data = List.of("apple", "orange", "watermelon");

        /*
        //exam1
        var result = new ArrayList<String>();
        for (String s : data) {
            if(s.length() >= 5) {
                result.add(s);
            }
        }

         */
        /*
        // exam3
        var result =  0;
        for(String s: data) {
            if(s.length() >= 5) {
                result++;
            }
        }

         */
        /*
        // exam 4
        for(String s: data) {
            if(s.length() >= 5) {
               if(s.contains("p")) {
                   System.out.println("p포함");
               }
            }
        }
        */
        // exam5
        for(String s: data) {
            if(s.length() >= 7) {
                if(s.contains("w")) {
                    System.out.println(s.toString());
                    System.out.println("p포함");
                }
            }
        }

    }
}
