class product
{
int pcode;
String pname;
double price;
}
class prod1
{
public static void main(String args[])
{
product p1=new product();
product p2=new product();
product p3=new product();
p1.pcode=101;
p1.pname="Notebook";
p1.price=30;
p2.pcode=102;
p2.pname="File";
p2.price=50;
p1.pcode=103;
p2.pname="pen";
p3.price=15;
if(p1.price<p2.price)
  if(p1.price<p3.price)
    System.out.println("The lowest price is "+p1.price);
  else
    System.out.println("The lowest price is "+p3.price);
else 
  if(p2.price<p3.price)
    System.out.println("The lowest price is "+p2.price);
  else
    System.out.println("The lowest price is "+p3.price);
}
}







