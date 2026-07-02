package view;

import controller.EmployeeController;

import javax.swing.*;
import java.awt.*;

public class EmployeeFrame
        extends JFrame {

    private JTextField nameField;

    private JButton saveButton;

    private EmployeeController controller =
            new EmployeeController();

    public EmployeeFrame() {

        setTitle(
                "Employee"
        );

        setSize(
                300,
                180
        );

        setLayout(
                new GridLayout(
                        2,
                        2
                )
        );

        setLocationRelativeTo(
                null
        );

        add(
                new JLabel(
                        "Employee Name"
                )
        );

        nameField =
                new JTextField();

        add(
                nameField
        );

        add(
                new JLabel()
        );

        saveButton =
                new JButton(
                        "Save"
                );

        add(
                saveButton
        );

        saveButton.addActionListener(
                e -> save()
        );

    }

    private void save() {

        controller.save(
                nameField.getText()
        );

        JOptionPane.showMessageDialog(
                this,
                "Employee Saved"
        );

    }

}