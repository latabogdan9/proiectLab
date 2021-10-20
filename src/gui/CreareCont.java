package gui;

import classes.Bank;
import classes.Card;
import classes.Cont;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreareCont extends Main {
    protected JPanel cc;
    private JTextPane creareContTextPane;
    private JTextPane introducetiVaNumeleTextPane;
    private JTextPane introducetiVaPrenumeleTextPane;
    private JTextPane CNPTextPane;
    private JTextPane codPINCardTextPane;
    public JTextField textField1;
    protected JTextField textField2;
    protected JTextField textField3;
    protected JTextField textField4;
    protected JButton OKButton;

    Card auxCard;
    String nume, prenume, cnp, cnp2;
    Cont aux;
    Bank x;


    int pin;


    public class info
    {

        public static void infoBox(String infoMessage, String titleBar)
        {
            JOptionPane.showMessageDialog(null, infoMessage, "InfoBox: " + titleBar, JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public CreareCont(){

        super();
        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(textField1.getText().equals("") || textField2.getText().equals("") || textField3.getText().equals("") || textField4.getText().equals("") ){
                    info.infoBox("Date incorecte","Eroare");
                }
                else{
                    nume = textField1.getText();
                    prenume = textField2.getText();
                    cnp = textField3.getText();
                    pin = Integer.parseInt(textField4.getText());

                    auxCard = new Card(pin);
                    aux = new Cont(nume,prenume,cnp,Main.id,0,auxCard);

                    x = new Bank(Main.id,aux);

                    setO(x,Main.id);

                    info.infoBox("Cont adaugat cu succes. Puteti inchide fereastra.","Succes");

                    Main.stop=1;
                    textField1.setText("");
                    textField2.setText("");
                    textField3.setText("");
                    textField4.setText("");

                }
            }
        });
    }


}
