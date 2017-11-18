package javaP;

public class ClassA4 {

	public void method1(){
		
		int i = 2/0;
		System.out.println(i);

	}
	
	public void method2(){
		
		try{
			int arr[] = {5,4,3,2,1};
			System.out.println(arr[5]);
		}
		catch(Exception ex){
			System.out.println("There is no element at index 5 in this array.");
		}
		
	}
	
	public static void main(String args[]){
		ClassA4 obj = new ClassA4();
		obj.method2();
	}
}
