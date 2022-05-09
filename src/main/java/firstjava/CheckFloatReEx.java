package firstjava;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckFloatReEx {

        static Pattern pat = Pattern.compile("(0|[1-9][0-9]*)(\\.[0-9]+)?");
        static boolean check(String data) {
            Matcher mat = pat.matcher(data);
            return mat.matches();
        }

        public static void main(String[] args) {
            System.out.println(check(""));     // false
            System.out.println(check("012"));  // false
            System.out.println(check(".12"));  // false
            System.out.println(check("12."));  // false
            System.out.println(check("1.2.3"));// false
            System.out.println(check("1..3")); // false
            System.out.println(check("0"));    // true
            System.out.println(check("12"));   // true
            System.out.println(check("12.3")); // true
            System.out.println(check("0.3"));  // true
            System.out.println(check("12.30"));// true
        }
}
