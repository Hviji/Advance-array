/*
Write a program to find the sum of two matrices of the same size.
*/
import java.util.Scanner;
public class matrixadd
{
	public static void main(String[] args) {
	    System.out.println("Enter the first matrix");
	    Scanner sc=new Scanner(System.in);
	    int a[][]=new int[2][2];
	    int b[][]=new int[2][2];
	   	    int c[][]=new int[2][2];
	    int row,col;
	    //first elements 
	    for(row=0;row<2;row++)
	    {
	        	    for(col=0;col<2;col++)
	        	    {
	        	        a[row][col]=sc.nextInt();
	        	    }

	    }
	    //second elements 
	    	    System.out.println("Enter the second matrix ");

	    for(row=0;row<2;row++)
	    {
	        	    for(col=0;col<2;col++)
	        	    {
	        	        b[row][col]=sc.nextInt();
	        	    }

	    }
	    //print the matrix a nd b 
	    System.out.println("The A matrix");

	    for(row=0;row<2;row++)
	    {
	        	    for(col=0;col<2;col++)
	        	    {
	        	      	    System.out.print(a[row] [col] + " ");
	        	    }
	        	    	    	        	    	        	 System.out.println();

	    }
	    	    System.out.println("The B matrix");


	        	      	  
	        	      	    for(row=0;row<2;row++)
	    {
	        	    for(col=0;col<2;col++)
	        	    {


  	        	      	    System.out.print(b[row] [col] + " ");


	        	    }
	        	    	        	 System.out.println();

   

	    }

	    // c matrix

	    for(row=0;row<2;row++)
	    {
	        	    for(col=0;col<2;col++)
	        	    {
	        	        c[row][col]=a[row][col]+b[row][col];
	        	    }

	    }
	    //output
	    System.out.println("The addition of the matrix is ");
	    for(row=0;row<2;row++)
	    {
	        	    for(col=0;col<2;col++)
	        	    {
	        	        c[row][col]=a[row][col]+b[row][col];
	        	    
	        	        		System.out.print(c[row][col] +  " ");

	        	    }
	        	    
System.out.println();
	    }
	    
																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																		    
	    
	    
	}
}










