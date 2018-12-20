package lec14Final;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * 异常处理机制 try catch(可以多个）finally
 */
public class ExceptionDemo {
    public static void main(String[] args) {
        int a[] = {1, 2, 3};
        try {
            System.out.println(a[3]);
            // System.out.println(a[2]/0);
            FileInputStream fis = new FileInputStream(new File("C.txt"));
            // System.out.println(Math.sqrt(-1));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(a[2]);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticExpection");

        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException");
        } catch (Exception e) {

        } finally {
            System.out.println("Final Expection");
        }
    }
}
