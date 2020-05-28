import java.awt.*;
import javax.swing.*;
import javax.swing.tree.*;
public class TreeDir extends JApplet
{
	JTree tree;
	public void init()
	{
		Container con = getContentPane();
		con.setLayout(new BorderLayout());
		DefaultMutableTreeNode top = new DefaultMutableTreeNode("Vehicles");
		DefaultMutableTreeNode car = new DefaultMutableTreeNode("Car");
		DefaultMutableTreeNode bike = new DefaultMutableTreeNode("Bike");
		DefaultMutableTreeNode c1 = new DefaultMutableTreeNode("Lamborghini");
		DefaultMutableTreeNode c2 = new DefaultMutableTreeNode("Ferrari");
		DefaultMutableTreeNode c3 = new DefaultMutableTreeNode("Porsche");
		DefaultMutableTreeNode b1 = new DefaultMutableTreeNode("Duccati");
		DefaultMutableTreeNode b2 = new DefaultMutableTreeNode("Harley Davidson");
		DefaultMutableTreeNode b3 = new DefaultMutableTreeNode("Suzuki");
		
		top.add(car);top.add(bike);
		car.add(c1);car.add(c2);car.add(c3);
		bike.add(b1);bike.add(b2);bike.add(b3);
		
		tree = new JTree(top);
		
		int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
		int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
		
		JScrollPane scroll = new JScrollPane(tree,v,h);
		con.add(scroll,BorderLayout.CENTER);
	}
} 
//<applet code="TreeDir.class" width="200" height="200"></applet>