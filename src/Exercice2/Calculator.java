package Exercice2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame {

    // fields declaration needed for the conversion part
    // Because we'll convert the strings entered by the users to doubles, so we can calculate them

    public double firstUserInput;
    public double secondUserInput;

    // Panels declaration
    JPanel mainPanel = new JPanel();
    JPanel northPanel = new JPanel();
    JPanel centerPanel = new JPanel();

    // Labels declaration
    JLabel firstNumberLabel = new JLabel("premier nombre: ");
    JLabel secondNumberLabel = new JLabel("deuxieme nombre: ");
    JLabel resultLabel = new JLabel("resultat: ");

    // Text fields declaration
    JTextField firstTextField = new JTextField(10);
    JTextField secondTextField = new JTextField(10);
    JTextField resultTextField = new JTextField(10);

    // Buttons declaration

    JButton sumButton = new JButton("la somme");
    JButton mulButton = new JButton("le produit");
    JButton diffButton = new JButton("la soustraction");
    JButton divButton = new JButton("la division");

    public Calculator() {

        // Adding the essentials things for the "fenetre"
        setTitle("ma fenetre");
        setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        setSize(500, 200);
        setLocationRelativeTo(null);

        mainPanel.setLayout(new BorderLayout());

        // Setting the grid layout for the northPanel
        // Specifying 3 rows and 2 columns as needed in the Tp
        northPanel.setLayout(new GridLayout(3, 2));
        northPanel.add(firstNumberLabel);
        northPanel.add(firstTextField);
        northPanel.add(secondNumberLabel);
        northPanel.add(secondTextField);
        northPanel.add(resultLabel);
        northPanel.add(resultTextField);

        // Setting the grid layout for the centerPanel
        // That hgap: 10 and vgap: 10 stands for the horizontal and vertical gap between the buttons
        centerPanel.setLayout(new GridLayout(2, 2, 10, 10));
        centerPanel.add(sumButton);
        centerPanel.add(mulButton);
        centerPanel.add(diffButton);
        centerPanel.add(divButton);

        // Adding the actionListener to the sum button
        sumButton.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // Here the conversion part where we use the fields declared before
                        // We convert from string to doubles, so we can make the operation
                        firstUserInput = Double.parseDouble(firstTextField.getText());
                        secondUserInput = Double.parseDouble(secondTextField.getText());
                        // In order to display the result on the result field we need to convert it to string
                        // so i think of adding just "", instead of converting again
                        resultTextField.setText(firstUserInput + secondUserInput + "");
                    }
                }
        );

        // The same things mentioned on the previous actionListener are the same in the difference and multiplication
        diffButton.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        firstUserInput = Double.parseDouble(firstTextField.getText());
                        secondUserInput = Double.parseDouble(secondTextField.getText());
                        resultTextField.setText(firstUserInput - secondUserInput + "");
                    }
                }
        );

        mulButton.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        firstUserInput = Double.parseDouble(firstTextField.getText());
                        secondUserInput = Double.parseDouble(secondTextField.getText());
                        resultTextField.setText(firstUserInput * secondUserInput + "");
                    }
                }
        );

        divButton.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        firstUserInput = Double.parseDouble(firstTextField.getText());
                        secondUserInput = Double.parseDouble(secondTextField.getText());
                        // we add this if statement with the JOptionPane, so we can inform the user if he wants to devide by zero
                        if(secondUserInput == 0) {
                            new JOptionPane().showMessageDialog(Calculator.this, "Cannot devide by zero", "Alert", JOptionPane.WARNING_MESSAGE);
                        } else {
                            resultTextField.setText(firstUserInput / secondUserInput + "");
                        }
                    }
                }
        );


        // Adding the mainPanel to the "fenetre"
        add(mainPanel);
        // Adding the northPanel to the north part of the mainPanel
        mainPanel.add(northPanel, BorderLayout.NORTH);
        // Adding the centerPanel to the center part of the mainPanel
        mainPanel.add(centerPanel, BorderLayout.CENTER);
        setVisible(true);
    }
}
