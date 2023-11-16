package Exercice3;

import javax.swing.*;
import java.awt.*;

public class MelangeLayout extends JFrame {

    // Declaring the panels needed
    JPanel mainPanel = new JPanel();
    JPanel secondPanel = new JPanel();
    JPanel thirdPanel = new JPanel();
    JPanel fourthPanel = new JPanel();
    JPanel fifthPanel = new JPanel();
    JPanel sixthPanel = new JPanel();
    JPanel seventhPanel = new JPanel();
    // Declaring the labels
    JLabel nomLabel = new JLabel("nom");
    JLabel prenomLabel = new JLabel("Prenom");
    JLabel adresseLabel = new JLabel("Adresse");

    // Declaring the fields
    JTextField nomTextField = new JTextField();
    JTextField prenomTextField = new JTextField();
    JTextField adresseTextField = new JTextField(30);

    public MelangeLayout() {

        setTitle("melange de layout");
        setSize(500, 400);
        setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        mainPanel.setLayout(new BorderLayout());

        secondPanel.setLayout(new BorderLayout());
        secondPanel.add(fifthPanel, BorderLayout.NORTH);
        secondPanel.add(seventhPanel, BorderLayout.SOUTH);

        fifthPanel.setLayout(new GridLayout(5,1));
        fifthPanel.add(nomLabel);
        fifthPanel.add(nomTextField);
        fifthPanel.add(prenomLabel);
        fifthPanel.add(prenomTextField);
        fifthPanel.add(adresseLabel);

        secondPanel.add(adresseTextField);

        seventhPanel.setLayout(new FlowLayout());
        seventhPanel.add(new JLabel("sexe"));
        seventhPanel.add(new JRadioButton("homme"));
        seventhPanel.add(new JRadioButton("femme"));

        thirdPanel.setLayout(new GridLayout(9, 1));
        thirdPanel.add(new JCheckBox("tennis"));
        thirdPanel.add(new JCheckBox("squash"));
        thirdPanel.add(new JCheckBox("natation"));
        thirdPanel.add(new JCheckBox("athletisme"));
        thirdPanel.add(new JCheckBox("randonnee"));
        thirdPanel.add(new JCheckBox("foot"));
        thirdPanel.add(new JCheckBox("basket"));
        thirdPanel.add(new JCheckBox("volley"));
        thirdPanel.add(new JCheckBox("pelanque"));

        fourthPanel.setLayout(new FlowLayout());
        fourthPanel.add(new JButton("ok"));
        fourthPanel.add(new JButton("annuler"));




        add(mainPanel);
        mainPanel.add(secondPanel, BorderLayout.CENTER);
        mainPanel.add(thirdPanel, BorderLayout.EAST);
        mainPanel.add(fourthPanel, BorderLayout.SOUTH);

        setVisible(true);
    }


}
