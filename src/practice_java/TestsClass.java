package practice_java;

public class TestsClass {

	public static void main(String[] args) {

		EncapsulationPractice obj = new EncapsulationPractice();
		obj.setName("Khalid Hadizada");
		obj.setPhoneNumber("0730303030");
		System.out.println(obj.getName());
		System.out.println(obj.getPhoneNumber());

		System.out.println("---------");
		
		ExerciseEncapsulation encp = new ExerciseEncapsulation("Toyota", "Camry", 2023, "AFGBOY77");
		System.out.println(encp.getMake());
		System.out.println(encp.getModel());
		System.out.println(encp.getYear());
		System.out.println(encp.getLicensePlate());
	}
}
