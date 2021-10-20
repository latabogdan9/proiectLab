package gui;

import classes.Bank;
import classes.Card;
import classes.Cont;
import interfaces.ICard;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;




public class Main {

    private JPanel Panel;
    private JButton iesireButton;
    private JButton intrareInContButton;
    private JButton creareContButton;
    private JTextPane bancaTextPane;


    public static Bank exemplu = new Bank(0,null);

    public static void setO(Bank a,int x){
        banca[x]=a;
    }




    public static int id=0;

    public static Bank banca[] = new Bank[10];

    public static int stop=0;



    public Main(){



        creareContButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                JFrame cframe = new JFrame("frame2");
                cframe.setContentPane(new CreareCont().cc);
                cframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                cframe.setLocationRelativeTo(null);
                cframe.setSize(500,500);
                cframe.setVisible(true);




            }
        });

        iesireButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        intrareInContButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new JFrame("frame");
                frame.setContentPane(new IntrareCont().ic);
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.setLocationRelativeTo(null);
                frame.setSize(500,500);
                frame.setVisible(true);

            }
        });
    }

    public static void main(String[] args) {
        banca[0] = new Bank(0,null);
        JFrame frame = new JFrame("frame");
        frame.setContentPane(new Main().Panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setSize(500,500);
        frame.setVisible(true);
       /* int op,op1;
        int stop=0,stop1=0;
        int id = 0;
        int suma;
        int pin;
        Card auxCard;
        String nume, prenume, cnp, cnp2;

        Cont aux;

        Bank banca[] = new Bank[10];
        banca[0] = new Bank(0,null);
        banca[1]=exemplu;

        while (stop==0){


            Scanner scan = new Scanner(System.in);
            System.out.println("Alegeti o optiune:");
            System.out.println("1.Creati cont");
            System.out.println("2.Intrare in cont");

            System.out.println("0.Inchideti programul");

            op = scan.nextInt();
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            if (op==0){
                stop = 1;
            }
            if(op == 1) {
                id++;

                System.out.println("Introduceti numele dumneavoasra: ");
                nume = scan.next();
                System.out.println("Introduceti prenumele dumneavoasra: ");
                prenume = scan.next();
                System.out.println("Introduceti CNP-ul dumneavoasra: ");
                cnp = scan.next();
                System.out.print("Alegeti un PIN de 4 cifre pentru cardul dumneavoastra: ");
                pin = scan.nextInt();
                auxCard = new Card(pin);
                aux = new Cont(nume, prenume, cnp, id,0,auxCard);
                banca[id] = new Bank(id,aux);
                banca[0].contNou(banca[0].getNumarConturi());
            }
            if(op == 2){
                System.out.println("Introduceti CNP-ul dumneavoastra: ");
                cnp = scan.next();
                for(int i=1;i<=2;i++){
                    if(banca[i].c.getCnp().equals(cnp)) {
                        System.out.println("Introduceti codul de securitate al cardului(PIN): ");
                        pin = scan.nextInt();
                        if (pin == banca[i].c.card.getPin()){
                            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                            System.out.println("Buna ziua, " + banca[i].c.getNume() + " " + banca[i].c.getPrenume());
                            System.out.println("Ati intrat cu succes in cont!");
                            stop1 = 0;
                            while (stop1 == 0) {


                                System.out.println("Alegeti o optiune:");
                                System.out.println("1.Adauga bani in cont");
                                System.out.println("2.Verifica soldul curent");
                                System.out.println("3.Retragere numerar");
                                System.out.println("4.Transfera bani catre alt cont");
                                System.out.println("5.Citire date card");
                                System.out.println("0.Deconectare");

                                op1 = scan.nextInt();

                                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

                                if (op1 == 0) {
                                    stop1 = 1;
                                }
                                if (op1 == 1) {
                                    System.out.println("Introduceti suma pe care doriti sa o depuneti: ");
                                    suma = scan.nextInt();
                                    banca[i].c.addSuma(suma);
                                    System.out.println("Ati introdus cu succes suma de " + suma + " in contul dumneavoastra!");
                                }
                                if (op1 == 2) {
                                    System.out.println("Soldul contului este de " + banca[i].c.getSuma() + " RON.");
                                }
                                if (op1 == 3) {
                                    System.out.println("Introduceti suma pe care doriti sa o retrageti: ");
                                    suma = scan.nextInt();
                                    if (suma > banca[i].c.getSuma())
                                        System.out.println("Fonduri insuficiente");
                                    else banca[i].c.withdrawSuma(suma);
                                }
                                if (op1 == 4) {
                                    System.out.println("Introduceti CNP-ul persoanei catre care doriti sa trimiteti bani: ");
                                    cnp2 = scan.next();
                                    System.out.println("Introduceti suma pe care doriti sa o transferati");
                                    suma = scan.nextInt();
                                    if (suma > banca[i].c.getSuma())
                                        System.out.println("Fonduri insuficiente");
                                    else
                                        for (int j = 1; j <= banca[0].getNumarConturi(); j++) {
                                            if (cnp2.equals(banca[j].c.getCnp())) {
                                                banca[i].c.withdrawSuma(suma);
                                                banca[j].c.addSuma(suma);
                                                System.out.println("Transfer incheiat cu succes");
                                            } else System.out.println("Persoana cautata nu are cont la banca");
                                        }
                                }
                                if(op1 == 5){
                                    banca[i].c.card.afisare(banca[i]);

                                }
                            }
                        }
                        else System.out.println("Cod PIN gresit.");
                    }
                    else {
                        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                        System.out.println("CNP-ul introdus nu corespunde nici unui cont existent!");
                    }
                }
            }
        }

        */
    }



}

