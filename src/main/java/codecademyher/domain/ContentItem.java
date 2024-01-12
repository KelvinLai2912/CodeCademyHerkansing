package codecademyher.domain;

import java.time.LocalDate;

public abstract class ContentItem {

    private int id;
    private int nummer;
    private LocalDate publicatiedatum;
    private Status status; // concept, actief, gearchiveerd
    // TODO: enum

    public ContentItem(int id, int nummer, LocalDate publicatiedatum, Status status) {
        this.id = id;
        this.nummer = nummer;
        this.publicatiedatum = publicatiedatum;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public int getNummer() {
        return nummer;
    }

    public LocalDate getPublicatiedatum() {
        return publicatiedatum;
    }

    public Status getStatus() {
        return status;
    }

}
