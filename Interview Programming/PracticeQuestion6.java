class PracticeQuestion6{
	
	static void main(String ...args) throws Exception{
		Parent obj = new Child();
		Child obj1 = (Child) obj.clone(); // obj.clone() => error: clone() has protected access in Object if no implements Cloneable and no clone() override
		obj.show();
		obj1.show();
		obj1.show();
		
		System.out.println(obj==obj1);
		
	}
	
}

class Parent implements Cloneable {
		
	int x = 10;
	void show(){
		System.out.println("Test Parent "+x);
	}
	
	@Override
    public Parent clone() throws CloneNotSupportedException {
        return (Parent) super.clone();
    }
	
}

class Child extends Parent{
		
	int x = 20;
	
	@Override void show(){
		System.out.println("Test Child "+x);
	}
}