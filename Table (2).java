import javax.swing.*;
import java.awt.*;
public class Table extends JApplet
{
	public void init()
	{
		String col[]={"Roll No.","Name","Location"};
		String data[][]={{"1","Tauseef","Mumbai Central"},
						{"2","ABC","ABCD"}};
		JTable table = new JTable(data,col);
		JScrollPane jsp = new JScrollPane(table,ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		getContentPane().add(jsp,BorderLayout.CENTER);
	}
}

//<applet code="Table.class" width="500" height="500"></applet>