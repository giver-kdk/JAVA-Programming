// CLASS DEFINITION
class Distance
{
	// Private Variables
	private int feet;
	private double inch;


	// Getter methods for private variables 
	public int getFeet(){
		return feet;
	}
	public double getInch(){
		return inch;
	}

	// Constructors
	public Distance(){
		feet = 0;
		inch = 0;
	}
	public Distance(int f){
		feet = f;
		inch = 0;
	}
	public Distance(int f, double i){
		feet = f;
		inch = i;
		normalize();									// Need normalization 
	}

	// Convert excess inch to feet
	public void normalize()
	{
		if(inch >= 12)
		{
			feet = feet + (int) inch / 12;				// Add extra inch as feet in feet
			inch = inch % 12;							// Make inch as remaining inch
		}
	}

	// Adding Distance Objects
	public Distance add(Distance d)
	{
		int feet2 = this.getFeet() + d.getFeet();
		double inch2 = this.getInch() + d.getInch();

		Distance result = new Distance(feet2, inch2);	// Create new object and return 
		return result;
	}

	// Comapare Distance
	public void compare(Distance d)
	{
		double totalInch1 = this.getFeet() * 12 + this.getInch();
		double totalInch2 = d.getFeet() * 12 + d.getInch();		// Using getter function for private variables

		if(totalInch1 > totalInch2){
			System.out.println("Distance 1 is greater than Distance 2");
		}
		else if(totalInch1 < totalInch2){
			System.out.println("Distance 1 is less than Distance 2");
		}
		else{
			System.out.println("Distance 1 and Distance 2 are equal");
		}
	}

	public static void main(String[] args)
	{
		Distance d1 = new Distance(20, 6);
		Distance d2 = new Distance(10, 8);

		Distance sum = d1.add(d2);
		System.out.println(sum.getFeet());
		System.out.println(sum.getInch());

		d1.compare(d2);
	}

}