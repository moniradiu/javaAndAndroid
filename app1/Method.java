package app1;

public class Method {

	public static void main(String[] args) {
		// Method.
		int FirstShortNumber;
		int SecondIntnumber;
		
		FirstShortNumber=10;
		SecondIntnumber=5;
		
		
		boolean statrment=prokriya(FirstShortNumber,SecondIntnumber);
		System.out.println(statrment);

	}
	
	
	static public boolean prokriya(int firstValue, int secondValue){
		boolean answer= firstValue>secondValue;
		return answer;
		}

}
