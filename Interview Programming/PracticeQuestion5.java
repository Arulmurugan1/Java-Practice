class PracticeQuestion5 {
    
	static void main(String[] args) {
		
		int a[] = {1,2,3};
		int b[] = a;
		
		b[1] += a[0]++; //3
		a[2]  = b[1]++; //4
		
		System.out.println(a[0]+a[1]+a[2]);
		System.out.println(b[0]+b[1]+b[2]);
		System.out.println(a[0]+" "+ a[1]+" "+ a[2]);
		System.out.println(b[0]+" "+ b[1]+" "+ b[2]);
		System.out.println(b==a);
		
		/*		
		9
		9
		2 4 3
		2 4 3
		true
		*/
    }
	
}