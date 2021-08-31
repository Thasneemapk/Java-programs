import java.util.Scanner;
interface Dimension{
	float pi=3.14f;
	void area();
	void perimeter();
}
class Circle implements Dimension{
	
	
	public void area(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius:");
		int r=sc.nextInt();
		float a=pi*r*r;
		System.out.println("Area of Circle : "+a);
	}
	public void perimeter(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius:");
		int r=sc.nextInt();
		float p=2*pi*r;
		System.out.println("Perimeter of Circle : "+p);
	}
}
class Rectangle implements Dimension{
	
	public void area(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length:");
		int l=sc.nextInt();
		System.out.println("Enter breadth:");
		int b=sc.nextInt();
		float a=l*b;
		System.out.println("Area of Rectangle : "+a);
	}
	public void perimeter(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length:");
		int l=sc.nextInt();
		System.out.println("Enter breadth:");
		int b=sc.nextInt();
		float p=2*(l+b);
		System.out.println("Perimeter of Rectangle : "+p);
	}
}
class Menu{
	public static void main(String ar[]){
	int ch;
	Scanner sc=new Scanner(System.in);
	Circle c=new Circle();
	Rectangle r=new Rectangle();
	
	while(true){
		System.out.println("--------------MENU----------------");
		System.out.println("1 for Area of Circle");
		System.out.println("2 for Perimeter of Circle");
		System.out.println("3 for Area of Rectangle");
		System.out.println("4 for Perimeter of Rectangle");
		System.out.println("5 to exit");
		System.out.println("-----------------------------------");
		System.out.println("Enter your choice");
		ch=sc.nextInt();
		switch(ch){
			case 1:
				c.area();
				break;
			case 2:
				c.perimeter();
				break;
			case 3:
				r.area();
				break;
			case 4:
				r.perimeter();
				break;
			case 5:
				System.exit(0);
			default:
				System.out.println("Invalid!!!");
		}
	}
	}
}