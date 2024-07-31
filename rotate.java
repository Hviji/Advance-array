/******************************************************************************
Write a program to rotate the elements of an array by a given number of positions.
*******************************************************************************/
public class rotate
{
	public static void main(String[] args) {
	    int num[]={1,2,3,4,5,6,7};
	    int k=3;
	    int n=0;
	    n=num.length;
	    int[]temp=new int[n-k];
	    for(int i=0;i<k-n;i++)
	    {
	        temp[i]=num[i];
	    }
	    for(int i=0;i<k;i++)
	    {
	        num[i]=num[n-k+i];
	    }
	    for(int i=0;i<n-k;i++)
	    {
	        num[k+i]=temp[i];
	    }
	    System.out.println("Rotational array are : ");
	    	    for(int i=0;i<n;i++)
	    	    System.out.printf(num[i] + " ");


	    
	}
}



