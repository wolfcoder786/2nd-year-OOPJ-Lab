import java.awt.*;
import javax.swing.*;
class myform
{
	JFrame f1;
	JButton b1;
	JPanel p1;
	JLabel l1;
	JTextField t1;
	JTextArea jta1;
	JComboBox jcb1;
	public myform()//constructor
	{
		f1=new JFrame("My First Frame");
		f1.setVisible(true);
		f1.setSize(400,400);

		b1=new JButton("Click Me");
		p1=new JPanel();
		p1.setBackground(Color.cyan);
		f1.getContentPane().add(p1);


		b1.setBackground(Color.yellow);
		b1.setForeground(Color.red);
		//for adding button with frame

		l1=new JLabel("First Name");
		//l1.setBounds(100,100,120,30);
		t1=new JTextField(15);
		t1.setBackground(Color.pink);
		t1.setForeground(Color.blue);
		//t1.setBounds(200,100,120,30);
		jta1=new JTextArea(5,20);
		//p1.setLayout(null);
		//b1.setBounds(100,200,150,30);

		String x[]={"Matriculate","+2","B.Tech","M.Tech","Ph.D","Matric Fail","NFTE"};
		jcb1=new JComboBox(x);

		p1.add(l1);
		p1.add(t1);
		p1.add(jta1);
		p1.add(jcb1);
		p1.add(b1);
	}
	public static void main(String args[])
	{
		myform obj=new myform();
	}
}