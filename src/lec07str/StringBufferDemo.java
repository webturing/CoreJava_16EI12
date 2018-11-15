package lec07str;

public class StringBufferDemo {
    /**
     * A simple tutorial for StringBuffer API
     *
     * @param args
     */
    public static void main(String[] args) {
        StringBuffer b = new StringBuffer("ABC");
        System.out.println(b.length());//3
        System.out.println(b.charAt(1));//'B'
        System.out.println(b.hashCode());
        b.setCharAt(1, 'D');
        System.out.println(b);//"ADC"
        System.out.println(b.hashCode());
        b.append('X');//"ADCX"
        System.out.println(b);
        b.append("YYYY");//"ADCXYYYY"
        System.out.println(b);
        b.deleteCharAt(3);//ADCYYYY
        System.out.println(b);
        b.reverse();
        System.out.println(b);//"YYYYCDA"
        String t = b.toString();
    }
}
