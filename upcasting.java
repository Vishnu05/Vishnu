package practise;

// A very simple java program about upcasting
class upcasting {

	void hello(){
		System.out.println("hello");
	}	
}

class world extends upcasting {
	
	void hello(){
		System.out.println("This method is polymorphism override");
	}
	
	public static void main(String []args){
		
		upcasting object=new world();// reference variable of parent class refers to the object of child class 
		object.hello();
		object.close();
	}
	
}
