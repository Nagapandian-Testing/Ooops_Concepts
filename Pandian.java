class Staff {
    int age;
    String name;
    String dob;
    Staff(int age) {
        this.age = age;
    }
    
    Staff(int age, String name) {
        this.age = age;
        this.name = name;
    }
    
    Staff(int age, String name, String dob) {
        this.age = age;
        this.name = name;
        this.dob = dob;
    }
    
    void printMe() {
        System.out.println(this.age);
        System.out.println(this.name);
        System.out.println(this.dob);
    }
}

public class Pandian {
    public static void main(String args[]) {
        
        // Staff s1 = new Staff();
        Staff s2 = new Staff(25);
        Staff s3 = new Staff(25, "pandian");
        Staff s4 = new Staff(25, "pandian", "14/11/1996");
        
        // s1.printMe();
        s2.printMe();
        s3.printMe();
        s4.printMe();
    }
}
