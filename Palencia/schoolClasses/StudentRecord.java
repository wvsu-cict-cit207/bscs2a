package schoolClasses;
	
	public class StudentRecord {
	private String name;
	private String address;
	private int age;
	private double OOPGrade;
	private double DiscreteGrade;
	private double DataStructGrade;
	private double average;
	private static int studentCount;

	public String getName(){
	return name;
	}

	public void setName( String temp ){
	name = temp;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String temp) {
		address= temp;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int temp) {
		age = temp;
	}
	public double getOOPGrade() {
		return OOPGrade;
	}
	public void setOOPGrade(int temp) {
		OOPGrade = temp;
	}
	public double getDiscreteGrade() {
		return DiscreteGrade;
	}
	public void setDiscreteGrade(double temp) {
		DiscreteGrade = temp;
	}
	public double getDataStructGrade() {
		return DataStructGrade;
	}
	public void setDataStructGrade(double temp) {
		DataStructGrade = temp;
	}
	
	
	public double getAverage(){
	double result = 0;
	result = ( OOPGrade+DiscreteGrade+DataStructGrade )/3;
	return result;
	}

	public static int getStudentCount(){
	return studentCount;
		}
	
	public void print( String temp ){
		System.out.println("Name:" + name);
		System.out.println("Address:" + address);
		System.out.println("Age:" + age);
	}
		public void print(double OOPGrade, double DataGrade, double DiscreteGrade) {
		System.out.println("Name:" + name);
		System.out.println("OOP Grade:" + OOPGrade);
		System.out.println("Discrete Structure Grade:" + DataGrade);
		System.out.println("Data Structure Grade:" + DiscreteGrade);
		}

	}

