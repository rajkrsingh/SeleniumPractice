package ArrayAssignment;

public class printPattern {

	public static void main(String[] args) {

/*
Question 3: Try to print the following pattern on the console:
    n = 4
    n = 3
    n = 2
    n = 1
    n = 0

*/
		int n[] = new int[5];
		n[0]=4;
		n[1]=3;
		n[2]=2;
		n[3]=1;
		n[4]=0;
		
		for(int i=0; i<=4;i++){
		System.out.println("n="+n[i]);
	  }
	}

}
