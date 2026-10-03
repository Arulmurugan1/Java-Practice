import java.util.Arrays;

class RightShiftZeroes
{
	static void main(String... args)
	{
		main1(args);
		main2(args);
	}
	
	static void main1(String... args) // Two-pointer approach
	{
		int arr[] = {1,2,0,2,0,4,0,1,2};
		int index = 0;
		
		for(int x : arr)
			if(x != 0) arr[index++] = x;
		
		while(arr.length > index )
			arr[index++] = 0;
		
		System.out.println("RightShiftZeroes main1 Result :: " + Arrays.toString(arr));
		
	}
	
	static void main2(String... args) // two-pointer + swap
	{
		int a[]  = {1,2,0,2,0,4,0,1,2};
		
		int j 	 = 0;
		int temp = 0;
		
		for (int i = 0; i < a.length; i++)
		{
			if( a[i] != 0)
			{
				temp 	= a[i];
				a[i] 	= a[j];
				a[j++]	= temp;
			}
		}
		
		System.out.print("RightShiftZeroes main2 Result :: " + Arrays.toString(a));
		
	}
}