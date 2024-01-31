import java.util.ArrayList;

public class Partie {
    private ArrayList<Joueur> joueurs;
    private Paquet paquet;

    public Partie(int nombreDeJoueurs) {
        paquet = new Paquet();
        paquet.melanger();
        joueurs = new ArrayList<>();

        for (int i = 0; i < nombreDeJoueurs; i++) {
            joueurs.add(new Joueur("Joueur " + (i + 1)));
        }
    }

    public void distribuerCartes(int nombreDeCartesParJoueur) {
        for (Joueur joueur : joueurs) {
            for (int i = 0; i < nombreDeCartesParJoueur; i++) {
                if (!paquet.estVide()) {
                    joueur.recevoirCarte(paquet.piocher());
                } else {

                }
            }
        }
    }

    public void jouer() {

        distribuerCartes(5);

    }
}
