public class secondmax
{
	public static void main(String[] args) {


	    int max=0;
	    int a[]={888,567,1000,875};
	    	    int secondmax=a[0];
	    	    	    int  thirdmax=a[0];
	           for(int i=0;i<a.length;i++)
	           {
	 
	    if(a[i]>max)
	    {
	    secondmax=max;
	    max=a[i];
	    }
	    
	       else if (a[i]>secondmax) 
	       {
                secondmax = a[i];
            } 
	           }
	           System.out.println("The secondlargest element in an array is " + secondmax);
	    
	    	
	}
}



        
        
            
            


