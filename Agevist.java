import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

interface Registrations {
	void PrintMe();
}

abstract class Applications {

      	String name;
	int pincode;
	String city;

	public void PrintMe() {
		System.out.println(this.name);
		System.out.println(this.pincode);
		System.out.println(this.city);
	}
}

class Emplyoees extends Applications {
	Emplyoees(String name) {
		this.name = name;
	}

	Emplyoees(String name, int pincode) {
		this.name = name;
		this.pincode = pincode;
	}

	Emplyoees(String name, int pincode, String city) {
		this.name = name;u
		this.pincode = pincode;
		this.city = city;
	}
}

public class Agevist {
	public static void main(String args[]) {
		Emplyoees e1 = new Emplyoees("NAGAPANDIAN", 641604, "COIMBATORE");
		e1.PrintMe();


		System.out.print("D.o.B in YYYY-MM-DD: ");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		scanner.close();

		LocalDate dob = LocalDate.parse(input);
		System.out.println("Age is:" + getAge(dob));
	}

	private static int getAge(LocalDate dob) {
		LocalDate curDate = LocalDate.now();
		return Period.between(dob, curDate).getYears();
      
	}
}
