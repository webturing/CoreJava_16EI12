package lec03controlflow;

public class BreakDemo {
    public static void main(String[] args) {
        int x = 0;
        while (x < 10) {
            if (x == 5)
                continue;
            System.out.println(x);
            x++;

        }
    }
}
