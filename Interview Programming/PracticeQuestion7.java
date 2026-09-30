class PracticeQuestion7 implements Cloneable{

	int x = 10;
	
	static void changeTest(PracticeQuestion7 obj) throws Exception {
		
		obj.x += 10;
		obj    = (PracticeQuestion7) obj.clone();
		obj.x += 20;
		
	}
	
	static void main(String ...args) throws Exception{
		
		PracticeQuestion7 obj = new PracticeQuestion7();
		PracticeQuestion7 obj1 = (PracticeQuestion7) obj.clone();
		changeTest(obj);
		System.out.println(obj.x);
		
	}
	
}