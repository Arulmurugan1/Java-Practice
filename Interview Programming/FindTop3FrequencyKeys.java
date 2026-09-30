import java.util.*;
import java.util.stream.*;

class FindTop3FrequencyKeys
{
	static void main(String ...args)
	{
		List<Integer> numList = List.of(1,2,2,3,3,4,5,4,4,5,5,6,7,9,6);
		
		System.out.print("Inputs Provided :: "+numList);
		
		numList = numList.stream()
							.collect(Collectors.groupingBy(i->i,Collectors.counting()))
							.entrySet()
							.stream()
							.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
							.limit(3)
							.map(Map.Entry::getKey)
							.collect(Collectors.toList());
		
		System.out.print("Top 3 frequency Keys :: "+numList);
		
	}
}