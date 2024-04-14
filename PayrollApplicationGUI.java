import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

public class PayrollApplicationGUI extends JFrame {
<<<<<<< HEAD
    private JLabel idLabel, nameLabel, salaryLabel, companyInfoLabelName, companyInfoLabelAddress, companyInfoLabelEmail, dateLabel, empname, empid ;
    
    private JTextField idField, nameField, salaryField;
    private JButton calculateButton;
    private JLabel grossSalaryLabel, hraLabel, taLabel, maLabel, daLabel, pfLabel, taxLabel, netSalaryLabel, netSalaryWordsLabel,earnings,deduction;
    private JLabel imageLabel;
    JLabel headingLabel = new JLabel("Payroll Application");
    JSeparator separator1 = new JSeparator(SwingConstants.HORIZONTAL);
    JSeparator separator3 = new JSeparator(SwingConstants.HORIZONTAL);
    JSeparator separator2 = new JSeparator(SwingConstants.VERTICAL);

    private JButton calculateButton;
    private JLabel grossSalaryLabel, hraLabel, taLabel, maLabel, daLabel, pfLabel, taxLabel, netSalaryLabel;

    public PayrollApplicationGUI() {
        setTitle("Payroll Application");
        setSize(1080, 900);
        setSize(800, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); 
        setResizable(false);
        initComponents();
        initLayout();
        addActionListeners();
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
        ImageIcon imageIcon = new ImageIcon("logo.png");
        imageLabel = new JLabel(imageIcon);
        setLocationRelativeTo(null); 
        setResizable(false);

        initComponents();
        initLayout();
        addActionListeners();

        setVisible(true);
    }

    private void initComponents() {
        idLabel = new JLabel("Employee ID:");
        nameLabel = new JLabel("Name:");
        salaryLabel = new JLabel("Basic Salary:");
        idField = new JTextField();
        nameField = new JTextField();
        salaryField = new JTextField();
        calculateButton = new JButton("Calculate");

        empname = new JLabel("Employee Name: ");
        empid = new JLabel("Employee ID: ");
        earnings = new JLabel("Earnings");
        deduction = new JLabel("Deduction");
=======
    private JLabel idLabel, nameLabel, salaryLabel, companyInfoLabelName,companyInfoLabelAddress,companyInfoLabelEmail ,dateLabel;
    private JTextField idField, nameField, salaryField;
    private JButton calculateButton;
    private JLabel grossSalaryLabel, hraLabel, taLabel, maLabel, daLabel, pfLabel, taxLabel, netSalaryLabel;

    public PayrollApplicationGUI() {
        setTitle("Payroll Application");
        setSize(800, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); 
        setResizable(false);

        initComponents();
        initLayout();
        addActionListeners();

        setVisible(true);
    }

    private void initComponents() {
        idLabel = new JLabel("Employee ID:");
        nameLabel = new JLabel("Name:");
        salaryLabel = new JLabel("Basic Salary:");
        idField = new JTextField(10);
        nameField = new JTextField(20);
        salaryField = new JTextField(10);
        calculateButton = new JButton("Calculate");

>>>>>>> e32c906e67125298d53056f652de67415b3b3904
        grossSalaryLabel = new JLabel("Gross Salary:");
        hraLabel = new JLabel("HRA:");
        taLabel = new JLabel("TA:");
        maLabel = new JLabel("MA:");
        daLabel = new JLabel("DA:");
        pfLabel = new JLabel("PF:");
        taxLabel = new JLabel("Tax:");
        netSalaryLabel = new JLabel("Net Salary:");
<<<<<<< HEAD
        netSalaryWordsLabel = new JLabel("Net Salary in Words:");
=======
>>>>>>> e32c906e67125298d53056f652de67415b3b3904

        // Pre-filled company information
        companyInfoLabelName = new JLabel("Company Name: DIT University");
        companyInfoLabelEmail = new JLabel("Company: acad9@dituniversity.edu.in ");
        companyInfoLabelAddress = new JLabel("Address: Mussoorie, Diversion Road, Uttarakhand 248009");
        dateLabel = new JLabel("Date: " + getCurrentDate());
    }

    private void initLayout() {
<<<<<<< HEAD
        getContentPane().setLayout(null);
        imageLabel.setBounds(780, 0, 300, 50);

        headingLabel.setBounds(300, 10, 300, 30);
        headingLabel.setFont(new Font("Arial", Font.BOLD, 24));
        idLabel.setBounds(20, 60, 100, 30);
        idField.setBounds(130, 60, 150, 30);
        idField.setBackground(Color.darkGray);
        nameLabel.setBounds(20, 100, 100, 30);
        nameField.setBounds(130, 100, 150, 30);
        nameField.setBackground(Color.darkGray);
        salaryLabel.setBounds(20, 140, 100, 30);
        salaryField.setBounds(130, 140, 150, 30);
        salaryField.setBackground(Color.darkGray);
        calculateButton.setBounds(130, 180, 150, 30);
        calculateButton.setBackground(Color.darkGray);
        separator1.setBounds(15,225,1000,1);
        empname.setBounds(20, 250, 200, 30);
        empid.setBounds(20, 290, 200, 30);
        earnings.setBounds(20, 330, 200, 30);
        earnings.setFont(new Font("Arial", Font.BOLD, 16));
        hraLabel.setBounds(20, 370, 200, 30);
        taLabel.setBounds(20, 410, 200, 30);
        maLabel.setBounds(20, 450, 200, 30);
        daLabel.setBounds(20, 490, 200, 30);
        grossSalaryLabel.setBounds(20, 530, 200, 30);
        separator3.setBounds(15,585,1000,1);
        netSalaryLabel.setFont(new Font("Arial", Font.BOLD, 14));
        netSalaryLabel.setBounds(20, 600, 200, 30);
        netSalaryWordsLabel.setBounds(20, 640, 800, 60);
        netSalaryWordsLabel.setFont(new Font("Arial", Font.BOLD, 14));
        separator2.setBounds(250, 380, 1, 150);
        deduction.setBounds(400, 330, 200, 30);
        deduction.setFont(new Font("Arial", Font.BOLD, 16));
        pfLabel.setBounds(400, 370, 200, 30);
        taxLabel.setBounds(400, 410, 200, 30);
        companyInfoLabelName.setBounds(400, 55, 300, 30);
        companyInfoLabelEmail.setBounds(400, 95, 300, 30);
        companyInfoLabelAddress.setBounds(400, 135, 400, 30);
        dateLabel.setBounds(400, 175, 200, 30);
        

        getContentPane().add(imageLabel);
        getContentPane().add(headingLabel);        
        getContentPane().add(separator1);        
        getContentPane().add(separator2);        
        getContentPane().add(separator3);        
        getContentPane().add(earnings);
        getContentPane().add(deduction);
        getContentPane().add(idLabel);
        getContentPane().add(idField);
        getContentPane().add(nameLabel);
        getContentPane().add(nameField);
        getContentPane().add(salaryLabel);
        getContentPane().add(salaryField);
        getContentPane().add(calculateButton);

        getContentPane().add(empname);
        getContentPane().add(empid);
        getContentPane().add(grossSalaryLabel);
        getContentPane().add(hraLabel);
        getContentPane().add(taLabel);
        getContentPane().add(maLabel);
        getContentPane().add(daLabel);
        getContentPane().add(pfLabel);
        getContentPane().add(taxLabel);
        getContentPane().add(netSalaryLabel);
        getContentPane().add(netSalaryWordsLabel);

        getContentPane().add(companyInfoLabelName);
        getContentPane().add(companyInfoLabelEmail);
        getContentPane().add(companyInfoLabelAddress);
        getContentPane().add(dateLabel);
    }

=======
        JPanel inputPanel = new JPanel(new GridLayout(3, 2, 5, 5));
        inputPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        inputPanel.add(idLabel);
        inputPanel.add(idField);
        inputPanel.add(nameLabel);
        inputPanel.add(nameField);
        inputPanel.add(salaryLabel);
        inputPanel.add(salaryField);
        
        JPanel calculatePanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        calculatePanel.add(calculateButton);
        
        JPanel outputPanel = new JPanel(new GridLayout(12, 2, 5, 5)); // Increased rows to accommodate all payroll elements
        outputPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        outputPanel.add(grossSalaryLabel);
        outputPanel.add(new JLabel()); 
        outputPanel.add(hraLabel);
        outputPanel.add(new JLabel()); 
        outputPanel.add(taLabel);
        outputPanel.add(new JLabel()); 
        outputPanel.add(maLabel);
        outputPanel.add(new JLabel()); 
        outputPanel.add(daLabel);
        outputPanel.add(new JLabel()); 
        outputPanel.add(pfLabel);
        outputPanel.add(new JLabel()); 
        outputPanel.add(taxLabel);
        outputPanel.add(new JLabel()); 
        outputPanel.add(netSalaryLabel);
        outputPanel.add(new JLabel()); 
        
        JPanel infoPanel = new JPanel(new GridLayout(4, 1));
        infoPanel.setBorder(BorderFactory.createEmptyBorder(20, 10, 10, 10)); 
        infoPanel.add(companyInfoLabelName);
        infoPanel.add(companyInfoLabelEmail);
        infoPanel.add(companyInfoLabelAddress);
        infoPanel.add(dateLabel);
        JSeparator separator1 = new JSeparator(SwingConstants.HORIZONTAL);
        separator1.setPreferredSize(new Dimension(400, 1));
        JSeparator separator2 = new JSeparator(SwingConstants.HORIZONTAL);
        separator2.setPreferredSize(new Dimension(400, 1));
        
        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.add(inputPanel, BorderLayout.NORTH);
        mainPanel.add(separator1, BorderLayout.CENTER);
        mainPanel.add(calculatePanel, BorderLayout.CENTER);
        mainPanel.add(outputPanel, BorderLayout.AFTER_LAST_LINE);
        mainPanel.add(separator2, BorderLayout.SOUTH);
        mainPanel.add(infoPanel, BorderLayout.WEST); 
        
        JPanel containerPanel = new JPanel(new BorderLayout());
        containerPanel.add(mainPanel, BorderLayout.NORTH);
    
        setSize(800, 700);
        
        add(containerPanel);
    }
    
    

>>>>>>> e32c906e67125298d53056f652de67415b3b3904
    private void addActionListeners() {
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                computeSalary();
            }
        });
    }

    private void computeSalary() {
        try {
            String idText = idField.getText();
            String name = properCase(nameField.getText());
            String salaryText = salaryField.getText();

            if (idText.isEmpty() || name.isEmpty() || salaryText.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please fill in all the fields.", "Input Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            int id = Integer.parseInt(idText);
            double basicSalary = Double.parseDouble(salaryText);

            if (basicSalary < 0) {
                JOptionPane.showMessageDialog(this, "Basic salary cannot be negative.", "Input Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            double hra = basicSalary * 0.50;
            double ta = basicSalary * 0.40;
            double ma = basicSalary * 0.25;
            double da = basicSalary * 0.20;
            double pf = basicSalary * 0.05;
            double gs = basicSalary + hra + da + ta + ma;
            double tax = computeTax(gs);
            double ns = gs - pf - tax;

            setLabelText(grossSalaryLabel, currencyFormat(gs));
            setLabelText(hraLabel, currencyFormat(hra));
            setLabelText(taLabel, currencyFormat(ta));
            setLabelText(maLabel, currencyFormat(ma));
            setLabelText(daLabel, currencyFormat(da));
            setLabelText(pfLabel, currencyFormat(pf));
            setLabelText(taxLabel, currencyFormat(tax));
            setLabelText(netSalaryLabel, currencyFormat(ns));
<<<<<<< HEAD
            setLabelText(empname, name);
            setLabelText(empid, Integer.toString(id));
            setLabelText(netSalaryWordsLabel, NumerictoWord.convert((int)ns,"",0,(int)ns)+"rupees only");
=======
>>>>>>> e32c906e67125298d53056f652de67415b3b3904
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter valid numeric values for ID and Salary.",
                    "Input Error", JOptionPane.ERROR_MESSAGE);
        }
    }

<<<<<<< HEAD
    static String properCase(String name) {
        String fullName = "";
        String names[] = name.split(" ");
        for (int i = 0; i < names.length; i++) {
            String n = String.valueOf(names[i].charAt(0)).toUpperCase() + names[i].substring(1).toLowerCase();
            fullName = fullName + n + " ";
        }
        return fullName;
    }

=======
>>>>>>> e32c906e67125298d53056f652de67415b3b3904
    private double computeTax(double gs) {
        double annual = gs * 12;
        if (annual > 500000 && annual < 700000) {
            return (annual * 0.10) / 12;
        } else if (annual > 700000 && annual < 900000) {
            return (annual * 0.20) / 12;
        } else if (annual > 900000) {
            return (annual * 0.30) / 12;
        }
        return 0.0;
    }

    private void setLabelText(JLabel label, String text) {
        label.setText(label.getText() + " " + text);
<<<<<<< HEAD
    }

    private String currencyFormat(double val) {
        Locale indiaLocale = new Locale("en", "IN");
        NumberFormat obj = NumberFormat.getCurrencyInstance(indiaLocale);
        return obj.format(val);
    }

    private String getCurrentDate() {
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.SHORT, new Locale("en", "IN"));
        return dateFormat.format(new Date());
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PayrollApplicationGUI();
            }
        });
=======
>>>>>>> e32c906e67125298d53056f652de67415b3b3904
    }

    private String currencyFormat(double val) {
        NumberFormat obj = NumberFormat.getCurrencyInstance(Locale.US);
        return obj.format(val);
    }

    private String getCurrentDate() {
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.SHORT, Locale.US);
        return dateFormat.format(new Date());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PayrollApplicationGUI();
            }
        });
    }
}
