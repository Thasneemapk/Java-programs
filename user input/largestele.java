import java.util.Scanner;
public class largestele
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
System.out.println("Largest element in the array:");
large=a[0];
for(int i=0;i<n;i++)
  if(a[i]>large)
      large=a[i];
      System.out.println(large);
}
}