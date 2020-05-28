import java.awt.*;
import java.awt.event.*;
class Prog48 extends Frame implements ActionListener
{
	Label head = new Label("Registration Form");
	Label msg = new Label();
	Label name = new Label("Name : ");
	Label add = new Label("Address : ");
	Label gender = new Label("Gender : ");
	Label email = new Label("E-Mail : ");
	Label phone = new Label("Phone : ");
	Label games = new Label("Games : ");
	TextField tname = new TextField();
	TextField tadd = new TextField();
	TextField temail = new TextField();
	TextField tphone = new TextField();
	Checkbox cube = new Checkbox("Cube");
	Checkbox carrom = new Checkbox("Carrom");
	Checkbox cricket = new Checkbox("Cricket");
	Checkbox football = new Checkbox("FootBall");
	Choice mf = new Choice();
	Button sub = new Button("Submit");
	Button cancel = new Button("Cancel");
	Prog48()
	{
		setTitle("Registration Form");
		Font f = new Font("Monotype Courisva",Font.ITALIC,34);
		Font f1 = new Font("Monotype Courisva",Font.ITALIC,20);
		head.setFont(f);
		head.setForeground(Color.red);
		setBackground(Color.cyan); 
		setVisible(true);
		setSize(500,600);
		setLayout(null);

		add(head); 
		add(name); name.setFont(f1);
		add(add); add.setFont(f1);
		add(gender); gender.setFont(f1);
		add(email); email.setFont(f1);
		add(phone); phone.setFont(f1);
		add(games); games.setFont(f1);
		add(msg); msg.setFont(f1); msg.setForeground(Color.blue); 
		add(tname); tname.setFont(f1);
		add(tadd); tadd.setFont(f1);
		add(temail); temail.setFont(f1);
		add(tphone); tphone.setFont(f1);
		add(cube); cube.setFont(f1);
		add(carrom); carrom.setFont(f1);
		add(cricket); cricket.setFont(f1);
		add(football); football.setFont(f1);
		add(mf); mf.setFont(f1);
		mf.add("Select Gender ...");
		mf.add("Male");
		mf.add("Female");
		add(sub); sub.setFont(f1);
		add(cancel); cancel.setFont(f1);

		head.setBounds(100,70,300,40);
		name.setBounds(80,150,100,40);
		tname.setBounds(200,150,200,40);
		add.setBounds(80,200,100,40);
		tadd.setBounds(200,200,200,80);
		gender.setBounds(80,300,100,40);
		mf.setBounds(200,310,200,40);
		phone.setBounds(80,350,100,40);
		tphone.setBounds(200,350,200,40);
		games.setBounds(80,400,100,40);
		cube.setBounds(200,400,90,40);
		carrom.setBounds(300,400,90,40);
		cricket.setBounds(200,450,90,40);
		football.setBounds(300,450,90,40);
		sub.setBounds(150,500,100,40);
		cancel.setBounds(300,500,100,40);
		msg.setBounds(80,540,400,40);

		sub.addActionListener(this);
		cancel.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==sub)
		{
			msg.setText("Hi "+tname.getText()+"! Registration Successful");
		}
		if(e.getSource()==cancel)
		{
			System.exit(0);
		}
	}
	public static void main(String[] args) 
	{
		new Prog48();	
	}
}