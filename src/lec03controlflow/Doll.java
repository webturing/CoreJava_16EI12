package lec03controlflow;

public class Doll {
    public static void main(String[] args) {
        int first = 0, second = 0, fail = 0;
        for (int i = 0; i < 100000; i++) {
            double x = Math.random();
            if (x < 0.05) {
                ++first;
                //System.out.println("First Prize: Iphone X plus");
            } else if (x < 0.05 + 0.10) {
                //System.out.println("Second Prize:16 UDisk");
                ++second;
            } else {
                //System.out.println("Thank you !");
                ++fail;
            }
        }
        System.out.println(String.format("%d %d %d", first, second, fail));
    }
}
