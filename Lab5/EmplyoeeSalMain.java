package Lab5;

import java.util.Scanner;

public class EmplyoeeSalMain {
	
   public static void main(String[] args) throws Exception {
	   Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Choose");
			System.out.println("1)To validate salary:");
			System.out.println("2)Exit");
			switch(sc.nextInt()) {
			case 1: System.out.println("Enter the salary:");
			       double salary = sc.nextDouble();
			        if(salary < 3000) {
			        	throw new EmployeeSalary(salary);
			        }
			        else
			        	System.out.println("Employee salary "+salary);
			        break;
			case 2: System.exit(0);
			}
   }
}
}
