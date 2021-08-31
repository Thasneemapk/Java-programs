import java.util.Scanner;
interface format{
	void calculate();
}
class Bill implements format{
		int id;
		String name;
		int q;
		int p;
		int total;
	public void calculate(){
		Scanner sc=new Scanner(System.in);
		System.out.print("\n"+"Enter product id.:");
		id=Integer.parseInt(sc.nextLine());
		System.out.print("\n"+"Enter product name:");
		name=sc.nextLine();
		System.out.print("\n"+"Enter quantity:");
		q=Integer.parseInt(sc.nextLine());
		System.out.print("\n"+"Enter unit price:");
		p=Integer.parseInt(sc.nextLine());
		total=q*p;
		}
	public void display(){
		System.out.println("\t"+id+"\t"+name+"\t"+q+"\t"+"\t"+p+"\t"+"\t"+total);
		}
	public static void main(String ar[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Order no.:");
		int on=sc.nextInt();
		System.out.println("Enter Date:");
		String date=sc.next();
		System.out.println("Enter no. of products:");
		int n=sc.nextInt();
		Bill[] b=new Bill[n];
		for(int i=0;i<n;i++)
		b[i]=new Bill();

		for(int i=0;i<n;i++){
			b[i].calculate();
		}
		System.out.println();
		System.out.println();
		System.out.println("Order No.:"+on);
		System.out.println();
		System.out.println("Date:"+date);
		System.out.println();
		System.out.println("Product Id"+"\t"+"Name"+"\t"+"Quantity"+"\t"+"unit price"+"\t"+"Total");
		for(int i=0;i<n;i++){
			b[i].display();
		}
		int net=0;
		for(int i=0;i<n;i++){
			net=net+b[i].total;
		}
		System.out.println("\t"+"\t"+"\t"+"\t"+"\t"+"     Net.Amount:"+net);
	}
}