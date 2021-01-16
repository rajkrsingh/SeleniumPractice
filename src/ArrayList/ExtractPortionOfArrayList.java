package ArrayList;

import java.util.ArrayList;

public class ExtractPortionOfArrayList {
	
	
	public static void main(String args[]){
	ArrayList<Integer> arr=new ArrayList<Integer>();
	arr.add(100);
	arr.add(200);
	arr.add(300);
	arr.add(400);
	arr.add(500);
	arr.add(600);
	arr.add(700);
	arr.add(800);
	System.out.println(arr);
	System.out.println(arr.subList(4, 7));
	}
	

}
