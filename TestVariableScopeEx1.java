package tw.myweng.javaproject.oop.method;

public class TestVariableScopeEx1 {
	
	int a=1;  //instance variable
	static int b=2;  //static variable(class variable)
	
	//instance method
	public void f1(int c) { //local variable
	   int d=4; //local variable 
	   
	   System.out.println("a:" + a);
	   System.out.println("b:" + b);
	   System.out.println("c:" + c);
	   System.out.println("d:" + d);
	}

	public static void main(String[] args) {
		System.out.printf("%d\n", b);
		TestVariableScopeEx1 scope = new TestVariableScopeEx1();
		scope.f1(3);
		System.out.println("finished");
		String a = "abc";
		
	}

}
