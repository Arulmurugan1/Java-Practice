
import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class FindOccurenceOfCharInWords
{
	public static void main(String ...args)
	{
		if(args ==null || args.length ==0)
		{
			System.out.print("Provide some words .....");
			return;
		}
		
		List<String> wordsList = new ArrayList<>();
		
		for(String arg : args)
		{
			if(arg != null && arg.trim().length() > 0 )
				wordsList.addAll(Arrays.asList(arg.split("")));
		}
		
		System.out.println("List after added ... " +wordsList);
		
		Map<String,Long> wordsMap = wordsList.stream()
												.filter( w -> w != null && w.trim().length() > 0 )
												.collect( Collectors.groupingBy(Function.identity() , Collectors.counting()) )
												.entrySet()
												.stream()
												.filter( e -> e.getValue() > 0 )
												.collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(exist,replace) -> replace));

		System.out.print(FindOccurenceOfCharInWords.class.getSimpleName()+" Result ... "+ wordsMap);
												
		
	}
}