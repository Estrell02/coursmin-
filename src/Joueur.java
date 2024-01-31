public class Joueur {
    private String nom;
    private La_main main;

    public Joueur(String nom) {
        this.nom = nom;
        main = new La_main();
    }

    public void recevoirCarte(Carte carte) {
        main.ajouterCarte(carte);
    }


}
