import java.util.Random;
public class Card {

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
}
