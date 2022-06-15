abstract class Application 
        {         
         abstract void nameofperson();
         abstract void bloodgroup();
         abstract void marriedstatus();
         abstract void dateofbirth();
        }       
     
interface College 
        {  
	 public void age();
	 public void department();
	 public void city();
	}
class internal extends Application 
    {  
        public void nameofperson()
        {
	 System.out.println("NAME OF EMPLYOEE" + "  "+ "PRADEESH");
        }
	public void bloodgroup()
	{
	 System.out.println("BLOOD GROUP"+" "+"O+VE");
	}        
	public void marriedstatus()
	{
	 System.out.println("MARRIED STATUS"+" "+"SINGLE");
	}       
	public void dateofbirth()
	{
	System.out.println("DATE OF BIRTH"+" "+"14/11/1996");
        }
    }          
			        	
class emplyoee implements College
    {
	public void age()
	{int age = 25;
	 System.out.println("AGE"+" " +age);
	}
	public void department()
	{
	System.out.println("NAME OF THE DEPARTMENT" + "  " +"FACULTY OF SPORT");
	}
	public void city()
	{
	System.out.println("NAME OF THE CITY" + "  "+"COIMBATORE");
	}
   }
   
class external extends Application 
   {
        public void nameofperson()
        {
        System.out.println("NAME OF EMPLYOEE" + "  "+ "NAGAPANDIAN");
	}
	public void bloodgroup()
	{
	System.out.println("BLOOD GROUP"+" "+"O+VE");
	}        
	public void marriedstatus()
	{
	System.out.println("MARRIED STATUS"+" "+"SINGLE");
	}     
	public void dateofbirth()
	{
	System.out.println("DATE OF BIRTH"+" "+"14/11/1996");
	} 
    }
    
class staff implements College 
    {
	public void age()
	{int age = 26;
	System.out.println("AGE"+" " +age);
	}
	public void department()
	{
	System.out.println("NAME OF THE DEPARTMENT" +"  "+"FACULTY OF AUTOMOBILE ENGINEERING");
	}
	public void city()
	{
	System.out.println("NAME OF THE CITY" +"  "+"TIRUPPUR");
	}

     }
                    
public class Models
     {
        public static void main(String[]args) 
        {
        internal i = new internal();
                 i.nameofperson();
                 i.bloodgroup();
                 i.dateofbirth();
                 i.marriedstatus();

        emplyoee e = new emplyoee();
                 e.age();
                 e.department();
                 e.city();
         
        external ex = new external();
                 ex.nameofperson();
                 ex.bloodgroup();
                 ex.dateofbirth();
                 ex.marriedstatus();
                 
           staff s = new staff();
                 s.age();
                 s.department();
                 s.city();
        }
      }
