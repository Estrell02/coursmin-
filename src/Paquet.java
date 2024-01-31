import java.util.ArrayList;
import java.util.Collections;

public class Paquet {

    private ArrayList<Carte> cartes;

    public Paquet() {
        cartes = new ArrayList<>();
        for (Carte.Couleur couleur : Carte.Couleur.values()) {
            for (int valeur = 1; valeur <= 13; valeur++) {
                cartes.add(new Carte(valeur, couleur));
            }
        }
    }

    public void melanger() {
        Collections.shuffle(cartes);
    }

    public Carte piocher() {
        if (!cartes.isEmpty()) {
            return cartes.remove(cartes.size() - 1);
        } else {
            return null;
        }
    }

    public boolean estVide() {
        return cartes.isEmpty();
    }
}
