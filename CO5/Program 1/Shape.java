import java.applet.Applet;

import java.awt.*;
 /*
      <applet code = "Shape" width = "4000" height = "520"></applet>
*/
 
public class Shape extends Applet{
 
 public void init() {
       
        setBackground(Color.pink);
    }
 
 public void paint(Graphics g){
 g.setColor(Color.blue);
 g.drawLine(10,10,50,10);
 g.drawRect(70,10,35,50);
 g.drawOval(150,10,100,100);

 }
}
