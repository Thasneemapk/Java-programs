class Box
{
double width;
double height;
double depth;
void volume()
{
System.out.println("volume is");
System.out.println(width*height*depth);
}
}
class BoxDemo3
{
public static void main(String args[])
{
Box mybox1=new Box();
Box mybox2=new Box();
mybox1.width=10;
mybox1.height=6;
mybox1.depth=4;
mybox2.width=40;
mybox2.height=60;
mybox2.depth=45;
mybox1.volume();
mybox2.volume();
}
}
