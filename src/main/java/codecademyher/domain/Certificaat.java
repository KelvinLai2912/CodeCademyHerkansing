package codecademyher.domain;

public class Certificaat {

    private int id;
    private double cijfer;
    private String medewerker;
    private int nummer;
    private Inschrijving inschrijving;

    public Certificaat(int id, double cijfer, String medewerker, int nummer, Inschrijving inschrijving) {
        this.id = id;
        this.cijfer = cijfer;
        this.medewerker = medewerker;
        this.nummer = nummer;
        this.inschrijving = inschrijving;
    }

    public int getId() {
        return id;
    }

    public double getCijfer() {
        return cijfer;
    }

    public String getMedewerker() {
        return medewerker;
    }

    public int getNummer() {
        return nummer;
    }

    public Inschrijving getInschrijving() {
        return inschrijving;
    }

    @Override
    public String toString() {
        return "Cursus: " + inschrijving.getCursus().getNaam() + ", Cijfer: " + cijfer + ", Medewerker: " + medewerker
                + ", Nummer: " + nummer + "\n";
    }

}
