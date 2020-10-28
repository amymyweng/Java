package tw.myweng.javaproject.oop.encapsulation;

public class TestConstructorEx1 {
	
	public TestConstructorEx1() {
		this(6);  //呼叫此class的其他constructor
		System.out.println("test");
	}
	
	public TestConstructorEx1(int num) {
		System.out.println("test:" + num);
	}

	public static void main(String[] args) {		
		//TestConstructorEx1 test2 = new TestConstructorEx1(7);	
		
		TestConstructorEx1 test1 = new TestConstructorEx1();
		test1.action();
		
		new TestConstructorEx1().action();
		//anonymous object  (可少寫一行，執行一次與上兩行寫法效能一樣
		//					但執行多N次就會配置N次記憶體，耗效能)
		
//		int i=1;
//		i=i+1;
//		System.out.println("i=" + i);
//		System.out.println("i=" + (1+1));
	}

	public void action() {
		System.out.println("Action");
	}
}