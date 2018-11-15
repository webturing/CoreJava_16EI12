package lec02ioandExpression;

public class FormatedOutput {
    public static void main(String[] args) {
        double x = Math.PI * 100000;
        System.out.println(x);
        System.out.printf("%8.3f\n", x);

        System.out.println(String.format("%8.3f", x));
        String str2 = "" + 3;
        System.out.println(str2);


    }
}
