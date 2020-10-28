package tw.myweng.javaproject.oop.encapsulation;
class PersonalProfiles2{
	private String name = "mary";
	private int age = 18;
	private int gender = 1; 

//name
	public void setName(String name) {
		//...
		this.name = name;
	}
	
	public String getName() {
		//...
		return name;
	}
//age
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}
}

public class CallTestEncapsulationEx2 {

	public static void main(String[] args) {
		PersonalProfiles2 pp2 = new PersonalProfiles2();
		
		pp2.setName("julia");
		pp2.setAge(24);
		
		String yourName = pp2.getName();
		int yourAge = pp2.getAge();
		
		System.out.println("yourName:" + yourName);
		System.out.println("yourAge:" + yourAge);
	}

}
