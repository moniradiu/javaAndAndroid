package app1;

public class loop {

	public static void main(String[] args) {
		int a,b;
		a=10;
		b=30;
//		calculateNumber(12,14);
		
		prln(calculateNumber(a,b));
		

	}
	
	//return type value show.
	static int calculateNumber(int number1,int number2){
		int result=number1+number2;
		return  result;
		
		
	}
	//Method create
		static void prln(Object anyObject){ //this method no returns value.just print value.
			System.out.println(i);
			
		}
		
		static void pr(Object anyObject){// this method other type.
			System.out.println(anyObject);
			
		}

}
