package javaP;

public class ClassA2 {

	public void method1(){
		//String[] arr1 = new String[3];
		
		int[] studentMarks = {5, 7, 1, 9, 4};
		
		//Calvulate avg of StudentMarks
		int sum=0;
		float avg = 0.0f;
		for(int i=0;i<studentMarks.length;i++){
			
			sum = sum + studentMarks[i];
			   /*
				0   0  + 5 = 5
			    1   5  + 7 = 12
			    2   12 + 1 = 13
			    3   13 + 9 = 22
			    4   22 + 4 = 26
			    5   - Exit from loop
			    */		   
		}
		System.out.println("Sum is - " + sum);
		
		avg = (float)(sum)/studentMarks.length;
		System.out.println("Average is - " + avg);
	}
	
	public static void main(String args[]){
		ClassA2 obj = new ClassA2();
		obj.method1();
	}
}
