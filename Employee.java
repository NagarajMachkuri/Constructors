public class Employee{

	String name;
	double salary;

public Employee(String name, double salary){

	this.name = name;
	this.salary = salary;

	if (salary<0){
	salary=0;
}
}
public void displayDetails(){	
	System.out.println(" Employee name :" +name);
	System.out.println(" Employee salary :" + salary);	
}

public static void main(String [] args){

Employee emp= new Employee("Nagaraj",5000);
	emp.displayDetails();

}



}