/*
Write a program to sort an array of integers in ascending and descending order.
*/
public class arraysort
{
public static void main(String args[])
{
int temp=0;
int []a={23,54,3};
     for(int i=0;i<a.length;i++)
       {
           for(int j=i+1;j<a.length;j++)
            {
               if(a[i]>a[j])
                   {
               temp=a[i];
               a[i]=a[j];
               a[j]=temp;
                       }
             }
        }
        System.out.println("The ascending order of the array is = " );
   for(int i=0;i<a.length;i++)
   {   
  System.out.println(a[i]);             
}
}
}
    //// descending order :
    
    
   /* public class arraysort
{
public static void main(String args[])
{
int temp=0;
int []a={23,54,3,4,23,6,78,98};
     for(int i=0;i<a.length;i++)
       {
           for(int j=0;j<i+1;j++)
            {
               if(a[i]>a[j])
                   {
               temp=a[i];
               a[i]=a[j];
               a[j]=temp;
                       }
             }
        }
        System.out.println("The descending  order of the array is = " );
   for(int i=0;i<a.length;i++)
   {   
  System.out.println(a[i]);             
}
}
}  */
