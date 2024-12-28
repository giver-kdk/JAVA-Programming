// CLASS DEFINITION
interface Fly{
	void doFly();
	void doWalk();
}

interface Swim{
	void doSwim();
	void doDive();
}

class Duck implements Fly, Swim{
	public void doFly(){
		System.out.println("Duck is flying...");
	}
	public void doWalk(){
		System.out.println("Duck is walking...");
	}
	public void doSwim(){
		System.out.println("Duck is swimming...");
	}
	public void doDive(){
		System.out.println("Duck is diving...");
	}
}

class MultipleInheritance
{
	public static void main(String[] args)
	{
		Duck b = new Duck();
		b.doFly();
		b.doWalk();
		b.doSwim();
		b.doDive();
	}
}