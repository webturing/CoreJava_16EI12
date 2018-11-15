package lec03controlflow;

public class ContinueDemo {
    public static void main(String[] args) {
        int x = 0;
        while (x < 10) {
            x++;
            System.out.println(x);

            if (x == 5)
                break;
        }
    }
}
