import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignUp {
    public static void register() {
        JFrame signUpFrame = new JFrame("Sign Up");

        JLabel usernameLabel = new JLabel("Username");
        usernameLabel.setBounds(50, 50, 80,30);
        JTextField usernameField = new JTextField();
        usernameField.setBounds(140, 50, 150, 30);

        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(50, 80, 100, 30);
        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(200, 160, 100, 40);

        JButton registerButton = new JButton("Sign Up");
        registerButton.setBounds(80, 65, 80, 30);
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getText());
                String accountID = "ACC" + (int)(Math.random() * 100000);

                Account newAccount = new Account(username, 1000, password, accountID);

                DatabaseService dbService = new DatabaseService();
                dbService.saveAccount(newAccount);

                JOptionPane.showMessageDialog(signUpFrame, "Account created successfully!");
            }
        });

        signUpFrame.add(usernameLabel);
        signUpFrame.add(usernameField);
        signUpFrame.add(passwordLabel);
        signUpFrame.add(passwordField);
        signUpFrame.add(registerButton);

        signUpFrame.setSize(400, 300);
        signUpFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        signUpFrame.setLayout(null);
        signUpFrame.setVisible(true);
    }
}
