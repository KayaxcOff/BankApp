import javax.swing.*;

public class MainApp {
    public static void mainApplication() {
        JFrame appFrame = new JFrame("Kaya Bank - Main Page");

        // Create JTabbedPane
        JTabbedPane tabbedPane = new JTabbedPane();

        JPanel balancePanel = new JPanel();
        balancePanel.setLayout(null);

        JLabel balanceLabel = new JLabel("Current Balance:");
        balanceLabel.setBounds(50, 50, 120, 30);
        JLabel showBalanceLabel = new JLabel("$64,130.00");
        showBalanceLabel.setBounds(180, 50, 100, 30);

        balancePanel.add(balanceLabel);
        balancePanel.add(showBalanceLabel);

        JPanel transferPanel = new JPanel();
        transferPanel.setLayout(null);

        JLabel toAccountLabel = new JLabel("To Account:");
        toAccountLabel.setBounds(50, 50, 100, 30);
        JTextField toAccountField = new JTextField();
        toAccountField.setBounds(150, 50, 150, 30);

        JLabel amountLabel = new JLabel("Amount:");
        amountLabel.setBounds(50, 100, 100, 30);
        JTextField amountField = new JTextField();
        amountField.setBounds(150, 100, 150, 30);

        JButton sendButton = new JButton("Send Money");
        sendButton.setBounds(150, 150, 120, 40);

        transferPanel.add(toAccountLabel);
        transferPanel.add(toAccountField);
        transferPanel.add(amountLabel);
        transferPanel.add(amountField);
        transferPanel.add(sendButton);

        // Add tabs to JTabbedPane
        tabbedPane.addTab("Balance", balancePanel);
        tabbedPane.addTab("Transfer", transferPanel);

        appFrame.add(tabbedPane);
        appFrame.setSize(500, 400);
        appFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        appFrame.setVisible(true);
    }
}
