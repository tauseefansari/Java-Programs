import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class Login extends JFrame implements ActionListener //extending Jframe and implementing ActionListener
{
	JLabel heading = new JLabel("Login"); //creating label
	JLabel lname = new JLabel("Username : "); //creating textField
	JLabel lpass = new JLabel("Password : "); 
	JLabel msg = new JLabel();
	JTextField uin = new JTextField(); 
	JPasswordField pin = new JPasswordField(); //creating password field
	JButton sub = new JButton("Login"); //creating submit button
	Font f = new Font("Arial",Font.ITALIC,20); //creating font
	Login()
	{
		setTitle("Login Form"); //title
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //default close operation
		Font fhead = new Font("Monotype Courisva",Font.BOLD,28); //font for heding
		Container c = this.getContentPane(); //container
		setLayout(null); //set layout
		setSize(400,400); //set size of window
		setVisible(true); //set visibility
		c.setBackground(Color.cyan); //background color
		heading.setFont(fhead); //seeting font
		lname.setFont(f);
		lpass.setFont(f);
		uin.setFont(f);
		sub.setFont(f);

		c.add(heading); //adding in container
		c.add(lname);
		c.add(lpass);
		c.add(uin);
		c.add(pin);
		c.add(sub);
		c.add(msg);

		msg.setFont(f);
		msg.setForeground(Color.red); //setting foreground color of msg label
		msg.setBounds(70,300,300,30);

		heading.setBounds(150,40,100,40);

		lname.setBounds(40,130,150,30);
		lpass.setBounds(40,180,150,30);
		uin.setBounds(160,130,150,30);
		pin.setBounds(160,180,150,30);
		sub.setBounds(160,230,150,30);

		sub.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==sub) //action when button click
		{
			if(uin.getText().equals("Tauseef") && pin.getText().equals("12345"))
			{
				msg.setText("Welcome "+uin.getText());
			}
			else //if invalid user
			{
				msg.setText("Inavlid Username or Password");
			}
		}
	}
	public static void main(String[] args) 
	{
		new Login(); //invokes constructor
	}
}