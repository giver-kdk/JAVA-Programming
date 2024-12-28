// CLASS DEFINITION
class AllPossible
{
	public static int isAllPossibilities(int[] arr)
	{
		boolean[] hasElement = new boolean[arr.length];

		for(int i = 0; i < arr.length; i++)	
		{
			for(int j = 0; j < arr.length; j++)
			{
				hasElement[i] = false;
				if(arr[j] == i)
				{
					hasElement[i] = true;			
					break;									// Donot forget this "break" statement
				}
			}
		}

		for(int i = 0; i < hasElement.length; i++)
		{
			if(hasElement[i] == false)
			{
				return 0;
			}
		}
		return 1;
	}

	public static void main(String[] args)
	{
		int[] array1 = {0, 1, 2, 3, 4};
		int[] array2 = {1, 2, 3, 4, 5};

		System.out.println(isAllPossibilities(array1));
		System.out.println(isAllPossibilities(array2));
	}
}



