import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Information extends JFrame implements ActionListener
{
	//input labels and textfields
	JLabel input = new JLabel("Enter Details");
	JLabel output = new JLabel("Your Details");
	JLabel name = new JLabel("Name : ");
	JLabel street = new JLabel("Street : ");
	JLabel city = new JLabel("City : ");
	JLabel pincode = new JLabel("Pincode : ");
	JTextField tname = new JTextField();
	JTextField tstreet = new JTextField();
	JTextField tcity = new JTextField();
	JTextField tpincode = new JTextField();
	JButton myinfo = new JButton("My Info");

	//for output labels
	JLabel oname = new JLabel();
	JLabel ostreet = new JLabel();
	JLabel ocity = new JLabel();
	JLabel opincode = new JLabel();
	JLabel onam = new JLabel();
	JLabel ostree = new JLabel();
	JLabel ocit = new JLabel();
	JLabel opincod = new JLabel();
	
	Information() //constructor
	{
		Container c = this.getContentPane();
		c.setBackground(Color.cyan);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //for window closing
		setTitle("My Information");
		setVisible(true);
		setSize(900,350);
		setLayout(null);
		Font head = new Font("Monotype Courisva",Font.ITALIC,32); //font for heading
		Font fout = new Font("Arial",Font.ITALIC,32); //font for output

		//set font as mentioned in the statement for output
		add(input); 
		input.setFont(head); //heading font 
		input.setForeground(Color.red); //heading
		add(output); 
		output.setFont(head); //heading font
		output.setForeground(Color.red); //heading
		add(name); //add main label
		add(oname); //add output label
		add(onam); //label changed on button click
		oname.setFont(fout); 
		onam.setFont(fout);
		add(street); 
		add(ostreet); 
		add(ostree); 
		ostreet.setFont(fout); 
		ostree.setFont(fout);
		add(city); 
		add(ocity); 
		add(ocit); 
		ocity.setFont(fout); 
		ocit.setFont(fout);
		add(pincode); 
		add(opincode); 
		add(opincod); 
		opincode.setFont(fout); 
		opincod.setFont(fout);
		
		add(tname);
		add(tstreet);
		add(tcity);
		add(tpincode);
		add(myinfo);

		//set bounds for outputs
		input.setBounds(100,20,200,40); 
		output.setBounds(580,20,200,40);
		name.setBounds(60,80,100,30); 
		tname.setBounds(150,80,200,30); 
		oname.setBounds(460,80,200,40); 
		onam.setBounds(620,80,300,40);
		street.setBounds(60,120,100,30); 
		tstreet.setBounds(150,120,200,30); 
		ostreet.setBounds(460,120,200,40); 
		ostree.setBounds(620,120,200,40);
		city.setBounds(60,160,100,30); 
		tcity.setBounds(150,160,200,30); 
		ocity.setBounds(460,160,200,40); 
		ocit.setBounds(620,160,200,40);
		pincode.setBounds(60,200,100,30); 
		tpincode.setBounds(150,200,200,30); 
		opincode.setBounds(460,200,200,40); 
		opincod.setBounds(620,200,200,40);
		myinfo.setBounds(200,250,100,40);

		myinfo.addActionListener(this); //registering for action
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==myinfo)
		{
			oname.setText("Name : ");
			onam.setText(tname.getText());
			ostreet.setText("Street : ");
			ostree.setText(tstreet.getText());
			ocity.setText("City : ");
			ocit.setText(tcity.getText());
			opincode.setText("Pincode : ");
			opincod.setText(tpincode.getText());
		}
	}
	public static void main(String[] args) 
	{
		new Information();
	}
}