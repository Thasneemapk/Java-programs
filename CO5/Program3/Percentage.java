import java.util.Scanner;
import java.awt.*;
import java.applet.*;

/*<applet code= "Percentage" height="300" width="300">

<param name=mark1 value=10>
<param name=mark2 2 value=28>
<param name=mark3 value=40>
<param name=mark4 value=58>
<param name=mark5 value=90>

</applet>*/
public class Percentage extends Applet{

String  param;
float total,percentage;
public void start()
{
param=getParameter("mark1");
int m1=Integer.parseInt(param);
param=getParameter("mark2");
int m2=Integer.parseInt(param);
param=getParameter("mark3");
int m3=Integer.parseInt(param);
param=getParameter("mark4");
int m4=Integer.parseInt(param);
param=getParameter("mark5");
int m5=Integer.parseInt(param);
total=m1+m2+m3+m4+m5;
percentage=(total / 500)*100;

}

    public void paint(Graphics g)
    {
 
     
        g.setColor(Color.yellow);
        g.fillOval(80, 70, 150, 150);
        g.setColor(Color.BLACK);
        g.fillOval(120, 120, 20, 20);
        g.fillOval(170, 120, 15, 15);
       g.drawString("total:" +String.valueOf(total),100,10);
       g.drawString("percentage:" +String.valueOf(percentage),100,60);
        if(percentage>50)
{
 g.drawArc(130, 170, 50, 20, 180, 180);
}
else
{
 g.drawArc(140,160,40,20,0,180);  
}
}
}
