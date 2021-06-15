import java.util.Scanner;
public class nofele
{
public static void main(String args[])
{
int n,large;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the no:of elements:");
n=sc.nextInt();
int a[]=new int[10];
System.out.println("Enter the elements of the array:");
for(int i=0;i<n;i++)
{
  a[i]=sc.nextInt();
}
System.out.println("No:of elements present in the array:"+n);
}
}