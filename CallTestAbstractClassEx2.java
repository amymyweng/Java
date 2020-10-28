package tw.myweng.javaproject.oop.abstractClass;
/*
*  public void speedUp(int speed){ //byte, char, short, int
*    //...
*  }
*/

public class CallTestAbstractClassEx2 {

	public static void processAction(Company corp) {  //Company corp = toyota1; -> Company corp = new Truck();
		corp.calFuel();                               //Company corp = ship1; -> Company corp = new CargoShip(); 
		corp.calDistance();
	}
	
	public static void main(String[] args) {
//		Truck toyota1 = new Truck();
//		CallTestAbstractClassEx2.processAction(toyota1);
		CallTestAbstractClassEx2.processAction(new Truck());
		
		CargoShip ship1 = new CargoShip();
		CallTestAbstractClassEx2.processAction(ship1);
	}

}
