package lec14Final;
/**
 * 字符文件拷贝
 */

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterFileCopy {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("src.java");
        FileWriter fw = new FileWriter("3.txt");

        int x;
        while ((x = fr.read()) != -1) {
            fw.write(x);
        }

        fw.close();
        fr.close();

    }
}
