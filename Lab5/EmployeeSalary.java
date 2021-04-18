package Lab5;

public class EmployeeSalary extends Exception {
	private double salary;
     public EmployeeSalary(double salary) {
    	 this.salary = salary;
     }
     public String toString() {
    	 return "salary is "+salary+" less than 3000 ";
     }
}
