package firstjava;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;

public class ReadFile2 {
    public static void main(String[] args) throws IOException {
        var p = Path.of("test.txta");
        String s;
        try {
            s = Files.readString(p);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } /* catch (NoSuchFileException e) {
            System.out.println("파일을 찾을 수 없음: "+ e.getFile());
            System.out.println(e.getMessage());
            return;
        } */
        //System.out.println(s);
    }
}
