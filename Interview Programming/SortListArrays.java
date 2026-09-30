import java.util.*;

class SortListArrays
{
	static void main(String ...args)
	{
		//----Sort Array --//
		int arr[] = {2,1,2,7,6,5,4,3};
		
		Integer arr1[] = {2,1,2,7,6,5,4,3};
		
		//System.out.println(Arrays.toString(arr));
		//System.out.println(Arrays.toString(arr1));
		
		Arrays.sort(arr); // natural sort
		//Arrays.sort(arr  , Comparator.reverseOrder()); // error: no suitable method found for sort(int[],Comparator<T#1>) Arrays.sort(arr , Comparator.reverseOrder());
                
		Arrays.sort(arr1 , Comparator.naturalOrder());
		Arrays.sort(arr1 , Comparator.reverseOrder());
		
		//System.out.println(Arrays.toString(arr));
		//System.out.println(Arrays.toString(arr1));
		
		//----Sort Array --//
		
		//----Sort Collection --//
		
		

		//List<Integer> numList =  Arrays.asList(arr);error: incompatible types: inference variable T has incompatible bounds
		
		List<Integer> numList =  List.of(arr1); 
		//Collections.sort(numList); // Exception in thread "main" java.lang.UnsupportedOperationException
		
		
		List<Integer> numList1 =  Arrays.asList(arr1);
		Collections.sort(numList1);
		Collections.sort(numList1, Comparator.reverseOrder());
		
		System.out.println(numList);
		
		//----Sort Collection --//
		
	}
}