package lec14Final;

import java.util.Arrays;

public class IPChecker {
    public static void main(String[] args) {
        String ip = "192.abc.1.2";
        String ips[] = ip.split("\\.");
        System.out.println(Arrays.toString(ips));
        boolean flag = check(ips);
        System.out.println(flag);
    }

    private static boolean check(String[] ips) {
        if (ips.length != 4)
            return false;
        for (int i = 0; i < ips.length; i++) {
            if (!check(ips[i]))
                return false;
        }
        return true;
    }

    private static boolean check(String ip) {
        Integer i;
        try {
            i = Integer.parseInt(ip);
        } catch (NumberFormatException e) {
            return false;
        }
        return i <= 255 && i >= 0;
    }
}
