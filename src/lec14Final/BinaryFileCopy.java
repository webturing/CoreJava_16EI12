package lec14Final;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 无缓冲的字节文件拷贝
 */
public class BinaryFileCopy {
    public static void main(String[] args) throws IOException {

        long start = System.currentTimeMillis();

        FileInputStream fis = new FileInputStream(new File("calc.exe"));
        FileOutputStream fos = new FileOutputStream(new File("my.exe"));

        int x;
        while ((x = fis.read()) != -1)
            fos.write(x);


        fos.close();
        fis.close();
        long end = System.currentTimeMillis();

        System.out.println((end - start) / 1000.0);


    }
}
