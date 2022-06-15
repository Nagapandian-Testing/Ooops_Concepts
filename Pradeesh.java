interface Registration 
    {

        void PrintMe();
    }
    
class profile implements Registration 
{
          String name;
          String dob;
          String marriedstatus;
          String department;
          String type;
      
    profile(String type,String name, String dob,String marriedstatus,String department)
    {
       this.type = type;
       this.name = name;
       this.dob = dob;
       this.marriedstatus = marriedstatus;
       this.department = department;  
    }
      
   public void PrintMe()
   {
   
        System.out.println("TYPE :"+ this.type);
        System.out.println("NAME OF PERSON :"+this.name);
        System.out.println("DATE OF BIRTH :"+this.dob);
        System.out.println("MARRIED STATUS :"+this.marriedstatus);
        System.out.println("DEPTMENT :"+this.department);
        
    }
}

public class Pradeesh
{
    public static void main(String args[])
    {
        profile s1 = new profile("EMPLYOEE","NAGAPANDIAN","14/11/1996","SINGLE","SPORT");
        profile s2 = new profile("EMPLYOEE","RAJESH","15/14/1995","MARRIED","ENGLISH");
        profile s3 = new profile("STAFF","VIJAY SANKAR","14/11/1996","SINGLE","ARTS");
        profile s4 = new profile("STAFF","VIGNESH","15/14/1995","MARRIED","COMPUTER SCIENCE");
        profile s5 = new profile("STAFF","PRADEESH","15/14/1995","MARRIED","ENGLISH");
        
        s1.PrintMe();
        s2.PrintMe();
        s3.PrintMe();
        s4.PrintMe();
        s5.PrintMe();
    }
    
}   
