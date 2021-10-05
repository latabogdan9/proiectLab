import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println(" /$$$$$$$");
        System.out.println("| $$__  $$ ");
        System.out.println("| $$  \\ $$  /$$$$$$  /$$$$$$$   /$$$$$$$  /$$$$$$ ");
        System.out.println("| $$$$$$$  |____  $$| $$__  $$ /$$_____/ |____  $$");
        System.out.println("| $$__  $$  /$$$$$$$| $$  \\ $$| $$        /$$$$$$$");
        System.out.println("| $$  \\ $$ /$$__  $$| $$  | $$| $$       /$$__  $$");
        System.out.println("| $$$$$$$/|  $$$$$$$| $$  | $$|  $$$$$$$|  $$$$$$$");
        System.out.println("|_______/  \\_______/|__/  |__/ \\_______/ \\_______/");
        int op,op1;
        int stop=0,stop1=0;
        int id = 0;
        int suma;
        String nume, prenume, cnp, cnp2;

        Cont aux;

        Bank banca[] = new Bank[10];
        banca[0] = new Bank(0,null);
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

                aux = new Cont(nume, prenume, cnp, id,0);
                banca[id] = new Bank(id,aux);
                banca[0].contNou(banca[0].getNumarConturi());
            }
            if(op == 2){
                System.out.println("Introduceti CNP-ul dumneavoastra: ");
                cnp = scan.next();
                for(int i=1;i<=banca[0].getNumarConturi();i++){
                    if(banca[i].c.getCnp().equals(cnp)){
                        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                        System.out.println("Ati intrat cu succes in cont!");
                        stop1=0;
                        while(stop1==0){
                            System.out.println("Buna ziua, " + banca[i].c.getNume() + " " + banca[i].c.getPrenume());

                            System.out.println("Alegeti o optiune:");
                            System.out.println("1.Adauga bani in cont");
                            System.out.println("2.Verifica soldul curent");
                            System.out.println("3.Retragere numerar");
                            System.out.println("4.Transfera bani catre alt cont");
                            System.out.println("0.Deconectare");

                            op1 = scan.nextInt();

                            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

                            if(op1==0){
                                stop1=1;
                            }
                            if(op1 == 1){
                                System.out.println("Introduceti suma pe care doriti sa o depuneti: ");
                                suma = scan.nextInt();
                                banca[i].c.addSuma(suma);
                                System.out.println("Ati introdus cu succes suma de " + suma  + " in contul dumneavoastra!");
                            }
                            if(op1 == 2){
                                System.out.println("Soldul contului este de " + banca[i].c.getSuma() + " RON.");
                            }
                            if(op1 == 3){
                                System.out.println("Introduceti suma pe care doriti sa o retrageti: ");
                                suma = scan.nextInt();
                                if(suma>banca[i].c.getSuma())
                                    System.out.println("Fonduri insuficiente");
                                else banca[i].c.withdrawSuma(suma);
                            }
                            if(op1 == 4){
                                System.out.println("Introduceti CNP-ul persoanei catre care doriti sa trimiteti bani: ");
                                cnp2 = scan.next();
                                System.out.println("Introduceti suma pe care doriti sa o transferati");
                                suma = scan.nextInt();
                                if(suma>banca[i].c.getSuma())
                                    System.out.println("Fonduri insuficiente");
                                else
                                    for(int j =1;j<=banca[0].getNumarConturi();j++){
                                        if(cnp2.equals(banca[j].c.getCnp())){
                                            banca[i].c.withdrawSuma(suma);
                                            banca[j].c.addSuma(suma);
                                            System.out.println("Transfer incheiat cu succes");
                                        }
                                        else System.out.println("Persoana cautata nu are cont la banca");
                                    }
                            }
                        }


                    }
                    else {
                        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                        System.out.println("CNP-ul introdus nu corespunde nici unui cont existent!");
                    }
                }
            }
        }
    }
}

