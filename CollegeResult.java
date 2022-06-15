interface Resitration {

         void name();
         void dateofbirth();
         void marriedstatus();
         void department();
         void age();
         }
         
abstract class emplyoee implements Resitration {

          public void name(){
                 System.out.println("NAME"+" " +"NAGAPANDIAN");
                    }
                    
          public void dateofbirth(){
             System.out.println("DATE OF BIRTH"+" " +"14/11/1996");
                }
         
         public void marriedstatus(){
                 System.out.println("MARRIED STATUS"+" " +"SINGLE");
                  }
                  
         public void department (){
                 System.out.println("DEPARTMENT"+" " +"FACULTY OF ENGINEERING");
                  }
  }
  
  abstract class staff implements Resitration {
  
  
  public void name(){
                  System.out.println("NAME"+" " +"PRADEESH");
                    }
                    
          public void dateofbirth(){
            System.out.println("DATE OF BIRTH"+" " +"14/11/1996");
                }
         
         public void marriedstatus(){
              System.out.println("MARRIED STATUS"+" " +"MARRIED");
                  }
                  
         public void department (){
                 System.out.println("DEPARTMENT"+" " +"FACULTY OF SPORT");
                  }
    }              
          
          class emplyoee1 extends emplyoee{
               
                public void age(){
                int age = 25;
	 System.out.println("AGE"+" " +age);
	 }
	 }
	 
	 class staff1 extends staff{
	 
	 public void age(){
                int age = 26;
	 System.out.println("AGE"+" " +age);
	 }
	 }
 
 public class CollegeResult {
 
     public static void main(String[] args)
     
     {
     
      emplyoee1 emm = new emplyoee1();
      staff1 sta = new staff1();
      
     emm.name();
     emm.dateofbirth();
     emm.marriedstatus();
     emm.department();
     emm.age();
     
       sta.name();
       sta.dateofbirth();          
       sta.marriedstatus();          
       sta.department();
       sta.age();
    }
    }    
          
