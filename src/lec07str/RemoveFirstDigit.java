package lec07str;

public class RemoveFirstDigit {
    public static void main(String[] args) {
        int y = 16655024;
        String s = Integer.toString(y).substring(1);
        int z = Integer.parseInt(s);
        System.out.println(z);
    }
}
