package lec14Final;
/**
 * 遍历目录
 */

import java.io.File;

public class FileDemo {
    public static void main(String[] args) {
        File f = new File("C:/");
        System.out.println(f.isDirectory());
        System.out.println(f.length());
        for (String file : f.list())
            if (file.endsWith(".mp3"))
                System.out.println(file);
    }
}
