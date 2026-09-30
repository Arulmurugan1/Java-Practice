class PracticeQuestion4 {
    
	static void test(int x , double y){ 
		System.out.println("Test Result id:: "+ (x+y));
	}
	
	static void test(double x, int y){ 
		System.out.println("Test Result di:: "+ (x+y));
	}
	
	static void test(long x, int y){ 
		System.out.println("Test Result li:: "+ (x+y));
	}
	
	static void main(String[] args) {
		
		int x 	 = 20;
		double y = 10;
		
        test(x,y);
		test(y,x);
		//test(10,20); // --error: reference to test is ambiguous
    }
	
}