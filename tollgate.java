//abstarct, inheritance, polymorphism.

 abstract class vehicals {

   abstract void Typesofvehicals();

    }
     
 class twowheeler extends vehicals {
 
 void Typesofvehicals(){
    
    System.out.println("Two Wheeler Lane");
    }
     }
     
 class fourwheeler extends vehicals {
  
 void Typesofvehicals(){
    System.out.println("Four Wheeler Lane");
    }
     }
    
 public class tollgate {
    
 public static void main (String [] args){
    
       twowheeler t = new twowheeler();
       fourwheeler f = new fourwheeler();
       
       t.Typesofvehicals();
       f.Typesofvehicals();
       
       }
        }
