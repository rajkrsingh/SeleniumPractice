package ArrayList;

import java.util.ArrayList;

public class UpdateSpecificArray {
	
	public static void main(String[] args){
	ArrayList<String> ar=new ArrayList<String>();
	ar.add("Raj");
	ar.add("Ayush");
	ar.add("Kavya");
	ar.add("Prabhash");
	ar.add("Trisha");
	System.out.println(ar);
	System.out.println(ar.size());
	ar.set(0, "raj k singh");
    System.out.println(ar);
    ar.set(4, "Trisha Kumari");
    System.out.println("*************************");
    System.out.println(ar);
}
}