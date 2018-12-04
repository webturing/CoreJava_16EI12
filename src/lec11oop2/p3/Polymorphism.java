package lec11oop2.p3;

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

    public void work() {
        System.out.println("Person::work");
    }
}

class Student extends Person {
    public Student(String name, int age) {
        super(name, age);
    }

    @Override
    public void work() {
        System.out.println("Student.work");
    }
}

class Teacher extends Person {
    public Teacher(String name, int age) {
        super(name, age);
    }

    @Override
    public void work() {
        System.out.println("Teacher.work");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Person student = new Student("Tom", 18);
        Person teacher = new Teacher("Linus", 46);
        System.out.println(student);
        System.out.println(teacher);
        student.work();
        teacher.work();
    }
}
