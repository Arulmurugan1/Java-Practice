class OuterInner {
    class Inner {
        void hello() {
            System.out.println("Inner class");
        }
    }

    static void main(String[] args) {
        OuterInner u = new OuterInner();
        Inner in = u.new Inner();
        in.hello();
		
		//OuterInner.InnerStatic.hello(); if hello declared as static
		
		OuterInner.InnerStatic io = new OuterInner.InnerStatic();
		io.hello();
    }
	
	static class InnerStatic {
        void hello() {
            System.out.println("InnerStatic class");
        }
    }
}
