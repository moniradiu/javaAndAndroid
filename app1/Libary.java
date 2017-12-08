package app1;

import java.util.Scanner;

public class Libary {
	
 static Scanner myScanner=new Scanner(System.in);
 
	public static void main(String[] args) {
		// Library using.
		
		int FirstShortNumber;
		int SecondIntnumber;
		
		FirstShortNumber=10;
		SecondIntnumber=5;
		boolean statement;
		
		System.out.println("please give us number to be multi by 100: ");
		int resultNew=prokriya(SecondIntnumber);
		
		System.out.println(resultNew);

	}
	static public int prokriya(int firstValue){
		firstValue*=100;
		return firstValue;
		}
}
