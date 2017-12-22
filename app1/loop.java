package app1;

public class loop {

	public static void main(String[] args) {
		int a,b;
		a=10;
		b=30;
		
		int [] numberArray=new int[100];
		int i=100;
		
		while(i>0){
			numberArray[i-1]=i-1;
			i--;
		}
		
//		while(i<100){
//			prln("array["+i+"]:"+numberArray[i]);
//			i++;
//		}
		
		int j=2;
		do{
			prln("do-while loop:");
			prln(j);
		}
		while( j<2 && j>0 );
		
		while( j<2 && j>0 ){
			prln("while loop:");
			prln(j);
			
		}
		
//		calculateNumber(12,14);
		
		//prln(calculateNumber(a,b));
		

	}
	
	//return type value show.
	/*static int calculateNumber(int number1,int number2){
		int result=number1+number2;
		return  result;
		
		
	}*/
	//Method create
		static void prln(Object anyObject){ //this method no returns value.just print value.
			System.out.println(anyObject);
			
		}
		
		static void pr(Object anyObject){// this method other type.
			System.out.println(anyObject);
			
		}

}
