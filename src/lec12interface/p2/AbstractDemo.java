package lec12interface.p2;

/**
 * 当一个类包含抽象方法(没有实现体{})该类就叫抽象类
 * 抽象类不可实例化
 */
abstract class Person {
    String name;
    int age;

    abstract void work();

    void g() {

    }
}

class Student extends Person {

    @Override
    void work() {
        System.out.println("Study hardly!");

    }

}

public class AbstractDemo {
    public static void main(String[] args) {
        Person a = new Student();
        a.work();
        Person b = new Person() {//匿名类
            @Override
            void work() {
                // TODO Auto-generated method stub

            }

        };
        b.work();
    }
}
