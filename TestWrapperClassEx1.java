package tw.myweng.javaproject.oop.wrapperclass;

public class TestWrapperClassEx1 {

	public static void main(String[] args) {
		int value = 123;
		Integer i1 = value;
		System.out.println("i1+1:" + (i1+1));
		
		String data = "test12345";
//		int num = Integer.parseInt(data);


		try {
			int num = Integer.parseInt(data);
			System.out.println("(num+1):" + (num + 1));
		} catch (Exception e) {
            System.out.println("Please Input Correct Number");
		}
	}

}
