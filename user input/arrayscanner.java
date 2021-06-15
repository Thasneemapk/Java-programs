import java.util.Scanner;
public class arrayscanner
{
public static void main(String args[])
{
int n;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the no:of elements:");
n=sc.nextInt();
int a[]=new int[10];
System.out.println("Enter the elements of the array:");
for(int i=0;i<n;i++)
{
  a[i]=sc.nextInt();
}
System.out.println("Array elements are:");
for(int i=0;i<n;i++)
  System.out.println(a[i]);
}
}