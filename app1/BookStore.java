package app1;

import java.util.Scanner;

public class BookStore {
	static Scanner myScanner=new Scanner(System.in);
	static String[] books={"Java","C","Php"};
	
	static final double studentDiscount=0.3;
	static final double teacherDiscount=0.4;
	static final double alienDiscount=0.0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		prln("--------Welcome To our Bookstore------");
		prln("Which book do you want?\nAns: ");
		
		// condition for user any text typing  like: JAVA,Java,JaVA.but program is using small text.
		String userChoice=myScanner.nextLine();
		if(books[0].toLowerCase().equals(userChoice.toLowerCase())){
			prln("You opted for"+books[0]+"Book.");
			calculatePrice(books[0]);
			
		}else if(books[1].toLowerCase().equals(userChoice.toLowerCase())){
			prln("You opted for"+books[1]+"Book.");
			calculatePrice(books[1]);
		}
		else if(books[2].toLowerCase().equals(userChoice.toLowerCase())){
			prln("You opted for"+books[2]+"Book.");
			calculatePrice(books[2]);
		}
	else{
			prln("Sorry, we don't have that book");
		}
		
		
		

	}
	//calculate book price and show.
	static void calculatePrice(String bookName){
		prln("Are you Student,Teacher,alien?\nAns:");
		String answer=myScanner.nextLine();
		
		 double price=200;
		 
		if(answer.toLowerCase().equals("teacher")){
			price=price-(price*teacherDiscount);
			showPrice(price);
			
		}else if(answer.toLowerCase().equals("student")){
			price=price-(price*studentDiscount);
			showPrice(price);
			
		}else if(answer.toLowerCase().equals("alien")){
			price=price-(price*alienDiscount);
			showPrice(price);
			
		}else{
			prln("Sorry, we can`t serve you.");
		}
		
	}
	static void showPrice(double price){
		
		prln("Your Total payable amount:" + price);
		prln("\n-------------THANK YOU FOR SHOP FROMOUR BOOKSTORE");
		
	}

	
	
	//Method create
	static void prln(Object anyobject){ //this method no returns value.just print value.
		System.out.println(anyobject);
		
	}
	
	static void pr(Object anyObject){// this method other type.
		System.out.println(anyObject);
		
	}

}
