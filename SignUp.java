import javax.swing.*;

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

        signUpFrame.add(usernameLabel);
        signUpFrame.add(usernameField);
        signUpFrame.add(passwordLabel);
        signUpFrame.add(passwordField);

        signUpFrame.setSize(400, 300);
        signUpFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        signUpFrame.setLayout(null);
        signUpFrame.setVisible(true);
    }
}
