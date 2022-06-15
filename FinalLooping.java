
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

interface Ball {

	void PrintMe();
}

abstract class Apple {

	String name;
	int pincode;
	String city;
	String date;

	public void PrintMe() {
	        System.out.println(this.name);
		System.out.println(this.pincode);
		System.out.println(this.city);
	}
}

public class FinalLooping {

	public static void main(String args[]) {

		boolean exit = false;
	        Scanner sc = new Scanner(System.in);
		System.out.print("enter exit or, continue ");
		String result = sc.next();
		
		if (!"exit".equals(result)) {
		} 
		
		else {
		exit = true;
		
	        }
	        {
		      while(!exit){
		System.out.print("enter your Name: ");
		Scanner name = new Scanner(System.in);
		name.nextLine();

		System.out.print("enter your pincode: ");
		Scanner pincode = new Scanner(System.in);
		pincode.nextLine();

		System.out.print("enter your city: ");
		Scanner city = new Scanner(System.in);
		city.nextLine();

		System.out.print("D.O.B in YYYY-MM-DD: ");
		Scanner date = new Scanner(System.in);
		String input = date.nextLine();

		LocalDate dob = LocalDate.parse(input);
		System.out.println("Age is:" + getAge(dob));
		}
	}
}
		
	private static int getAge(LocalDate dob) {
		LocalDate curDate = LocalDate.now();
		return Period.between(dob, curDate).getYears();
	}


}	
/// unsaved

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

interface Ball {

	void PrintMe();
}

abstract class Apple {

	String name;
	int pincode;
	String city;
	String date;

	public void PrintMe() {
	        System.out.println(this.name);
		System.out.println(this.pincode);
		System.out.println(this.city);
	}
}

public class FinalLooping {

	public static void main(String args[]) {

		boolean exit = false;
	        Scanner sc = new Scanner(System.in);
		System.out.print("enter exit or, continue ");
		String result = sc.next();
		
		if (!"exit".equals(result)) {
		} 
		
		else {
		exit = true;
		
	        }
	       
 {
	        while(!exit){
		System.out.print("enter your Name: ");
		Scanner name = new Scanner(System.in);
		name.nextLine();

		System.out.print("enter your pincode: ");
		Scanner pincode = new Scanner(System.in);
		pincode.nextLine();

		System.out.print("enter your city: ");
		Scanner city = new Scanner(System.in);
		city.nextLine();

		System.out.print("D.O.B in YYYY-MM-DD: ");
		Scanner date = new Scanner(System.in);
		String input = date.nextLine();

		LocalDate dob = LocalDate.parse(input);
		System.out.println("Age is:" + getAge(dob));
		}
	}
}
		
	private static int getAge(LocalDate dob) {
		LocalDate curDate = LocalDate.now();
		return Period.between(dob, curDate).getYears();
	}


}	
