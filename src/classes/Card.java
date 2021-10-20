package classes;

import gui.Main;
import interfaces.ICard;

import java.util.Random;
public class Card extends Main implements ICard {

    Random rand = new Random();
    int x;
    String numarCard,aux;
    int pin;
    String dataExp;

    public String getNumarCard() {
        return numarCard;
    }

    public int getPin() {
        return pin;
    }

    public String getDataExp() {
        return dataExp;
    }

    public String generareNumarCard(){
        aux="";
        for(int i=0;i<8;i++){
            x=rand.nextInt(10,99);
            aux = aux + x;
            if(i%2==1)
                aux=aux+" ";
        }
        return aux;
    }

    public String generareDataExp(){
        aux="";

        x=rand.nextInt(1,13);
        aux = aux+ x;
        aux = aux + "/";
        x = rand.nextInt(21,30);
        aux = aux+x;

        return aux;
    }
    public Card(int pin){
        this.pin = pin;
        this.numarCard = generareNumarCard();
        this.dataExp = generareDataExp();
    }

    @Override
    public void afisare(Bank banca) {
        System.out.println("\nNumar card: " + banca.c.card.getNumarCard());
        System.out.println("Data expirare card: " + banca.c.card.getDataExp() + "\n\n");
    }
}
