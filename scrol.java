import javax.swing.*;
import java.awt.*;
class scrol
{
	public static void main(String[] args) {
		JFrame f = new JFrame("Scoll Pane");
		f.setSize(500,500);
		f.setVisible(true);
		f.setLayout(new FlowLayout());
		JTextArea area = new JTextArea(20,20);
		JScrollPane jsp = new JScrollPane(area,ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
			ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		f.getContentPane().add(jsp,BorderLayout.CENTER);
	}
}