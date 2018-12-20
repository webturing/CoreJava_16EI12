package lec14Final;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


public class FileInputStreamDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream(new File("1.txt"));
        int x;
        while ((x = fis.read()) != -1) {
            System.out.println((char) (x));
        }

        fis.close();
    }
}
