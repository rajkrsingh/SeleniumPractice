package ArrayAssignment;

/*
 Question 2: Write a program to create a static Array, having following cricket data:
--name, age, team name, DOB, gender, Strike Rate
--Try to create multiple Object Arrays for different players 
--Try to print all the values of each player on the console


 */

public class StaticArray {


	//static arrray:Size is fixed
	//Dynamic array :Size is not fixed
	//int i=10---it means it will take 4 bytes in memory

	public static void main(String[] args) {

		/*	String Name[]=new String[3];
		int Age[]=new int[3];
		String teamName[]=new String[3];
		String DOB[]=new String[3];
		String gender[]=new String[3];
		double strikeRate[]=new double[3];


		Name[0]="Virat";
		Age[0]=32;
		teamName[0]="RCB";
		DOB[0]="05 Nov-1988";
		gender[0]="Male";
 		strikeRate[0]=130.74;


		Name[1]="MS Dhoni";
		Age[1]=39;
		teamName[1]="Chennai Super Kings";
		DOB[1]="07 July-1981";
		gender[1]="Male";
		strikeRate[1]=136.76;


		Name[2]="Rohit Sharma";
		Age[2]=33;
		teamName[2]="Mumbai Indians";
		DOB[2]="30 April-1987";
		gender[2]="Male";
		strikeRate[2]=130.62;

		Name[2]="Hardik Pandya";
		Age[2]=27;
		teamName[2]="Mumbai Indians";
		DOB[2]="11 Oct-1987";
		gender[2]="Male";
		strikeRate[2]=159.27;

		for(int i=0; i<3;i++){
			System.out.println("Name::" + Name[i] + " Age:" + Age[i]+ " Team Name: " + teamName[i] + " DOB: " + DOB[i] + " Gender:" + gender[i]+ " Strike Rate: "+strikeRate[i]);
		}

		 */		

		Object ob[]=new Object[6];

		ob[0]="Virat";
		ob[1]="32";
		ob[2]="RCB";
		ob[3]="05 Nov-1988";		
		ob[4]="Male";
		ob[5]="130.74";

		for(Object e:ob){
			System.out.println(e);
		}
		
		
		System.out.println("**********************************");
		Object ob1[]=new Object[6];

		ob1[0]="MS Dhoni";
		ob1[1]="39";
		ob1[2]="CSK";
		ob1[3]="07 July-198";		
		ob1[4]="Male";
		ob1[5]="136.76";

		for(Object e:ob1){
			System.out.println(e);
		}
		
		
		System.out.println("**********************************");
		Object ob2[]=new Object[6];
		ob2[0]="Rohit sharma";
		ob2[1]="33";
		ob2[2]="Mumbai Indians";
		ob2[3]="30 April-1987";
		ob2[4]="Male";
		ob2[5]="130.62";
		
		for(Object e:ob2){
			System.out.println(e);
		}


	}

}
