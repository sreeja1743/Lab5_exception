package Lab5;

import java.util.Scanner;

public class EmpMain {
    

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Choose");
			System.out.println("1)To validate name:");
			System.out.println("2)Exit");
			switch(sc.nextInt()) {
			case 1: //System.out.println("Enter the first name:");
			        String firstName = null;
			        //System.out.println("Enter the Last name:");
			        String lastName = null;
			        if(firstName.equals(null) && lastName.equals(null)) {
			        	throw new EmpName();
			        }
			        else
			        	System.out.println("Employee name "+firstName+" "+lastName);
			        break;
			case 2: System.exit(0);
			}
	}
}
}
