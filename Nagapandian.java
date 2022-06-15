
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

interface Registration 
{
	void PrintMe();
}

abstract class Application implements Registration{

	String name;
	int pincode;
	String city;

	public void PrintMe(){
		System.out.print(" THE NAME " + name);
		System.out.print("  PINCODE IS " + pincode);
		System.out.println("  COME FROM " + city);
	
	}
	 public static int getAge(LocalDate dob) {
        LocalDate curDate = LocalDate.now();
        return Period.between(dob, curDate).getYears();
        
    }
}

class Emplyoee extends Application {
	Emplyoee(String name) {
		this.name = name;
	}

	Emplyoee(String name, int pincode) {
		this.name = name;
		this.pincode = pincode;
	}

	Emplyoee(String name, int pincode, String city) {
		this.name = name;
		this.pincode = pincode;
		this.city = city;
	}
}

public class Nagapandian
{
    public static void main(String args[])
    {
    
    ArrayList<Application> list = new ArrayList<Application>();
    
    
    boolean check = true;
    
      do{
      Scanner scanner = new Scanner(System.in);
	            boolean enter = true;
	            
	             Application obj = enter? new Emplyoee();
      
    
                    System.out.print("Name: ");
	             obj.name = scanner.nextLine();
 
		    System.out.print("pincode: ");
	             obj.name = scanner.nextLine();

                    System.out.print("city: ");
	             obj.name = scanner.nextLine();
	             
	             System.out.print("Please enter date of birth in YYYY-MM-DD: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();
 
         
        LocalDate dob = LocalDate.parse(input);
        System.out.println("Age is:" + getAge(dob));
       
    }
}
