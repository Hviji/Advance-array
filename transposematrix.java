/*
Write a program to find the transpose of a matrix.
*/
import java.util.Scanner;
public class transposematrix
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    		System.out.print("Enter a matrix values");
	    int row,col;
 int matrix[][]=new int [3][3];
	     for(row=0;row<3;row++)
	    {

	        	    for(col=0;col<3;col++)
	        	    {
	        	         matrix[row][col]=sc.nextInt();

	        	    }
	    }
	   	   		System.out.println("Original matrix");
		for(row=0;row<3;row++)
	    {
	        	    for(col=0;col<3;col++)
	        	    {
	        	        		System.out.print(matrix[row] [col] + " ");
	        	    }
	        	    		System.out.println();


	        	    }
 
		System.out.println(" transpose matrix");
		for(row=0;row<3;row++)
	    {
	        	    for(col=0;col<3;col++)
	        	    {
	        	        		System.out.print(matrix[col] [row] + " ");
	        	    }
	        	    		System.out.println();


	        	    }
	}
}

