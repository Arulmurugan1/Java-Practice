/*

Given a string find out duplicate character and its count .
Ex: i/p- manojpandey, o/p- a-2,n-2.

This question has one more variant to find repeated word in the sentence .

Ex: I/O:I am a java developer and I am proud of it, o/p: I-2,am-2.

*/

import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class FindDuplicateChars
{
	public static void main(String ...args)
	{
		String str = "manojpandey";
		/*
		char[] chrArr = str.toCharArray();
		
		Set<Character> charSet 			= new TreeSet<>();
		Map<Character,Integer> charMap 	= new HashMap<>(); 
		
		for(char ch : chrArr)
		{
			if( !charSet.add(ch) )
			{
				if( charMap.get(ch) == null ) charMap.put(ch, 2);
				else charMap.put(ch, charMap.get(ch) + 1 );
			}
		}
		
		System.out.println(charMap);*/
		
		System.out.println(str.chars() // Intstream
						.mapToObj( c -> (char) c ) // mapped Stream
						.collect( Collectors.groupingBy(Function.identity(),Collectors.counting() )  ) // Map
						.entrySet() 
						.stream()
						.filter( m -> m.getValue() > 1 ) // entrySet
						.collect( Collectors.toMap( Map.Entry::getKey, Map.Entry::getValue ) )
						);
		
		
	}
}	