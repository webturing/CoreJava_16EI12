package lec11oop2.p2;

public class InstanceOfDemo {
    public static void main(String[] args) {
        Object a = new Person();
        System.out.println(a instanceof Person);
        System.out.println(a instanceof Object);
        a = new Object();
        System.out.println(a instanceof Person);
        System.out.println(a instanceof Object);
    }
}
