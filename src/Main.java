import com.cda2.heros.*;

public class Main {
    public static void main(String[] args) {
        Batman joueur1 = new Batman("Batman 1", 1000, 500, 200);
        Flash joueur2 = new Flash("Flash 2", 1000, 500, 200);
        Superman joueur3 = new Superman("Superman 3", 1000, 500, 200);

        System.out.println("Joueur 1: " + joueur1.getNom() + " - Vie: " + joueur1.getVie() + " - Attaque: " + joueur1.getAttaque() + " - Defense: " + joueur1.getDefense());
        System.out.println("Joueur 2: " + joueur2.getNom() + " - Vie: " + joueur2.getVie() + " - Attaque: " + joueur2.getAttaque() + " - Defense: " + joueur2.getDefense());
        System.out.println("Joueur 3: " + joueur3.getNom() + " - Vie: " + joueur3.getVie() + " - Attaque: " + joueur3.getAttaque() + " - Defense: " + joueur3.getDefense());

        joueur1.attaquer(joueur2);
        joueur2.attaquer(joueur3);
        joueur3.attaquer(joueur1);
    }
}
