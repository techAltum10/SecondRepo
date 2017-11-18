package oct_09;

public class ClassA1 {
	int i = 10;
	
	public void method1(){
		System.out.println(i);
	}
	
	public static void main(String[] args) {
		System.out.println("Hi");
		//System.out.println(i);
	}
}

class ClassA2{
	
	public void method2(){
		ClassA1 obj = new ClassA1();
		int b = obj.i;
		obj.method1();
	}
	
	public static void main(String args[]){
		System.out.println("Hello");
		
	}
}


