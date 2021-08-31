import java.util.Scanner;
interface Sports{
	void enterSportsData();
	void displaySportsData();
}
class Student{
	int rno;
	String name;
	int per1;
	int per2;
	public void enterStdDetails(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the roll number:");
		rno=sc.nextInt();
		System.out.println("Enter the name:");
		name=sc.next();
		System.out.println("Enter the percentage of sem 1:");
		per1=sc.nextInt();
		System.out.println("Enter the percentage of sem 2:");
		per2=sc.nextInt();
		
	}
	public void displayStdDetails(){
		System.out.println("--------------------------");
		System.out.println("STUDENT DETAILS");
		System.out.println("--------------------------");
		System.out.println("Roll no:"+rno);
		System.out.println("Name:"+name);
		System.out.println("Percentage obtained in first semester:"+per1);
		System.out.println("Percentage obtained in second semester:"+per2);
	}
}
class Result extends Student implements Sports{
	String iname;
	int score;

	public void academicDetails(){
		float per=(per1+per2)/2;
		System.out.println("--------------------------");
		System.out.println("Academic Details");
		System.out.println("-----------------------------");
		System.out.println("Total Percentage:"+per);
	}
	public void enterSportsData(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of item participated:");
		iname=sc.next();
		System.out.println("Enter the score obtained:");
		score=sc.nextInt();
	}
	public void displaySportsData(){
		System.out.println("--------------------------");
		System.out.println("sports details");
		System.out.println("------------------------------");
		System.out.println("item participated:"+iname);
		System.out.println("Score obtained:"+score);

	}
}
class Academic{
	public static void main(String ar[]){
		Result ob=new Result();
		ob.enterStdDetails();
		ob.enterSportsData();
		ob.displayStdDetails();
		ob.academicDetails();
		ob.displaySportsData();
	}
}