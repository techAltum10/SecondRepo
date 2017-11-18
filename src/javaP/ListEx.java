package javaP;

import java.util.ArrayList;
import java.util.List;

public class ListEx {

	public void listExample(){
		//Dec List   - import from java.util
		List<String> myL = new ArrayList<String>();
		
		myL.add("A");
		myL.add("B");
		myL.add("C");
		myL.add("C");
		myL.add("D");
		myL.add("F");
		
		System.out.println(myL.size());
		
		System.out.println(myL.get(1));
		
		System.out.println(myL);
		
	}
	
	public static void main(String args[]){
		ListEx obj = new ListEx();
		obj.listExample();
	}
}
