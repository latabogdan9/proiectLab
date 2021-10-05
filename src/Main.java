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