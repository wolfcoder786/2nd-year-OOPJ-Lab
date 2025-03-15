import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MyForm {
    JFrame f1;
    JButton b1;
    JPanel p1;
    JLabel l1, l2;
    JTextField t1;
    JTextArea jta1;
    JComboBox<String> jcb1;

    public MyForm() { // Constructor
        f1 = new JFrame("My First Form");
        f1.setSize(400, 400);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Creating components
        p1 = new JPanel();
        p1.setBackground(Color.cyan);
        p1.setLayout(new GridLayout(4, 2, 10, 10)); // Proper layout for better alignment

        l1 = new JLabel("First Name:");
        t1 = new JTextField(15);
        t1.setBackground(Color.pink);
        t1.setForeground(Color.blue);

        l2 = new JLabel("Address:");
        jta1 = new JTextArea(1, 20);

        String options[] = { "Matriculate", "+2", "B.Tech", "M.Tech", "Ph.D", "Matric Fail", "NFTE" };
        jcb1 = new JComboBox<>(options);

        b1 = new JButton("Click Me");
        b1.setBackground(Color.yellow);
        b1.setForeground(Color.red);

        // Add Action Listener
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = t1.getText();
                String address = jta1.getText();
                String qualification = (String) jcb1.getSelectedItem();

                JOptionPane.showMessageDialog(f1, "Name: " + name + "\nAddress: " + address + "\nQualification: " + qualification, 
                    "User Details", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        // Adding components to panel
        p1.add(l1);
        p1.add(t1);
        p1.add(l2);
        p1.add(new JScrollPane(jta1)); // Using JScrollPane for text area
        p1.add(new JLabel("Qualification:"));
        p1.add(jcb1);
        p1.add(b1);

        f1.add(p1);
        f1.setVisible(true); // Set visibility after adding components
    }

    public static void main(String[] args) {
        new MyForm();
    }
}
