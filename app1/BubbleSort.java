package app1;

public class BubbleSort {

	public static void main(String[] args) {
		// Bubble sort with try and catch block use.
		int[] array={8,6,7,6,5};
		int n=array.length;
		//Possible code option error use the try block.
		try
		{
			for( int i=0; i<4; i++)
			{
				//for column
				for(int j=0; j<4; j++)
				{
					if(array[j]>array[j+1])
					{
						int temp=array[j+1];
						array[j+1]=array[j];
						array[j]=temp;
					}
				}
			}
			
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Error: "+e);
		}
		
		for(int i :array)
		{
			System.out.println("Value: "+i);
		}
	}

}
