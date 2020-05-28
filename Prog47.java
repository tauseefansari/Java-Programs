import java.awt.*;
import java.applet.*;
//<applet code="Prog47.class" width=400 height=400></applet>
public class Prog47 extends Applet
{
	public void paint(Graphics g)
	{
		setBackground(Color.cyan);
		int[] x={200,360,40};
		int[] y={20,190,190};
		g.setColor(Color.red); 
		g.fillPolygon(x,y,3); //Top
		g.setColor(Color.yellow);
		g.fillRect(70,190,260,200); //Main Area
		g.setColor(Color.blue);
		g.fillRect(170,309,60,80); //Door
		g.setColor(Color.green);
		g.fillRect(100,220,60,60); //Left Window
		g.fillRect(240,220,60,60); //Right Window
		g.setColor(Color.white);
		g.drawLine(100,250,160,250); //Left Window Line 1
		g.drawLine(130,220,130,280); //Left Window Line 2
		g.drawLine(240,250,300,250); //Right Window Line 1
		g.drawLine(270,220,270,280); //Right Window Line 2
	}
}