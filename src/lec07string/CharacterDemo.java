package lec07string;

public class CharacterDemo {
    public static void main(String[] args) {
        int i = 0;
        for (char c = Character.MIN_VALUE; c < Character.MAX_VALUE; c++) {
            System.out.print(c);
            if (++i % 256 == 0)
                System.out.println();
        }
    }
}
