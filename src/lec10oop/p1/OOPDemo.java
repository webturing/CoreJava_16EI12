package p1;

//???: 
class Person {//??=????(???)+????(??????????)	
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
        Person tom = new Person();//??????
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
