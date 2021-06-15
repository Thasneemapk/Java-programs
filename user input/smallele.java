import java.util.Scanner;
public class smallele
{
public static void main(String args[])
{
int n,small;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the no:of elements:");
n=sc.nextInt();
int a[]=new int[10];
System.out.println("Enter the elements of the array:");
for(int i=0;i<n;i++)
{
  a[i]=sc.nextInt();
}
System.out.println("Smallest element in the array:");
small=a[0];
for(int i=0;i<n;i++)
  if(a[i]<small)
      small=a[i];
      System.out.println(small);
}
}