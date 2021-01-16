package ArrayList;

import java.util.ArrayList;

public class TrimVirtualCapacity {

	public static void main(String[] args) {
	  
		//By default virtual capacity of Array List is 10
		ArrayList<Integer> arr=new ArrayList<Integer>(); //By default, virtual capacity is 10
		//ArrayList<Integer> arr1=new ArrayList<Integer>(2); //Virtual capacity is 2
		arr.add(100);
		arr.add(200);
		arr.add(300);
		arr.add(400);
		arr.add(500);
		arr.add(600);
		arr.add(700);
		arr.add(800);
		arr.add(900);
		arr.add(1000);
		System.out.println(arr);
		arr.ensureCapacity(10);
		//System.out.println(arr);
		
		//for each: jdk 1.8 with lamda
		arr.forEach(value ->System.out.println(value));
	}

}
