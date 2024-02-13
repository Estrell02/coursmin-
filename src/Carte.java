public class Carte {
    private Valeur valeur;
    private Couleur couleur;

    public enum Couleur {
        coeur, carreau, pique, trefle;
    }
    public enum Valeur {
        DEUX, TROIS, QUATRE, CINQ, SIX, SEPT, HUIT, NEUF, DIX, VALET, DAME, ROI, AS
    }

    public Carte(Valeur valeur, Couleur couleur) {
        this.valeur = valeur;
        this.couleur = couleur;
    }

    public Couleur getCouleur() {
        return couleur;
    }

    public Valeur getValeur() {
        return valeur;
    }

    @Override
    public String toString() {
        return valeur + " de " + couleur;
    }
}
