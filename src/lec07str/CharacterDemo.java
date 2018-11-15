package lec07str;

public class CharacterDemo {
    /**
     * Java Unicode and ASCII
     *
     * @param args
     */
    public static void main(String[] args) {
        for (int i = 0; i <= 255; i++) {//ASCII
            System.out.print((char) (i));
        }
        int i = 0;
        for (char c = Character.MIN_VALUE; c < Character.MAX_VALUE; c++) {
            System.out.print(c);
            if (++i % 256 == 0) {
                System.out.println();
            }
        }
    }
}
