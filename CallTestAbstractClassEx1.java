package tw.myweng.javaproject.oop.abstractClass;

abstract class Company{
	public abstract void calFuel();
	public abstract void calDistance();
	
}

class Truck extends Company{
	
	@Override
	public void calFuel() {
	    System.out.println("Truck calculates Fuels.");
	}

	@Override
	public void calDistance() {
		System.out.println("Truck calculates Distances.");
	}
	int employeeNum = 0;
	
}

class CargoShip extends Company{
	@Override
	public void calFuel() {
	    System.out.println("CargoShip calculates Fuels.");
	}

	@Override
	public void calDistance() {
		System.out.println("CargoShip calculates Distances.");
	}	
}

public class CallTestAbstractClassEx1 {

	public static void main(String[] args) {
		Truck toyota = new Truck();
		toyota.calFuel();
		toyota.calDistance();
		
		CargoShip ship = new CargoShip();
		ship.calFuel();
		ship.calDistance();
	}

}
