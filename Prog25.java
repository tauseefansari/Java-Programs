import java.applet.*;
import java.awt.event.*;
import java.awt.*;
class Prog25 extends Frame implements ActionListener
{
	Label heading = new Label("Calculator");
	Font f = new Font("Monotype Corsiva",Font.ITALIC,30);
	Label lno1 = new Label("Enter Number 1 : "); 
	Label lno2 = new Label("Enter Number 2 : ");
	Label lres = new Label("Result : ");
	TextField tn1 = new TextField();
	TextField tn2 = new TextField();
	TextField tres = new TextField();
	Button add = new Button("Addition");
	Button sub = new Button("Subtraction");
	Button div = new Button("Division");
	Button mul = new Button("Multiplication");
	Button exit = new Button("Exit");
	Prog25()
	{
		setTitle("Calculator");
		setBackground(Color.cyan);
		setVisible(true);
		setSize(400,400);
		setLayout(null);
		heading.setFont(f);
		heading.setForeground(Color.green);
		add(heading);
		add(lno1);
		add(lno2);
		add(lres);
		add(tn1);
		add(tn2);
		add(tres);
		add(add);
		add(sub);
		add(div);
		add(mul);
		add(exit);

		add.setForeground(Color.blue);
		sub.setForeground(Color.blue);
		mul.setForeground(Color.blue);
		div.setForeground(Color.blue);
		exit.setForeground(Color.red);

		heading.setBounds(120,40,200,50);
		lno1.setBounds(80,100,100,25);
		tn1.setBounds(200,100,100,25);
		lno2.setBounds(80,140,100,25);
		tn2.setBounds(200,140,100,25);
		lres.setBounds(80,180,100,25);
		tres.setBounds(200,180,100,25);
		add.setBounds(70,220,100,25);
		sub.setBounds(200,220,100,25);
		div.setBounds(70,260,100,25);
		mul.setBounds(200,260,100,25);
		exit.setBounds(140,300,100,25);
	
		add.addActionListener(this);
		sub.addActionListener(this);
		div.addActionListener(this);
		mul.addActionListener(this);
		exit.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) 
	{
		double num1=Integer.parseInt(tn1.getText());
		double num2=Integer.parseInt(tn2.getText());
		if(e.getSource()==add)
			tres.setText(Double.toString(num1+num2));
		if(e.getSource()==sub)
			tres.setText(Double.toString(num1-num2));
		if(e.getSource()==div)
			tres.setText(Double.toString(num1/num2));
		if(e.getSource()==mul)
			tres.setText(Double.toString(num1*num2));
		if(e.getSource()==exit)
			System.exit(0);
	}
	public static void main(String[] args) 
	{
		new Prog25();
	}
}