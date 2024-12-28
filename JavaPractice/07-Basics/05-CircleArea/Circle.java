class Circle
{
	double radius;

	public Circle(){
		radius = 0;
	}	
	public Circle(double r)
	{
		radius = r;
	}

	public void findArea()
	{
		double result = Math.PI * radius * radius;					// Math.PI for value of PI
		System.out.println("Area of Circle: " + result);
	}

	public static void main(String[] args)
	{
		Circle c1 = new Circle(10);
		c1.findArea();
	}
}