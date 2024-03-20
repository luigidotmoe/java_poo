import com.cda2.classe.*;

public class Main {
    public static void main(String[] args) {
        Personnage joueur1 = new Personnage("Joueur 1", 10520, 1860, 5);
        Personnage joueur2 = new Personnage("Joueur 2", 1000, 445, 600);
        Partie partie = new Partie(joueur1, joueur2, 10);
        System.out.println(partie.lancerPartie());
    }
}
