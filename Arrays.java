

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		 
		Scanner osd=new Scanner(System.in);
		System.out.println("Enter the name");
		String name=osd.next();
		System.out.println("Id");
		int id=osd.nextInt();
		System.out.println("Enter the Address");
		String address = osd.next();
		System.out.println("Enter the Age");
		int age=osd.nextInt();
		System.out.println("Enter the Salaray");
		Float salary=osd.nextFloat();
		
		System.out.println("Name: "+name);
		System.out.println("Id: "+id);
		System.out.println("Address: "+address);
		System.out.println("Age: "+age);
		System.out.println("Salary: "+salary);
		
		

	}

}
