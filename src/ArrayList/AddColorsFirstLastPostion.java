package ArrayList;

import java.util.ArrayList;

public class AddColorsFirstLastPostion {


	//.lenth() funcation is used for array and .size() is used for arraylist
	public static void main(String[] args) {
		//		ArrayList<String> arr=new ArrayList<String>();
		//		arr.add("Raj");
		//		arr.add("Singh");
		//		arr.add("Barari Harkesh(Kuti par)");
		//		arr.add("Gopalganj");
		//		arr.add("Bihar");	

		ArrayList<String> col=new ArrayList<String>();
		col.add("Red");
		col.add("Green");
		col.add("Blue");
		col.add("Yellow");
		col.add("Black");
		System.out.println(col);
		System.out.println(col.size());
		System.out.println(col.contains("Yellow"));
		System.out.println(col.indexOf("Blue")>0);


		//Print array value using for loop
		System.out.println("*********************************************");
		for(int i=0;i<col.size();i++)
			System.out.println(col.get(i));

		System.out.println("*********************************************");	
		for(Object e:col){
			System.out.println(e);
		}
		
		
		System.out.println("*******Array List**************************");
		System.out.println(col);
		
		System.out.println("**********Adding at first position***********************");

		//Inserting at first position
		col.set(0, "Black");
		System.out.println(col);
		
		
		System.out.println("**************Adding at last position*******************");
		//System.out.println(col.add());
		int arraysize=col.size();

		//Inserting at last position
		col.set(arraysize-1, "White");
		System.out.println(col);
		
	
	}

}
