import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Scanner;

interface Ifunctions
	{ 
	   void celebrations(); 
	   
	} 
	abstract class Emplyoee implements  Ifunctions 
	{ 
		 int age;
                String name;
		 String DOB;
		 String city;
		 int pincode;
			    
	   public void celebrations() 
	    { 
                System.out.println("***********");
	        System.out.println("Above mentioned personal Details: ");
	        LocalDate today = LocalDate.now();

	    	if ((DOB != null) && (today != null)) 
	    	this.age = Period.between( LocalDate.parse(DOB), today).getYears();
	
	    	System.out.println("Person Name : "+name);
	    	System.out.println("Date Of Birth : "+DOB);
	    	System.out.println("Age : "+age);
	    	System.out.println("City : "+city);
	    	System.out.println("Pincode : "+pincode);

	    } 
	}
	class Staff extends Emplyoee
	{
		Staff() 
		{
			
		}
	
		Staff(int age)
		{
	        this.age = age;
	       
	    }
		Staff(int age, String name) {
	        this.age = age;
	        this.name = name;
	    }
	        Staff(int age, String name,String city) {
	        this.age = age;
	        this.name = name;
	        this.city = city;
	    }
	        Staff(int age, String name,String city,int pincode) {
	        this.age = age;
	        this.name = name;
	        this.city = city;
	        this.pincode = pincode;
	        
	    }
		
	}
	class Students extends Emplyoee
	{
		Students()
		{
	        
	    }
		Students(int age) {
	        this.age = age;
	       
	    }
		Students(int age, String name) {
	        this.age = age;
	        this.name = name;
	    }
	     Students(int age, String name,String city) {
	        this.age = age;
	        this.name = name;
	        this.city = city;
	    }
	    Students(int age, String name,String city,int pincode) {
	        this.age = age;
	        this.name = name;
	        this.city = city;
	        this.pincode = pincode;
	        
	    }
	
	}
	
	public class MethodTask 
	{
	    public static void main(String args[]) 
	    {

	    	ArrayList<Emplyoee> list = new ArrayList<Emplyoee>();
	    	
	    	
	        boolean check = true;
	      
	        
	        do {

	            Scanner scanner = new Scanner(System.in);
	            boolean enter = true;
	            Emplyoee obj = enter? new Students() : new Staff();
	             System.out.println("***********");
	            System.out.println("Enter the Name: ");
	            obj.name = scanner.nextLine();
	            
	            System.out.println("Enter Your DOB(YYYY-MM-DD): ");
	            obj.DOB = scanner.nextLine();
	           
	            System.out.println("Enter the City: ");
	            obj.city = scanner.nextLine();
	            
	            System.out.println("Enter the pincode: ");
	            obj.pincode = scanner.nextInt();
	            
	            String str = scan.next();
	           
	            list.add(obj);
	            
	            System.out.println("***********");
	            
	            System.out.print("Do you want to continue(Yes/No)?");
	            check = (scanner.nextLine()).equalsIgnoreCase("Yes");
	            enter = !enter;
	          }
	          
	          while (check);  
	          for (int i = 0; i < list.size(); i++) {
	        	  list.get(i).celebrations();
	    }
	}
}
