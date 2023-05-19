package practice_java;

public class ExerciseEncapsulation {

	private String make;
	private String model;
	private int year;
	private String licensePlate;

	public ExerciseEncapsulation(String make, String model, int year, String licensePlate) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.licensePlate = licensePlate;
	}

	public String getMake() {
		return this.make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return this.model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return this.year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getLicensePlate() {
		return this.licensePlate;
	}

	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}

}
