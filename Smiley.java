import java.awt.*;
import java.applet.*;
//<applet code="Smiley.class" width=400 height=400></applet>
public class Smiley extends Applet
{
	public void paint(Graphics g)
	{
		g.setColor(Color.yellow);
		g.fillOval(100,100,200,200); //Main Face
		g.setColor(Color.black);
		g.drawLine(200,180,200,220); //Nose
		g.fillOval(150,150,20,30); //Left Eye
		g.fillOval(230,150,20,30); //Right Eye
		g.drawArc(160,220,80,40,180,180); //Mouth
	}
}