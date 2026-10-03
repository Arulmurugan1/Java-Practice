import java.util.Arrays;

class Anagram
{
	static void main(String args[])
	{
		String s1 = "Dormitory";
		String s2 = "Dirty room";
		
		char arr1[] = s1.replaceAll("\\s","").toLowerCase().toCharArray();
		char arr2[] = s2.replaceAll("\\s","").toLowerCase().toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		System.out.print("isAnagram : "+Arrays.equals(arr1,arr2)); // isAnagram : true
		
	}
}