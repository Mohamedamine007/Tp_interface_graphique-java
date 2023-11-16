package Exercice3;

import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;


// Inheriting from the JFrame class, so we can use its properties directly
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

    // I stop declaring the stuff that i will need so the code don't get much longer
    // from now if we need an object we'll create it directly
    public MelangeLayout() {

        // setting the essential configuration of the MelangeLayout window(fenetre)
        setTitle("melange de layout");
        setSize(500, 400);
        setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Here is the main panel, that will contain all the coming panels
        mainPanel.setLayout(new BorderLayout());

        // The second panel
        secondPanel.setLayout(new BorderLayout());
        secondPanel.add(fifthPanel, BorderLayout.NORTH);
        secondPanel.add(seventhPanel, BorderLayout.SOUTH);

        // The fifth panel will be grid layout with five rows and one column
        // Because we don't have label beside text field, we've one below the other
        fifthPanel.setLayout(new GridLayout(5,1));
        // Adding the labels with their text fields
        fifthPanel.add(nomLabel);
        fifthPanel.add(nomTextField);
        fifthPanel.add(prenomLabel);
        fifthPanel.add(prenomTextField);
        fifthPanel.add(adresseLabel);

        // The second panel has only one textField for the address
        secondPanel.add(adresseTextField);

        // The seventh panel is for sexe specification
        // It's radioButton so the user can choose only one
        // Obviously a user can't be man and woman at the same time
        seventhPanel.setLayout(new FlowLayout());
        seventhPanel.add(new JLabel("sexe"));
        seventhPanel.add(new JRadioButton("homme"));
        seventhPanel.add(new JRadioButton("femme"));


        // The third panel is for different sports
        // each sport displayed below the other using the grid layout
        // as before we've one column with 9 rows
        // They're all CheckBox input type, so the user can choose more than one
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

        // Adding buttons
        fourthPanel.setLayout(new FlowLayout());
        fourthPanel.add(new JButton("ok"));
        fourthPanel.add(new JButton("annuler"));



        // Because the mainPanel is the main and the root one
        // It's like a blueprint of the layout
        // so we specified the big parts on it
        add(mainPanel);
        mainPanel.add(secondPanel, BorderLayout.CENTER);
        mainPanel.add(thirdPanel, BorderLayout.EAST);
        mainPanel.add(fourthPanel, BorderLayout.SOUTH);

        // setting the visibility on true, so we can observe what we've done
        setVisible(true);
    }


}
