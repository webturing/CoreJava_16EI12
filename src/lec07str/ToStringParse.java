package lec07str;

import java.util.Arrays;

public class ToStringParse {
    /**
     * String split
     *
     * @param args
     */
    public static void main(String[] args) {
        String data = "2018/11/13";
        String dt[] = data.split("/");
        System.out.println(Arrays.toString(dt));
        int y = Integer.parseInt(dt[0]);
        System.out.println(y);
        String t = Integer.toString(10 * y);
        System.out.println(t);
    }
}
