package lec14Final;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class FieReaderDemo {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader(new File("1.txt"));
        int x;
        while ((x = fr.read()) != -1) {
            System.out.print((char) (x));
        }
        fr.close();
    }
}
