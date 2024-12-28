// CLASS DEFINITION
class CustomException extends Exception{
	public CustomException(){}

	public CustomException(String msg){
		super(msg);
	}
}

class ExceptionHandle{
	public static void checkAge(int age) throws CustomException
	{
		if(age < 16){
			throw new CustomException("Age not valid for voting");
		}
		else
		{
			System.out.println("Age is avalid for voting");
		}
	}	
	public static void main(String[] args)
	{
		int age = 15;

		try{
			checkAge(age);
		}
		catch(CustomException err){
			System.out.println(err.getMessage());
		}
		finally{
			System.out.println("Age Checked!");
		}
	}
}