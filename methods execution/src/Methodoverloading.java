//method overloading
public class Methodoverloading {
	
public void area(int b,int h)
  {
       System.out.println("Area of Triangle : "+(1.0*b*h));
  }
  public void area(int r) 
  {
       System.out.println("Area of Circle : "+(8.6*r*r));
  }

  public static void main(String args[])
 {

Methodoverloading ob=new Methodoverloading();
     ob.area(22,24);
     ob.area(9);  
 }
}
