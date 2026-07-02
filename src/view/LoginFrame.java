package view;

import controller.LoginController;

import javax.swing.*;
import java.awt.*;

public class LoginFrame extends JFrame {

    private JTextField usernameField;

    private JPasswordField passwordField;

    private JButton loginButton;

    private LoginController controller =
            new LoginController();

    public LoginFrame() {

        setTitle(
                "Employee Management - Login"
        );

        setSize(
                350,
                220
        );

        setDefaultCloseOperation(
                EXIT_ON_CLOSE
        );

        setLocationRelativeTo(
                null
        );

        setLayout(
                new GridLayout(
                        3,
                        2
                )
        );

        add(
                new JLabel(
                        "Username"
                )
        );

        usernameField =
                new JTextField();

        add(
                usernameField
        );

        add(
                new JLabel(
                        "Password"
                )
        );

        passwordField =
                new JPasswordField();

        add(
                passwordField
        );

        loginButton =
                new JButton(
                        "Login"
                );

        add(
                new JLabel()
        );

        add(
                loginButton
        );

        loginButton.addActionListener(
                e -> login()
        );

    }

    private void login() {

        String username =
                usernameField.getText();

        String password =
                new String(
                        passwordField.getPassword()
                );

        boolean success =
                controller.login(
                        username,
                        password
                );

        if (success) {

            JOptionPane.showMessageDialog(
                    this,
                    "Login Success"
            );

        } else {

            JOptionPane.showMessageDialog(
                    this,
                    "Login Failed"
            );

        }

    }

}