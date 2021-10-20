package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IntrareCont extends Main{
    protected JPanel ic;
    private JTextPane introducetiCnpUlDvsTextPane;
    private JTextField textField1;
    private JTextPane introducetiCodulPinTextPane;
    private JTextField textField2;
    private JButton okButton;
    int ok=1;
    int i=1;
    public class info
    {

        public static void infoBox(String infoMessage, String titleBar)
        {
            JOptionPane.showMessageDialog(null, infoMessage, "InfoBox: " + titleBar, JOptionPane.INFORMATION_MESSAGE);
        }
    }


    public IntrareCont(){
        super();

        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                for( i=1;i<banca[0].getNumarConturi();i++){

                    if(textField1.getText().equals(Main.banca[i].c.getCnp()) && Main.banca[i].c.card.getPin()== Integer.parseInt(textField2.getText())){
                        ok=0;
                        JFrame iframe = new JFrame("frame2");
                        iframe.setContentPane(new CreareCont().cc);
                        iframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                        iframe.setLocationRelativeTo(null);
                        iframe.setSize(500,500);
                        iframe.setVisible(true);
                        System.out.println(banca[i].c.getCnp());
                    }
                }
                if(ok==1)
                    info.infoBox("Date incorecte","Eroare");
            }
        });
    }
}
