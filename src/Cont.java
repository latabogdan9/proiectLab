public class Cont {
    String nume;
    String prenume;
    private String cnp;
    float suma;
    int id;
    public Cont(String nume, String prenume, String cnp, int id,float suma) {

        this.nume = nume;
        this.prenume = prenume;
        this.cnp = cnp;
        this.id = id;
        this.suma = suma;
    }

    public String getCnp() {
        return cnp;
    }
}
