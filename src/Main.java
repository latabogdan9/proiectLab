import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int op;
        int stop=0;
        while (stop==0){

            Scanner scan = new Scanner(System.in);
            System.out.println("Alegeti o optiune:");
            System.out.println("1.Creati cont");
            System.out.println("2.Adauga bani in cont");
            System.out.println("3.Verifica soldul curent");
            System.out.println("4.Transfera bani catre alt cont");
            System.out.println("5.Retragere numerar");

            System.out.println("0.Inchideti programul");

            op = scan.nextInt();

            if (op==0){
                stop = 1;
            }

        }
    }
}
