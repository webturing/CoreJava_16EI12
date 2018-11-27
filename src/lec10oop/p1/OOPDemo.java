package p1;

//封装: 
class Person {//类=数据(字段)+操作(函数、方法)	
	String name;//membered field
	int age;//membered field
	void growup(){	//membered method
		age++;
	}
	void show(){//membered method
		System.out.println("Name="+name+",age="+age);
	}
}

public class OOPDemo {
	public static void main(String[] args) {
		Person tom=new Person();//构造方法
		tom.name="Tom";
		tom.age=18;
		tom.show();
		tom.growup();
		tom.show();
		Person jerry=new Person();
		jerry.name="Jerry";
		jerry.age=16;
		//Person bob = null;
		//System.out.println(bob.name);//java.lang.NullPointerException
		
	}
}
