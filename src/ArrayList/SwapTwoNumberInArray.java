package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class SwapTwoNumberInArray {

	public static void main(String[] args) {
		
		ArrayList<Integer> arr=new ArrayList<Integer>();
		
		arr.add(100);
		arr.add(200);
		arr.add(300);
		arr.add(400);
		arr.add(500);
		System.out.println("Before swap:"+arr);
		Collections.swap(arr, 2, 4);
		System.out.println("After swap of 2 numbers:"+arr);
		
		

	}

}
