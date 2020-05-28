import java.awt.FlowLayout;  
import javax.swing.JFrame;  
import javax.swing.JScrollPane;  
import javax.swing.JTextArea;  
  
public class Scroll
{    
    public static void main(String[] args) 
	{
        final JFrame frame = new JFrame("Scroll Pane");   
        frame.setSize(300, 400);  
        frame.setVisible(true);  
        frame.getContentPane().setLayout(new FlowLayout());  
        JTextArea textArea = new JTextArea(20, 20);  
        JScrollPane scrollableTextArea = new JScrollPane(textArea);  
        scrollableTextArea.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);  
        scrollableTextArea.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);  
        frame.getContentPane().add(scrollableTextArea);  
    	}  
}