package callmethodbymethod;

public class Employee {
	
	String name, address;
	
	public Employee(String name, String address){
		this.name=name;
		this.address=address;
	}
	public Employee getName(){
		return new Employee(name, address);
	}
	public Employee setName(){
		return null;
	}
	
	public static void main(String[] args) {
		Employee e=new Employee("Ashish", "Pune");
		e.getName().setName();
	}

}
