package tw.myweng.javaproject.oop.encapsulation;

class PersonalProfiles{
	private String name = "mary";
	public int age = 18;
	public void setName(String name) {
		this.name = name;
	}
}

public class CallTestEncapsulationEx2 {

	public static void main(String[] args) {
		PersonalProfiles pp1 = new PersonalProfiles();
//		System.out.println(pp1.name);  //Error: Unresolved compilation problem: 
		pp1.age += 1 ; 
		System.out.println("pp1.age:" + pp1.age);
	}

}
