package codecademyher.domain;

public enum Niveau {
    BEGINNER("Beginner"), GEVORDERD("Gevorderd"), EXPERT("Expert");

    private String niveauNaam;

    Niveau(String niveauNaam) {
        this.niveauNaam = niveauNaam;
    }

    public String getNiveauNaam() {
        return niveauNaam;
    }

    public static Niveau fromString(String s) {
        if (s.equals("Beginner"))
            return Niveau.BEGINNER;
        if (s.equals("Gevorderd"))
            return Niveau.GEVORDERD;
        if (s.equals("Expert"))
            return Niveau.EXPERT;
        return Niveau.BEGINNER;
    }
}
