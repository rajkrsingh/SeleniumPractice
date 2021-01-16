package ArrayList;

import java.util.ArrayList;

public class ReverseArrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer> arr=new ArrayList<Integer>();
		ArrayList<Integer> arr1=new ArrayList<Integer>();
		
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(40);
		arr.add(50);
		arr.add(60);
		System.out.println("Before reverse:"+arr);
		int totIndex=arr.size();
		for(int i=totIndex-1;i>=0;i--){
		 arr1.add(arr.get(i));		 		
		}
		
		System.out.println("After Reverse::"+arr1);

		
	}

}
