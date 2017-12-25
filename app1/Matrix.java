package app1;

import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		// 2D Array
		Scanner sc=new Scanner(System.in);
		int [][] martix1=new int[4][4];
		//first=row size
		//second column
		//i'th row
		//j'th column
		//for now
		for(int i=0;i<4;i++)
		{
			//for now
			for(int j=0; j<4;j++)
			{
				martix1[i][j]=sc.nextInt();
			}
			
		}
		//output
		for(int i=0; i<4;i++)
		{
			//for column
			for(int j=0;i<4;j++)
			{
				System.out.println(martix1[i][j]+"\t");
			}
			System.out.println();
		}

	}

}
