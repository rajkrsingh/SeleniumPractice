package ArrayList;

import java.util.ArrayList;

public class RemoveThirdElement {
	
	public static void main(String args[]){
		
		ArrayList<Integer> arr=new ArrayList<Integer>();
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(40);
		arr.add(50);
		System.out.println(arr);
		arr.remove(2);
		System.out.println(arr);
	}

}
