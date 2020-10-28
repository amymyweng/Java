package tw.myweng.javaproject.oop.inheritance;

class Parent extends Object{
	String name = "mike";
	private int age = 32;
	
	public Parent() {
		super();
		System.out.println("action1");
	}
	
	public Parent(int level) {
		super();
		System.out.println("action2");
	}
	
	public void sayHello() {
		System.out.println("hola," + name + " age:" + age);
	}
}

class Child extends Parent{
	
	public Child() {
		super(1);
		System.out.println("Child constructor content.");
	}
	
	public void read() {
		System.out.println("study hard for java");
	}
}

public class CallTestInheritanceEx1 {

	public static void main(String[] args) {
       Child child1 = new Child();
       child1.name = "michelle";
       //child1.age = 36; //compile error
       child1.sayHello();
       child1.read();
	}

}
