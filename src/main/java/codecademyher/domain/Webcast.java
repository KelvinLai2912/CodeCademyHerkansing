package codecademyher.domain;

import java.sql.Time;
import java.time.LocalDate;

public class Webcast extends ContentItem {
    private String titel;
    private String beschrijving;
    private String naamSpreker;
    private String organisatie;
    private Time tijdsduur;
    private String url;

    public Webcast(int id, int nummer, LocalDate publicatiedatum, Status status, String titel, String beschrijving,
            String naamSpreker, String organisatie, Time tijdsduur, String url) {
        super(id, nummer, publicatiedatum, status);
        this.titel = titel;
        this.beschrijving = beschrijving;
        this.naamSpreker = naamSpreker;
        this.organisatie = organisatie;
        this.tijdsduur = tijdsduur;
        this.url = url;
    }

    public String getTitel() {
        return titel;
    }

    public String getBeschrijving() {
        return beschrijving;
    }

    public String getNaamSpreker() {
        return naamSpreker;
    }

    public String getOrganisatie() {
        return organisatie;
    }

    public Time getTijdsduur() {
        return tijdsduur;
    }

    public String getUrl() {
        return url;
    }

    @Override
    public String toString() {
        return titel;
    }
}
