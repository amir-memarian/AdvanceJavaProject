package io;

import org.junit.jupiter.api.Test;

import java.io.*;
import java.nio.charset.StandardCharsets;

import static java.lang.System.out;
import static org.assertj.core.api.Assertions.assertThat;

public class FileWriterTest {

    public static final String FILE_NAME = "test.txt";
    public static final String SENTENCE = "Hello World!";

    @Test
    void Should_Write_in_a_file() {
/*        FileOutputStream fileOutputStream=null;
        try {
            fileOutputStream = new FileOutputStream("test.txt");
            fileOutputStream.write("Hello World!".getBytes(StandardCharsets.UTF_8));
//        } catch (FileNotFoundException e) {
//            System.out.println("the file test.txt Does not exist.");
//            throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.println("there is a problem with test.txt file.");
            throw new RuntimeException(e);
        } finally {
            try {
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
*/
        try (FileOutputStream fileOutputStream = new FileOutputStream(FILE_NAME);
             FileInputStream fileInputStream = new FileInputStream(FILE_NAME)){ //java 7

            fileOutputStream.write(SENTENCE.getBytes(StandardCharsets.UTF_8));

            int read = 0;
            StringBuilder helloWorld = new StringBuilder();
            while((read = fileInputStream.read()) != -1){
                helloWorld.append((char) read);
            }
            assertThat(helloWorld.toString()).isEqualTo(SENTENCE);
        } catch (IOException e) {
            out.println("there is a problem with test.txt file.");
            throw new RuntimeException(e);
        }
    }
}
