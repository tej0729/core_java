package core_5.abstraction;

public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Square s=new Square();
 Rect r=new Rect();
 s.calcArea();
 s.show();
 r.calcArea();
 r.show();
  System.out.println("*******************");
   
  Shape shape;
  shape = new Square(12.3f);
  
  shape.calcArea();
  shape.show();

  shape = new Rect(12,43);
  
  shape.calcArea();
  shape.show();
  
  
	}

}
