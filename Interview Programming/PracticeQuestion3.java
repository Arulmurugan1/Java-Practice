class PracticeQuestion3 {
    
	static int test(){ 
		try { 
			throw new Exception("test");
		} 
		catch(Exception e) { 
			e.printStackTrace();
			return 30;
		} 
		finally { 
			return 20;
		} 
	}
	
	static void main(String[] args) {
        System.out.println("Result :: "+ test());
    }
	
}