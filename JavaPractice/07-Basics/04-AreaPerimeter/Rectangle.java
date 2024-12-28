class Rectangle
{
	double length;
	double breadth;

	public Rectangle(){
		length = 0;						// 'this' keyword can be eliminate din case of no colliding name
		breadth = 0;
	}
	public Rectangle(double l){
		length = l;
		breadth = 0;
	}
	public Rectangle(double l, double b){
		length = l;
		breadth = b;
	}
	public void findArea()
	{
		double result = length * breadth;
		System.out.println("Area of Rectangle: " + result);			// Use "+" to concat the printing result
	}
	public void findPerimeter()
	{
		double result = 2 * (length + breadth);
		System.out.println("Area of Rectangle: " + result);
	}

	public static void main(String[] args)
	{
		Rectangle r1 = new Rectangle(10, 20);
		r1.findArea();
		r1.findPerimeter();
	}
}	