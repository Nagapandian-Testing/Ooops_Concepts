interface College {

	public void nameofperson();
	public void age();
	public void department();
	public void city();
	}
	
class emplyoee implements College {


	public void nameofperson(){
		System.out.println("NAME OF EMPLYOEE" + "  "+ "PRADEESH");
	}
	public void age()
	{
	        int age = 25;
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

class staff implements College {

	
	public void nameofperson()
	{
		System.out.println("NAME OF staff" +"  "+"NAGAPANDIAN");
	}
	public void age()
	{
	        int age = 26;
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
public class Test {

	public static void main(String[]args) {

		emplyoee e = new emplyoee();
		e.nameofperson();
	        e.age();
                e.department();
                e.city();
                
                               
  		staff s = new staff();
		s.nameofperson();
		s.age();
		s.department();
		s.city();
}
}
