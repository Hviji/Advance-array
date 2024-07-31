public class maxmin
{
	public static void main(String[] args) {
	    int[]a={45,23,9};
	    
	    int min=a[0];
	    	    int max=a[0];
	    	    int i=0;

	    for( i=0;i<a.length;i++)
	    {
	        if(a[i]<min)
	        	    min=a[i];

	        if(a[i]>max)
	    
	    max=a[i];
	    }
	   
		System.out.println("The minimum number is " + min );
				System.out.println("The maximum number is " + max );

	
}
}

