package tw.myweng.javaproject.oop.override;

class Fish{
	public void eat() {
		System.out.println("eat food");
	}
	public void swim() {
		System.out.println("go");
	}
	
}
/*
 *  Annotation(標註): class, method, field上方 @功能名稱
 */
class Shark extends Fish{
	@Override
	public void eat() {
		System.out.println("eat human");
	}
}

public class CallTestOverrideEx1 {

	public static void main(String[] args) {
		Shark makoShark = new Shark();
		makoShark.eat();
		Fish fish2 = new Fish();
		fish2.eat();
	}

}