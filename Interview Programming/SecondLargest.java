import java.util.*;
import java.util.stream.*;

public class SecondLargest
{
	public static void main(String ...args)
	{
		//List<String> intList = Arrays.asList(args);
		
		List<String> intList = List.of(args);
		
		
		System.out.println( intList.stream()
							  		.sorted( (a,b) -> -a.compareTo(b) )
									.skip(1)
									.findFirst()
						);
		
		System.out.println( Arrays.stream(args)
							  		.sorted( (a,b) -> -a.compareTo(b) )
									.skip(1)
									.findFirst()
						);
	
		System.out.println( Stream.of(args)
									.sorted( (a,b) -> -a.compareTo(b) )
									.skip(1)
									.findFirst()
						);
		
	}
}