// CLASS DEFINITION
class CenteredArray
{
	// ARRAY CHECKER METHOD
	public static int checkArray(int[] arr)
	{
		// Return 0 if array length is even
		if(arr.length % 2 == 0)
		{
			return 0;
		}

		// Calculate middle index
		int mid = arr.length / 2;

		for(int i = 0; i < arr.length; i++)
		{
			// Return 0 if array is not centered
			if(i != mid && arr[i] <= arr[mid])
			{
				return 0;
			}
		}
		// Return 1 if array is centered
		return 1;
	}
	// MAIN METHOD 
	public static void main(String[] args)
	{
		int[] array1 = {2, 3, 1, 4, 5};				// Centered Array
		int[] array2 = {5, 6, 7, 8};				// Non-Centered Array

		System.out.println(checkArray(array1));
		System.out.println(checkArray(array2));
	}
}