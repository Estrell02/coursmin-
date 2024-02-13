import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Paquet {
    private List<Carte> cartes = new ArrayList<>();

    public Paquet() {
        for (Carte.Couleur couleur : Carte.Couleur.values()) {
            for (Carte.Valeur valeur : Carte.Valeur.values()) {
                cartes.add(new Carte(valeur, couleur));
            }
        }
    }

    public void melanger() {
        Collections.shuffle(cartes);
    }

    public Carte piocher() {
        return cartes.remove(cartes.size() - 1);
    }


    public List<Carte> distribuer(int nombre) {
        List<Carte> main = new ArrayList<>();
        for (int i = 0; i < nombre; i++) {
            main.add(piocher());
        }
        return main;
    }

    // Trier les cartes par couleur ou par valeur (exemple par valeur)
    public void trierParValeur() {
        cartes.sort(Comparator.comparing(Carte::getValeur).thenComparing(Carte::getCouleur));
    }
}
