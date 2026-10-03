class StaticUnderstanding
{
	static String s = "";
	
	static
	{
		s += "S"; // calls 1st only one time
	}
	
	{
		s += "I"; // // calls 2nd , 1st
	}
	
	StaticUnderstanding()
	{
		s += "C"; // calls 3rd ,  2nd
	}
	
	static void main(String ...args)
	{
		new StaticUnderstanding();
		new StaticUnderstanding();
		
		System.out.print("Result ::"+StaticUnderstanding.s); //Result ::SICIC
		
	}
}