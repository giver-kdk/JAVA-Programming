// CLASS DEFINITION
class ConstructorChain
{
	String name;
	int age;

	// Constructor Chaining
	public ConstructorChain(){
		System.out.println("Default Constructor");
	}
	public ConstructorChain(String n){
		this();
		name = n;
		System.out.println("Single Parameter Constructor");
	}	
	public ConstructorChain(String n, int a){
		this(n);
		age = a;
		System.out.println("Multiple Parameter Constructor");
	}

	public static void main(String[] args){
		ConstructorChain cc = new ConstructorChain("Ram", 21);
	}
}