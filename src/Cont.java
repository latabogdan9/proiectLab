public class Cont {
    private String nume;
    private String prenume;
    private String cnp;
    private int suma;
    private int id;
    public Cont(String nume, String prenume, String cnp, int id,int suma) {

        this.nume = nume;
        this.prenume = prenume;
        this.cnp = cnp;
        this.id = id;
        this.suma = suma;
    }

    public String getCnp() {
        return cnp;
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public float getSuma() {
        return suma;
    }

    public int getId() {
        return id;
    }

    public void addSuma(int suma) {
        this.suma = this.suma + suma;
    }

    public void withdrawSuma(int suma) {
            this.suma = this.suma - suma;

    }
}
