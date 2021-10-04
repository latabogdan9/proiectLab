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
        int op;
        int stop=0;
        int id = 0;
        String bank, nume, prenume, cnp;
        Cont c[] = new Cont[10];
        while (stop==0){

            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

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
                System.out.println("Introduceti banca la care doriti sa va faceti cont: ");
                bank = scan.next();
                System.out.println("Introduceti numele dumneavoasra: ");
                nume = scan.next();
                System.out.println("Introduceti prenumele dumneavoasra: ");
                prenume = scan.next();
                System.out.println("Introduceti CNP-ul dumneavoasra: ");
                cnp = scan.next();

                c[id] = new Cont(bank,nume, prenume, cnp, id);
            }
            if(op == 2){
                System.out.println("Introduceti CNP-ul dumneavoastra: ");

            }
        }
    }
}


/*
System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

            Scanner scan = new Scanner(System.in);
            System.out.println("Alegeti o optiune:");
            System.out.println("1.Creati cont");
            System.out.println("2.Adauga bani in cont");
            System.out.println("3.Verifica soldul curent");
            System.out.println("4.Transfera bani catre alt cont");
            System.out.println("5.Retragere numerar");

            System.out.println("0.Inchideti programul");

            op = scan.nextInt();
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
 */