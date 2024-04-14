import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginRegisterPage extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JButton registerButton;
    private JLabel imageLabel;
    private String hardcodedUsername = "admin";
    private String hardcodedPassword = "admin@123";
    

    public LoginRegisterPage() {
        setTitle("Login/Register Page");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the window
        setResizable(false);
        setLayout(null); // Enable absolute positioning

        initComponents();
        setVisible(true);
        getContentPane().setBackground(Color.BLACK); 
        setForegroundForAllComponents(this.getContentPane(), Color.WHITE); 
    }
    private void setForegroundForAllComponents(Container container, Color color) {
        Component[] components = container.getComponents();
        for (Component component : components) {
            if (component instanceof JLabel || component instanceof JTextField || component instanceof JButton) {
                component.setForeground(color);
            }
            if (component instanceof Container) {
                setForegroundForAllComponents((Container) component, color);
            }
        }
    }


    private void initComponents() {
        JLabel usernameLabel = new JLabel("Username:");
        JLabel passwordLabel = new JLabel("Password:");
        ImageIcon imageIcon = new ImageIcon("logo.png");
        imageLabel = new JLabel(imageIcon);
        usernameField = new JTextField();
        passwordField = new JPasswordField();

        loginButton = new JButton("Login");
        registerButton = new JButton("Register");

        // Set bounds for each component
        imageLabel.setBounds(110, 30, 300, 50);
        usernameField.setBackground(Color.darkGray);
        passwordField.setBackground(Color.darkGray);
        usernameLabel.setBounds(130, 120, 80, 25);
        usernameField.setBounds(210, 120, 160, 25);
        passwordLabel.setBounds(130, 150, 80, 25);
        passwordField.setBounds(210, 150, 160, 25);
        loginButton.setBounds(140, 190, 100, 25);
        loginButton.setBackground(Color.darkGray);
        registerButton.setBackground(Color.darkGray);
        registerButton.setBounds(260, 190, 100, 25);

        // Add components to the frame
        add(imageLabel);
        add(usernameLabel);
        add(usernameField);
        add(passwordLabel);
        add(passwordField);
        add(loginButton);
        add(registerButton);

        // Action listeners
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());

                if (username.equals(hardcodedUsername) && password.equals(hardcodedPassword)) {
                    JOptionPane.showMessageDialog(LoginRegisterPage.this, "Login successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
                    openMainPage();
                } else {
                    JOptionPane.showMessageDialog(LoginRegisterPage.this, "Invalid username or password!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Add register logic here
                JOptionPane.showMessageDialog(LoginRegisterPage.this, "Register feature not implemented yet.", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        });
    }

    private void openMainPage() {
        // Open the Payroll Application GUI after successful login
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PayrollApplicationGUI();
            }
        });

        // Dispose login/register page
        dispose();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LoginRegisterPage();
            }
        });
    }
}