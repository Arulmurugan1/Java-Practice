class PracticeQuestion2 {
    
	public static void main(String[] args) {
        
        Integer a = 100;
		Integer b = 100;
		Integer c = 128;
		Integer d = 128;

        System.out.println(a+" " + b +" :: "+ (a==b)); // true
        System.out.println(c+" " + d +" :: "+ (c==d)); // false -- as Integer == works from -128 to 127
		System.out.println(c+" " + d +" :: "+ (c.equals(d))); // true

    }
	
}