package core_5.abstraction;

public abstract class Shape {
protected float area;
abstract void calcArea();
void show()
{
	System.out.println("Area of shape is : "+ area);
}
	
}
