class StringPractice1
{
	static void main(String... args)
	{
		String s1 = "S";
		String s2 = new String("S");
		String s3 = s2.intern();
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s2==s3);
		
		System.out.println();
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s2.equals(s3));
		
	}
}