package lec14Final;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

/**
 * 字符文件写入
 */
public class FileWriterDemo {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("2.txt", true);
        fw.write((int) ('a'));
        fw.append("hello world");
        fw.append(new Date().toLocaleString());
        fw.close();
    }
}
