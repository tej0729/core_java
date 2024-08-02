package core_5.abstraction;

public class Rect extends Shape{

	private float width,height;

	public Rect() {
	
		// TODO Auto-generated constructor stub
		this.width = 30.4f;
		this.height = 15.3f;
	System.out.println("default");
	}

	public Rect(float width, float height) {
	
		this.width = width;
		this.height = height;
		System.out.println("Parameterized");
	}
	
	void calcArea()
	{
		area=width*height;
	}
}
