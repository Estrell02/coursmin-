import java.util.ArrayList;
import java.util.List;

public class Joueur {
    private List<Carte> main;
    private String nom;

    public Joueur(String nom) {
        this.nom = nom;
        this.main = new ArrayList<>();
    }

    public void recevoirCartes(List<Carte> cartes) {
        this.main.addAll(cartes);
    }

    // Getters et setters
}
