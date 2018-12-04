package lec11oop2.p1;

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
        this("Unnamed", 0);
    }

    @Override
    public String toString() {
        return String.format("%6s %d", this.name, this.age);
    }
}

public class Encapsulation2 {
    public static void main(String[] args) {
        Person tom = new Person();
        System.out.println(tom);
        tom.name = "Tom";
        tom.age++;
        System.out.println(tom);//tom.toString()
    }
}
