
import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class FindOccurenceofword
{
	public static void main(String ...args)
	{
		if(args ==null || args.length ==0)
		{
			System.out.print("Provide some words .....");
			return;
		}
		
		List<String> wordsList = Arrays.asList(args);
		
		Map<String,Long> wordsMap = wordsList.stream()
												.filter( w -> w != null && w.trim().length() > 0 )
												.collect( Collectors.groupingBy(Function.identity() , Collectors.counting()) )
												.entrySet()
												.stream()
												.collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));

		System.out.print("Result ... "+ wordsMap);
												
		
	}
}