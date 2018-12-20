package lec12interface.p2;

/**
 * final 修饰方法，表示该方法不可以被子类重载
 */
class A {
    final void g() {
    }

    void f() {
        System.out.println("A::f() called");
    }
}

class B extends A {
    //void g()//Cannot override the final method from A
    {

    }

    void f() {
        System.out.println("B::f() called");
    }
}

public class FinalDemo {
    public static void main(String[] args) {
        A a = new B();
        a.f();
    }
}
