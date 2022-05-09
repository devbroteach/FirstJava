package firstjava;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;

public class ReadFile {

    public static void main(String[] args) throws IOException {
        try {
            var p = Path.of("test.txta");
            String s = Files.readString(p);
            System.out.println(s);
        } catch (NoSuchFileException e) {
            //throw new RuntimeException(e);
            System.out.println("파일 찾을 수 없음: " +  e.getFile());
        }
    }
}
