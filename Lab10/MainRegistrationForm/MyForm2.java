import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class MyForm2 {
    JFrame frame;
    JButton submitButton;
    JPanel mainPanel, formPanel, buttonPanel;
    JLabel nameLabel, addressLabel, qualificationLabel, titleLabel;
    JTextField nameField;
    JTextArea addressArea;
    JComboBox<String> qualificationBox;

    public MyForm2() {
        // Frame settings
        frame = new JFrame("Modern Form");
        frame.setSize(450, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); // Center on screen
        frame.setLayout(new BorderLayout(10, 10));

        // Title Label
        titleLabel = new JLabel("User Registration Form", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
        titleLabel.setForeground(new Color(50, 50, 150));
        frame.add(titleLabel, BorderLayout.NORTH);

        // Main Panel
        mainPanel = new JPanel();
        mainPanel.setBackground(Color.WHITE);
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBorder(new EmptyBorder(20, 20, 20, 20));

        // Form Panel (Grid Layout inside BoxLayout)
        formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(4, 2, 10, 10));
        formPanel.setBackground(Color.WHITE);

        // Name Input
        nameLabel = new JLabel("First Name:");
        nameLabel.setFont(new Font("Arial", Font.BOLD, 14));
        // nameLabel.setForeground(Color.white);
        nameField = new JTextField();
        nameField.setFont(new Font("Arial", Font.PLAIN, 14));
        nameField.setBorder(BorderFactory.createLineBorder(Color.GRAY));

        // Address Input
        addressLabel = new JLabel("Address:");
        addressLabel.setFont(new Font("Arial", Font.BOLD, 14));
        addressArea = new JTextArea(3, 20);
        addressArea.setFont(new Font("Arial", Font.PLAIN, 14));
        addressArea.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        JScrollPane addressScroll = new JScrollPane(addressArea);

        // Qualification Dropdown
        qualificationLabel = new JLabel("Qualification:");
        qualificationLabel.setFont(new Font("Arial", Font.BOLD, 14));
        String[] options = { "Matriculate", "+2", "B.Tech", "M.Tech", "Ph.D", "Matric Fail", "NFTE" };
        qualificationBox = new JComboBox<>(options);
        qualificationBox.setFont(new Font("Arial", Font.PLAIN, 14));

        // Submit Button with Rounded Edges
        submitButton = new JButton("Submit");
        submitButton.setFont(new Font("Arial", Font.BOLD, 14));
        submitButton.setForeground(Color.WHITE);
        submitButton.setBackground(new Color(50, 150, 250));
        submitButton.setFocusPainted(false);
        submitButton.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        submitButton.setOpaque(true);

        // Button Panel
        buttonPanel = new JPanel();
        buttonPanel.setBackground(Color.WHITE);
        buttonPanel.add(submitButton);

        // Add components to Form Panel
        formPanel.add(nameLabel);
        formPanel.add(nameField);
        formPanel.add(addressLabel);
        formPanel.add(addressScroll);
        formPanel.add(qualificationLabel);
        formPanel.add(qualificationBox);

        // Add everything to Main Panel
        mainPanel.add(formPanel, BorderLayout.CENTER);
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);

        // Add Main Panel to Frame
        frame.add(mainPanel);
        frame.setVisible(true);

        // Button Click Event
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String address = addressArea.getText();
                String qualification = (String) qualificationBox.getSelectedItem();

                JOptionPane.showMessageDialog(frame, 
                    "Name: " + name + "\nAddress: " + address + "\nQualification: " + qualification, 
                    "User Details", JOptionPane.INFORMATION_MESSAGE);
            }
        });
    }

    public static void main(String[] args) {
        new MyForm2();
    }
}
