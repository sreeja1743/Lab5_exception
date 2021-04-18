package Lab5;

import java.util.*;

public class MainAge {
	
     public static void main(String[] args) throws Exception {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Choose");
			System.out.println("1)To validate age:");
			System.out.println("2)Exit");
			switch(sc.nextInt()) {
			case 1: System.out.println("Enter the age:");
			        int age = sc.nextInt();
			        if(age > 15) {
			        	System.out.println("Eligible");
			        }
			        else
			        	throw new Age(age);
			        break;
			case 2: System.exit(0);
			}
		}
	}
     
}
