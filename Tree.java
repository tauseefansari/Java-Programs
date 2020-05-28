import java.awt.*;
import javax.swing.*;
import javax.swing.tree.*;
public class Tree extends JApplet
{
	JTree tree;
	public void init()
	{
		DefaultMutableTreeNode top = new DefaultMutableTreeNode("Top");
		DefaultMutableTreeNode a = new DefaultMutableTreeNode("First");
		DefaultMutableTreeNode b = new DefaultMutableTreeNode("Second");
		DefaultMutableTreeNode c = new DefaultMutableTreeNode("one");
		DefaultMutableTreeNode d = new DefaultMutableTreeNode("Two");

		top.add(a);top.add(b);a.add(c);b.add(d);
		tree = new JTree(top);

		getContentPane().add(tree);
	}
}
//<applet code="Tree.class" height="500" width="500"></applet>