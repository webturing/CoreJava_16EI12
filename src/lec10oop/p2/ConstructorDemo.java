package p2;
class Person{
	String name;//membered field
	int age;//membered field
	public Person(String name2, int age2) {
		this.name=name2;
		this.age=age2;
	}
	public Person(String name) {
		this.name=name;
		this.age=1;
	}
	public Person() {
		this.name="uname";
		
	}
	void growup(){	//membered method
		age++;
	}
	void show(){//membered method
		System.out.println("Name="+name+",age="+age);
	}
}
public class ConstructorDemo {
    public static void main(String[] args) {//????Overload
		Person tom=new Person("tom",18);
		tom.show();	
		Person peter=new Person("peter");
		peter.show();
		Person uname=new Person();
		uname.show();
	}
}
