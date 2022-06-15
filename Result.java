//abstract class , inheritance  

 abstract class Member {

 abstract void wellcomeMessage();
     
    }
     
 class Student extends Member {
  
     void wellcomeMessage(){
     
     System.out.println("Student are wellcomes");
     
     }
     }
     
 class Teacher extends Member {
  
    void wellcomeMessage(){
    
    System.out.println("Teacher are Wellcomes");
    
    }
    }
    
 public class Result {
    
 public static void main (String [] args){
    
       Student s = new Student();
       
       Teacher t = new Teacher();
       
       s.wellcomeMessage();
       t.wellcomeMessage();
       
       }
       }
