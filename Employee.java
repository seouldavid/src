
public class Employee {

	public static int id = 0;
	String name = "";
	int Salary = 300;
	static String cloth = "양복";
	public Employee() {
		
	}
	public Employee(int k) {
		
	}
	
	public static int getId() {
		return id;
	}
	
	
	public static void setId(int id) {
		Employee.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}
	public static String getCloth() {
		return cloth;
	}
	public static void setCloth(String cloth) {
		Employee.cloth = cloth;
	}
	
	
	
}
