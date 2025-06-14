import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] argv) {
        JFrame loginFrame = new JFrame("Kaya Bank App");

        JLabel usernameLabel = new JLabel("Username: ");
        usernameLabel.setBounds(50, 50, 80, 30);
        JTextField usernameField = new JTextField();
        usernameField.setBounds(140, 50, 150, 30);

        JLabel passwordLabel = new JLabel("Password: ");
        passwordLabel.setBounds(50, 100, 80, 30);
        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(140, 100, 150, 30);

        JButton signInButton = new JButton("Sign In");
        signInButton.setBounds(80, 160, 100, 40);
        JButton signUpButton = new JButton("Sign Up");
        signUpButton.setBounds(200, 160, 100, 40);

        signInButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        });

        signUpButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SignUp.register();
            }
        });

        loginFrame.add(usernameLabel);
        loginFrame.add(usernameField);
        loginFrame.add(passwordLabel);
        loginFrame.add(passwordField);
        loginFrame.add(signInButton);
        loginFrame.add(signUpButton);

        loginFrame.setSize(400, 300);
        loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginFrame.setLayout(null);
        loginFrame.setVisible(true);
    }
}
