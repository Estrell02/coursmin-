import java.util.ArrayList;
import java.util.List;

public class Partie {
    private List<Joueur> joueurs = new ArrayList<>();
    private Paquet paquet;

    public Partie() {
        paquet = new Paquet();
        paquet.melanger();
    }

    public void ajouterJoueur(Joueur joueur) {
        joueurs.add(joueur);
    }

    public void distribuerCartes() {
        for (Joueur joueur : joueurs) {
            joueur.recevoirCartes(paquet.distribuer(5));
        }
    }

    // Initialiser et jouer la partie
    public void jouer() {
        distribuerCartes();
        // Logique pour dérouler la partie et déterminer le gagnant
    }
}
