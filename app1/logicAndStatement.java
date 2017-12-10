package app1;

import java.util.Scanner;

public class logicAndStatement {
	static Scanner myScanner=new Scanner(System.in);
	public static void main(String[] args) {
		// if-else,switch statement,And control flow.
		

				
				//String Length print.
				String myDreams;
				//int a=10;
				//myDreams=new String("muni aaaaaa ra");
				
				
			    pr("Please write your name:");//if,else, condition maintained below flow with Scanner library
			    myDreams=myScanner.nextLine();
			
			
				
				if(myDreams.length()>15){
					prln("your name is too much long");
					
				}else if(myDreams.length()<3){
					prln("your name is too short");
				}
				//use of switch case using
				else{
					switch(myDreams.length()){ //using switch case value assign. like 8.
					case 7:
						prln(" You have a lucky name :) ");
						break;
					case 12:
						prln(" You have a 12 char name :) ");
						break;
					case 13:
						prln(" You have a 13 char  name :) ");
						break;
					case 14:
						prln(" You have a quite long name :) ");
						break;
							
							default:
								prln("your name is Okay");
								break;
					
					}
					
				}
					
//					if(myDreams.length()==7){
//						prln(" You have a lucky name :) ");
//						
//					}else{
//					prln("your name is Okay");
//					}
					
				//}
				
			
				
				
	
	}
	
	//Method create
	static void prln(Object anyobject){ //this method no returns value.just print value.
		System.out.println(anyobject);
		
	}
	
	static void pr(Object anyObject){// this method other type.
		System.out.println(anyObject);
		
	}

	

}
