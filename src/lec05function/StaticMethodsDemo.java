package lec05function;

class A {
    public static int add(int a, int b) {
        return a * a + b * b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    static void dodo() {
        StaticMethodsDemo.main(null);
    }

}

public class StaticMethodsDemo {
    static int add(int a, int b, int c) {//ok;
        return a + b + c;
    }

    static int add(int a, int b) {//Function with return-value
        return a + b;
    }

    static void doSomething() {//Function without return-value
        int a = 3, b = 4;
        int c = add(a, b);
        System.out.println(c);
    }

    public static void main(String[] args) {
        doSomething();
        System.out.println(StaticMethodsDemo.add(1, 2, 3));
        System.out.println(A.sub(7, 2));
        System.out.println(Math.sqrt(2));
        System.out.println(add(1, 2));
        //A.dodo();
    }
}