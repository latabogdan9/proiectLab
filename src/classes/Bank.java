package classes;

import gui.Main;

public class Bank extends Main {

    public Cont c;
    private int numarConturi;


    public Bank( int numarConturi, Cont c) {

        this.numarConturi = numarConturi;
        this.c = c;
    }


    public int getNumarConturi() {
        return numarConturi;
    }


    public void contNou(int numarConturi){
        this.numarConturi = this.numarConturi + 1;
    }

}
