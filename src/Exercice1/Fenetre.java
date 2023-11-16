package Exercice1;

// Importing What we'll need in javax swing, awt
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Fenetre extends JFrame{

    JPanel panel = new JPanel();
    JButton giButton = new JButton("Genie info");
    JButton gimButton = new JButton("Genie industriel");
    JButton tmButton = new JButton("management");
    JButton cqButton = new JButton("Controle de qualite");
    JOptionPane optionPane = new JOptionPane();

    public String nomFiliere;

    public Fenetre() {

        // setting the essential things that we'll need so the Fenetre will behave as we want
        setTitle("Fenetre des filieres");
        setSize(500, 400);
        setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        giButton.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        nomFiliere = giButton.getText();
                        optionPane.showMessageDialog(Fenetre.this, "C'est " + nomFiliere);
                    }
                }
        );

        gimButton.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        nomFiliere = gimButton.getText();
                        optionPane.showMessageDialog(Fenetre.this, "C'est " + nomFiliere);
                    }
                }
        );

        tmButton.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        nomFiliere = tmButton.getText();
                        optionPane.showMessageDialog(Fenetre.this, "C'est " + nomFiliere);
                    }
                }
        );

        cqButton.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        nomFiliere = cqButton.getText();
                        optionPane.showMessageDialog(Fenetre.this, "C'est " + nomFiliere);
                    }
                }
        );

        // Setting the layout that we'll use
        panel.setLayout(new FlowLayout());
        // Adding the buttons needed to the panel
        panel.add(giButton);
        panel.add(gimButton);
        panel.add(tmButton);
        panel.add(cqButton);
        // Adding the panel to the Fenetre
        add(panel);

        // The most important one is to make this setVisible to trur, otherwise nothing appears
        setVisible(true);
    }
}
