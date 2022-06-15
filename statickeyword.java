/*static method*/

public class statickeyword
{
  public  static void staticmethod()
  {
  System.out.println("static");
  }
  
  public void nonstaticmethod()
  {
  System.out.println("non static");
  }
  
public static void main(String[] args)
  {
  statickeyword  st = new statickeyword();
  st.nonstaticmethod();
  st.staticmethod();
  }
}
