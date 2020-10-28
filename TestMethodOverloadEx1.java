package tw.myweng.javaproject.oop.method;

public class TestMethodOverloadEx1 {

	public static void play() {
		System.out.println("play");
	}
	
	public static void play(String name) {
		System.out.println("play:" + name);
	}
	
	public static void main(String[] args) {
//		TestMethodOverloadEx1 overload1 = new TestMethodOverloadEx1();
		TestMethodOverloadEx1.play();
		TestMethodOverloadEx1.play("Resident evil");
	}

}
