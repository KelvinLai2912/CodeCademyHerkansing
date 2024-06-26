package codecademyher.domain;

import java.util.Objects;

public class Cursus {
    private int id;
    private String naam;
    private String onderwerp;
    private String introductietekst;
    private Niveau niveauaanduiding;

    public Cursus(int id, String naam, String onderwerp, String introductietekst, Niveau niveauaanduiding) {
        this.id = id;
        this.naam = naam;
        this.onderwerp = onderwerp;
        this.introductietekst = introductietekst;
        this.niveauaanduiding = niveauaanduiding;
    }

    public int getId() {
        return id;
    }

    public String getNaam() {
        return naam;
    }

    public String getOnderwerp() {
        return onderwerp;
    }

    public String getIntroductietekst() {
        return introductietekst;
    }

    public Niveau getNiveauaanduiding() {
        return niveauaanduiding;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 61 * hash + this.id;
        hash = 61 * hash + Objects.hashCode(this.naam);
        hash = 61 * hash + Objects.hashCode(this.onderwerp);
        hash = 61 * hash + Objects.hashCode(this.introductietekst);
        hash = 61 * hash + Objects.hashCode(this.niveauaanduiding);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cursus other = (Cursus) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.naam, other.naam)) {
            return false;
        }
        if (!Objects.equals(this.onderwerp, other.onderwerp)) {
            return false;
        }
        if (!Objects.equals(this.introductietekst, other.introductietekst)) {
            return false;
        }
        if (!Objects.equals(this.niveauaanduiding, other.niveauaanduiding)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return naam;
    }

}
