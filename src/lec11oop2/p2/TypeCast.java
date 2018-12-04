package lec11oop2.p2;

public class TypeCast {
    public static void main(String[] args) {
        Student s = new Student("unnamed", 0);
        s.age++;
        s.name = "tom";

        Person p = s;
        p = new Person();
        if (p instanceof Student) {
            Student q = (Student) p;
        }

    }
}
