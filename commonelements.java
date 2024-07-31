/*
Write a program to find the common elements between two arrays of integers.
*/
/*public class commonelements
{
	public static void main(String[] args) 
	{
	    int []a={2,4,5,3,4};
	    int []b={3,5,5,18,43};
	    	        		System.out.println("The common elements of array are ");

	    for(int i=0;i<a.length;i++)
	    {

	        for(int j=0;j<b.length;j++)

	       if(a[i]==b[j])

	       {
	           		System.out.print( " " + a[i]);

	       }
	        }
	    }
	}*/

public class commonelements
{
	public static void main(String[] args) 
	{
	    int []a={2,4,5,3,4};
	    int []b={,5,5,18,43};
	    int count=0;
	    	        		System.out.println("The common elements of array are ");

	    for(int i=0;i<a.length;i++)
	    {

	        for(int j=0;j<b.length;j++)
	        {

	       if(a[i]==b[j])
	       {
	       count++;
              a[i-1]=0;
  }
  }
  
  
  if(count!=0 && a[i]!=0)
  {
  
  System.out.println(a[i]);
    count=0;

  }
  }
  }
  }
  
  
  
 
 
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
