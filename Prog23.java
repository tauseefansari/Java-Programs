import java.awt.*;
import java.applet.*;
//<applet code="Prog23.class" width=400 height=400></applet>
public class Prog23 extends Applet
{
	public void paint(Graphics g)
	{
		setBackground(Color.cyan);
		g.setColor(Color.yellow);
		g.fillOval(100,100,200,200);
		g.setColor(Color.black);
		g.fillOval(140,140,20,30);
		g.fillOval(240,140,20,30);
		g.drawArc(150,230,100,30,180,180);
	}
}