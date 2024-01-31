public class Carte {
    private int valeur;
    private Couleur couleur;

    public enum Couleur {
        coeur, carreau, pique, trefle;
    }

    public Carte(int valeur, Couleur couleur) {
        this.valeur = valeur;
        this.couleur = couleur;
    }

    public int getValeur() {
        return valeur;
    }

    public Couleur getCouleur() {
        return couleur;
    }

    @Override
    public String toString() {
        return "Carte{" + "valeur=" + valeur + ", couleur=" + couleur + '}';
    }
}
