import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Calculator {
    JLabel l1, l2, l3;
    JButton a, s, m, r;
    JTextField t1, t2, t3;
    JPanel p1;
    JFrame f1;

    public Calculator() {
        f1 = new JFrame("Calculator");
        f1.setVisible(true);
        f1.setSize(450, 300);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        p1 = new JPanel();
        p1.setLayout(null);
        f1.getContentPane().add(p1);

        l1 = new JLabel("Enter the first number:");
        l2 = new JLabel("Enter the second number:");
        l3 = new JLabel("Result:");

        a = new JButton("Add");
        s = new JButton("Sub");
        m = new JButton("Mul");
        r = new JButton("Reset");

        t1 = new JTextField(20);
        t2 = new JTextField(20);
        t3 = new JTextField(20);

        // Proper Alignment
        l1.setBounds(50, 30, 200, 20);
        p1.add(l1);
        t1.setBounds(250, 30, 100, 20);
        p1.add(t1);

        l2.setBounds(50, 60, 200, 20);
        p1.add(l2);
        t2.setBounds(250, 60, 100, 20);
        p1.add(t2);

        l3.setBounds(50, 90, 200, 20);
        p1.add(l3);
        t3.setBounds(250, 90, 100, 20);
        p1.add(t3);

        a.setBounds(50, 130, 80, 30);
        s.setBounds(140, 130, 80, 30);
        m.setBounds(230, 130, 80, 30);
        r.setBounds(320, 130, 80, 30);

        p1.add(a);
        p1.add(s);
        p1.add(m);
        p1.add(r);

        inner obj = new inner();
        a.addActionListener(obj);
        s.addActionListener(obj);
        m.addActionListener(obj);
        r.addActionListener(obj);
    }

    class inner implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String n1;
            Object obj = e.getSource();

            try {
                int num1 = Integer.parseInt(t1.getText());
                int num2 = Integer.parseInt(t2.getText());

                if (obj == a) {
                    n1 = String.valueOf(num1 + num2);
                    t3.setText(n1);
                }
                if (obj == s) {
                    n1 = String.valueOf(num1 - num2);
                    t3.setText(n1);
                }
                if (obj == m) {
                    n1 = String.valueOf(num1 * num2);
                    t3.setText(n1);
                }
                if (obj == r) {
                    t1.setText("");
                    t2.setText("");
                    t3.setText("");
                }
            } catch (NumberFormatException ex) {
                t3.setText("Invalid input");
            }
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
