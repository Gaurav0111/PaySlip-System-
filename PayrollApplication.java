import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;
// import NumerictoWord;

public class PayrollApplication extends JFrame {
    private JLabel idLabel, nameLabel, salaryLabel, companyNameLabel, companyAddresslabel,dateLabel ;
    private JTextField idField, nameField, salaryField;
    private JButton calculateButton;//, printSlipButton;
    private JTextArea resultArea;
    private Locale locale;

    public PayrollApplication() {
        setTitle("Payroll Application");
        setSize(400, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // Initialize locale
        locale = Locale.getDefault();

        idLabel = new JLabel("Employee ID:");
        nameLabel = new JLabel("Name:");
        salaryLabel = new JLabel("Basic Salary:");
        companyNameLabel = new JLabel("Company Name: DIT University");
        companyAddresslabel = new JLabel("Address: Mussorie, Diversion Road, Uttarakhand(248009)");
        dateLabel = new JLabel("Date: "+dateFormat());

        idField = new JTextField();
        nameField = new JTextField();
        salaryField = new JTextField();

        calculateButton = new JButton("Calculate");

        resultArea = new JTextArea();
        resultArea.setEditable(false);

        idLabel.setBounds(20, 20, 100, 20);
        idField.setBounds(130, 20, 200, 20);
        nameLabel.setBounds(20, 50, 100, 20);
        nameField.setBounds(130, 50, 200, 20);
        salaryLabel.setBounds(20, 80, 100, 20);
        salaryField.setBounds(130, 80, 200, 20);
        companyNameLabel.setBounds(30,110,200,20);
        dateLabel.setBounds(280,110,100,20);
        companyAddresslabel.setBounds(30,150,300,20);
        calculateButton.setBounds(150, 190, 100, 30);
        resultArea.setBounds(20, 230, 360, 200);
        
        add(idLabel);
        add(idField);
        add(nameLabel);
        add(nameField);
        add(salaryLabel);
        add(salaryField);
        add(calculateButton);
        add(resultArea);
        add(companyNameLabel);
        add(companyAddresslabel);
        
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                computeSalary();
            }
        });
        
        setVisible(true);
    }
    
    private void computeSalary() {
        try {
            int id = Integer.parseInt(idField.getText());
            String name = nameField.getText();
            double basicSalary = Double.parseDouble(salaryField.getText());
            
            double hra = basicSalary * 0.50;
            double ta = basicSalary * 0.40;
            double ma = basicSalary * 0.25;
            double da = basicSalary * 0.20;
            double pf = basicSalary * 0.05;
            double gs = basicSalary + hra + da + ta + ma;
            double tax = computeTax(gs);
            double ns = gs - pf - tax;
            
            resultArea.setText("");
            resultArea.append("Employee ID: " + id + "\n");
            resultArea.append("Employee Name: " + properCase(name) + "\n");
            resultArea.append("Allowances:\t\t\t Deductions:\n");
            resultArea.append(" HRA: " + currencyFormat(hra) +"\t\t\t  PF: " + currencyFormat(pf) + "\n");
            resultArea.append(" DA: " + currencyFormat(da) +"\t\t\t  Tax: " + currencyFormat(tax) + "\n");
            resultArea.append(" MA: " + currencyFormat(ma) + "\n");
            resultArea.append(" TA: " + currencyFormat(ta) + "\n");
            resultArea.append(" Gross Salary: " + currencyFormat(gs) + "\n");
            resultArea.append("Net Salary: " + currencyFormat(ns) + "\n");
            resultArea.append("In Words: " + NumerictoWord.convert((int)ns, "", 0, (int)ns)+ "\n");
            resultArea.setBounds(20, 230, 500, 300);
            companyAddresslabel.setBounds(30,150,600,20);
            setSize(600, 500);
            add(dateLabel);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter valid numeric values for ID and Salary.",
                    "Input Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private String properCase(String name) {
        String fullName = "";
        String names[] = name.split(" ");
        for (int i = 0; i < names.length; i++) {
            String n = String.valueOf(names[i].charAt(0)).toUpperCase() + names[i].substring(1).toLowerCase();
            fullName = fullName + n + " ";
        }
        return fullName.trim();
    }

    private String currencyFormat(double val) {
        NumberFormat obj = NumberFormat.getCurrencyInstance(locale);
        return obj.format(val);
    }

    private String dateFormat() {
        Date date = new Date();
        DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT, locale);
        return df.format(date);
    }

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

    public static void main(String[] args) {
        new PayrollApplication();
    }
}