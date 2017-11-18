package javaP;

public class ClassA3 {

	public void method1(){
		//String[] arr1 = new String[3];
		
		int[] studentMarks = {5, 7, 1, 9, 4};
		
		//sort StudentMarks in ascending order
		//{5, 7, 1, 9, 4} = {1, 4, 5, 7, 9}
		
		for(int i=0;i<studentMarks.length;i++){
			//System.out.println("Hi");
			for(int j = 0; j<studentMarks.length-1; j++){
				
				if(studentMarks[j] > studentMarks[j+1]){

					//Swipe
					int temp = studentMarks[j];
					studentMarks[j] = studentMarks[j+1];
					studentMarks[j+1] = temp;
					
					//System.out.println(temp);
				}
			}
		}
		for(int k = 0; k<studentMarks.length; k++){
			//Value print  - sorted array
			System.out.println(studentMarks[k]);
		}
		//System.out.println(studentMarks[0] + "," + studentMarks[1] + "," +studentMarks[2] + "," +studentMarks[3] + "," +studentMarks[4]);
	}
	
	public static void main(String args[]){
		ClassA3 obj = new ClassA3();
		obj.method1();
	}
}
