package practice_java;

public class TestingEncapsulation {
	
	public static void main(String[] args) {
		
		EncapsulationPractice obj = new EncapsulationPractice();
		obj.setName("Israr Akhundzada");
		obj.setPhoneNumber("7579155588");
		System.out.println(obj.getName());
		System.out.println(obj.getPhoneNumber());
	}
}
