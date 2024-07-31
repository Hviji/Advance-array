import java.util.Scanner;
public class matrixmultiply
{
public static void main(String []args)
{
int row1,col1,row2,col2;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the row 1");
row1=sc.nextInt();
System.out.println("Enter the row 2");
row2=sc.nextInt();
System.out.println("Enter the col 1");
col1=sc.nextInt();
System.out.println("Enter the col 2");
col2=sc.nextInt();
if(col1!=row2)
{
System.out.println("Matrix multiplication is not possible");
}
else
{
int a[][]=new int[row1][col1];
int b[][]=new int[row2][col2];
int c[][]=new int [row1][col2];
System.out.print("Enter the A matrix");
for(int i=0;i<row1;i++)
{
for(int j=0;j<col1;j++)
{
a[i][j]=sc.nextInt();
}
}
System.out.print("Enter the B matrix");
for(int i=0;i<row2;i++)
{
for(int j=0;j<col2;j++)
{
b[i][j]=sc.nextInt();
}
}
System.out.print("Matrix multiplication is ");
for(int i=0;i<row1;i++)
{
for(int j=0;j<col2;j++)
{
c[i][j]=0;
for(int k=0;k<col1;k++)
{
c[i][j]=a[i][k]*b[k][j];
System.out.print(c[i][j] + " ");
}
System.out.println (" ");
}
}
}
}
}

