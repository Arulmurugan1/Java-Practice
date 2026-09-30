import java.util.*;
import java.util.stream.*;

public class EvenNumber
{
	public static void main(String ...args)
	{
		/*List<Integer> intList = List.of(1,2,3,4,5,34,5,6,7,8,8);
		System.out.println(
		      intList.stream()
		                .filter( n -> n%2 == 0)
		                .collect(Collectors.toSet())
		    );
		
		 When numbers are given as Array int[] arr */
		
		int[] intArr = {1,2,3,4,5,6,7,8,9};
		
		System.out.println
		(
	      Arrays
	      .stream(intArr)
	      .boxed()
	      .collect(Collectors.partitioningBy(num -> num % 2 == 0))
	      .get(true)
		);
	}
}