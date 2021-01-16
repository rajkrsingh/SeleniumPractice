package ArrayList;

import java.util.ArrayList;

public class ArraySearchElement {

	public static void main(String[] args) {
		ArrayList<Integer> arr=new ArrayList<Integer>();
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(40);
		arr.add(50);
		arr.add(60);
		arr.add(70);
		arr.add(80);
		System.out.println(arr);

		for(int i=0;i<arr.size();i++){
			if(arr.contains(80)){
				System.out.println("Element found in array list");
				//break;
			}
			else
				System.out.println("Element is not found in array list");
			break;
		}
		
		
	}
	//System.out.println(arr.contains(90));





}
