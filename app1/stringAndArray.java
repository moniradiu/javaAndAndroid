package app1;

public class stringAndArray {

	public static void main(String[] args) {
		// String create
		String myName;
		String ranyDay;
		
		
		myName =new String("shaini, bani,konu");
		ranyDay =new String("Today Rany Day");
		
		System.out.println("This is previouse Method");
		System.out.println(myName);
		
		System.out.println("This is new Method: :) ");
		prln(ranyDay);
		
		//String Length print.
		String myDreams;
		int a=10;
		myDreams=new String("muni   ra");
		
	
		
		prln("\nThis is Method show:");
		prln(myDreams);//name print
		prln("\n\nThe Number Of Charaters in Your Name is:"+myDreams.length());//name length show
		
		//Array
		// One Dimensional Array declare: 1 2 3 4 5 6 int[]=new int[8];
		// 1row
		
		//Two Dimensional Array declare: 1 2  3 4 5 6  int[][] twoDArray=new int[2][6];
		//	2row 6column				4 22 6 8 7 3 
		
		int[][] twoDArray=new int[2][6];
		//1 no row
		twoDArray[0][0]=1;
		twoDArray[0][1]=2;
		twoDArray[0][2]=3;
		twoDArray[0][3]=4;
		twoDArray[0][4]=5;
		twoDArray[0][5]=6;
		//2 no row
		twoDArray[1][0]=4;
		twoDArray[1][1]=22;
		twoDArray[1][2]=6;
		twoDArray[1][3]=8;
		twoDArray[1][4]=7;
		twoDArray[1][5]=3;
		
		//jog korbo row 3.
		// jog korbo row 6
		
		twoDArray[1][2]+=(twoDArray[0][2]+twoDArray[0][3]);
		prln("at 2DArray[1][2]"+twoDArray[1][2]);
		
		
		//Three Dimensional Array declare: 1 2 3 4 5 66   int[][][]=new int[8];
		// 3row 6column                    4 22 6 8 7 3 
		//                                 4 8 6 8 7 3 
		

	}
	//Method create
	static void prln(Object anyobject){ //this method no returns value.just print value.
		System.out.println(anyobject);
		
	}
	
	static void pr(Object anyObject){// this method other type.
		System.out.println(anyObject);
		
	}

}
