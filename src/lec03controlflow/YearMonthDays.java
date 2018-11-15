package lec03controlflow;

import java.util.Scanner;

public class YearMonthDays {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int year = cin.nextInt();
        int month = cin.nextInt();
        int days = -1;
        if (month < 1 || month > 12) {

        } else if (month == 1 || month == 3 || month == 5 || month == 7
                || month == 8 || month == 10 || month == 12) {
            days = 31;
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            days = 30;
        } else if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            days = 29;

        } else {
            days = 28;
        }

        if (days < 0) {
            System.out.println("Error");
        } else {
            System.out.println(days);
        }

    }
}
