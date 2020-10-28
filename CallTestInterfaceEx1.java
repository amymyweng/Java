package tw.myweng.javaproject.oop.myinterface;

interface Flyer{
	public void takeOff();
	public void fly();
	public void land();
	default void move() {
		System.out.println("i can move.");
	}
}

class Butterfly implements Flyer {

	@Override
	public void takeOff() {
		System.out.println("Butterfly takes off.");
	}

	@Override
	public void fly() {
		System.out.println("Butterfly takes off.");
		
	}

	@Override
	public void land() {
		System.out.println("Butterfly takes off.");
		
	}
	
}

class Bird implements Flyer{
	@Override
	public void takeOff() {
       System.out.println("Bird takes off.");	
	}

	@Override
	public void fly() {
		System.out.println("Bird flies.");	
	}

	@Override
	public void land() {
		System.out.println("Bird lands.");	
	}	
}

class BirdChild extends Bird {
	public void eat() {
		System.out.println("i my hungry");
	}
}

class AirPlane implements Flyer{
	@Override
	public void takeOff() {
       System.out.println("AirPlane takes off.");	
	}

	@Override
	public void fly() {
		System.out.println("AirPlane flies.");	
	}

	@Override
	public void land() {
		System.out.println("AirPlane lands.");	
	}
}


public class CallTestInterfaceEx1 {

	public void processAction(Flyer f) {
		f.takeOff();
		f.fly();
		f.land();
		f.move();
		System.out.println("");
	}
	
	public static void main(String[] args) {
		CallTestInterfaceEx1 fun1 = new CallTestInterfaceEx1();
		fun1.processAction(new Bird());
		fun1.processAction(new AirPlane());
	}

}
