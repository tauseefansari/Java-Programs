import javax.swing.*;
public class Prog24
{
	public static void main(String[] args) 
	{
		JFrame f = new JFrame("Login Form");
		JLabel heading = new JLabel("Login");
		JLabel uid = new JLabel("Username : ");
		JLabel pswd = new JLabel("Password : ");
		JTextField uin = new JTextField();
		JPasswordField pinp = new JPasswordField();
		JButton btn = new JButton("Submit");

		f.setVisible(true);
		f.setLayout(null);
		f.setSize(500,500);

		heading.setBounds(200,50,200,40);
		uid.setBounds(50,100,200,40);
		pswd.setBounds(50,150,200,30);
		uin.setBounds(200,100,200,30);
		pinp.setBounds(200,150,200,30);
		btn.setBounds(300,200,80,30);

		f.add(heading);
		f.add(uid);
		f.add(pswd);
		f.add(uin);
		f.add(pinp);
		f.add(btn);
	}
}