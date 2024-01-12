package codecademyher.domain;

import java.time.LocalDate;

public class Module extends ContentItem {
    private String titel;
    private int versie;
    private String beschrijving;
    private String naamcontactpersoon;
    private String emailcontactpersoon;
    private int volgnummer;
    private int cursusid;

    public Module(int id, int nummer, LocalDate publicatiedatum, Status status, String titel, int versie,
            String beschrijving, String naamcontactpersoon, String emailcontactpersoon, int volgnummer, int cursusid) {
        super(id, nummer, publicatiedatum, status);
        this.titel = titel;
        this.versie = versie;
        this.beschrijving = beschrijving;
        this.naamcontactpersoon = naamcontactpersoon;
        this.emailcontactpersoon = emailcontactpersoon;
        this.volgnummer = volgnummer;
        this.cursusid = cursusid;
    }

    public String getTitel() {
        return titel;
    }

    public int getVersie() {
        return versie;
    }

    public String getBeschrijving() {
        return beschrijving;
    }

    public String getNaamcontactpersoon() {
        return naamcontactpersoon;
    }

    public String getEmailcontactpersoon() {
        return emailcontactpersoon;
    }

    public int getVolgnummer() {
        return volgnummer;
    }

    public int getCursusid() {
        return cursusid;
    }

    @Override
    public String toString() {
        return titel;
    }
}
