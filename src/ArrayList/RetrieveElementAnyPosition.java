package ArrayList;

import java.util.ArrayList;

//Write a Java program to retrieve an element (at a specified index) from a given array list.

public class RetrieveElementAnyPosition {

	public static void main(String[] args) {
		ArrayList<String> ar=new ArrayList<String>();
		
		ar.add("Red");
		ar.add("Green");
		ar.add("Blue");
		System.out.println("Array List::"+ar);
		ar.set(2, "Yellow");
		System.out.println("Array List::"+ar);
		
		for(Object e:ar){
			System.out.println(e);
		}
		
		System.out.println("***********************");
		int totsize=ar.size();
		System.out.println("first index element::"+ar.get(0));
		
		System.out.println("third index element::"+ar.get(2));
//		for(int i=0;i<totsize;i++){
//			System.out.println(ar.get(i));	
//		}
//		
		
		
		
	}

}
