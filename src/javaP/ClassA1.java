package javaP;

public class ClassA1 {

	public void method1(){
		
		int i = 10;
		i = 15;
		System.out.println(i);
		
		String s = "Hello";
		//Array - is a collection of similar data type
		
		//How to declare array - Many Way
		//Page - 48 in Complete Reference - Java
		
		//String[] arr1 = new String[3];
		
		String[] arr = {"QTP", "Java", "Selenium"};
		
		//System.out.println(arr[0]);  //should print QTP
		
		//Can calculate array lenght
		int arrLength = arr.length;
		System.out.println("Array lenth is - " + arrLength);
		
		//To iterate all values of array
		for(i = 0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
		
	}
	
	public static void main(String args[]){
		ClassA1 obj = new ClassA1();
		obj.method1();
	}
}
