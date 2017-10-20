package java8.main;

public class Employee {

	String name;
	int age;
	
	public Employee(String name,int age){
		this.name = name;
		this.age = age;
	}

	String getName(){
		return name;
	}

	public int getAge(){
		return age;
	}

	@Override
	public String toString() {
		return "Employee{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}
}
