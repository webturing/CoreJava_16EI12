package lec14Final;

import java.io.*;

/**
 * 有缓冲的字节文件拷贝（接近OS的效率）
 */
public class BufferedFileCopy {
    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(
                new File("D:/ubuntu-14.04.4-server-i386.iso")));
        BufferedOutputStream fis = new BufferedOutputStream(
                new FileOutputStream(new File("my2.iso")));
        int x;
        while ((x = bis.read()) != -1)
            fis.write(x);

        bis.close();
        fis.close();

        long end = System.currentTimeMillis();
        System.out.println((end - start) / 1000.0);

    }
}
