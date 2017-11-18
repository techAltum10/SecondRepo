package javaP;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetEx {

	public void setExample(){
		//Dec List   - import from java.util
		Set<String> mySet = new HashSet<String>();
		
		mySet.add("A");
		mySet.add("B");
		mySet.add("C");
		mySet.add("C");
		mySet.add("D");
		mySet.add("F");
		
		System.out.println(mySet.size());
		
		System.out.println(mySet);
		
	}
	
	public static void main(String args[]){
		SetEx obj = new SetEx();
		obj.setExample();
	}
}
