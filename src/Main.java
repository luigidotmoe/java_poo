import com.cda2.classe.Habitation;
public class Main {
    public static void main(String[] args) {
        Habitation habitation1 = new Habitation("Maison", 10, 5);
        Habitation habitation2 = new Habitation("Appartement", 5, 5);
        Habitation habitation3 = new Habitation("Villa", 15, 10);

        System.out.println("L'habitation " + habitation1.getNom() + " a une surface de " + habitation1.surface() + " m²");
        System.out.println("L'habitation " + habitation2.getNom() + " a une surface de " + habitation2.surface() + " m²");
        System.out.println("L'habitation " + habitation3.getNom() + " a une surface de " + habitation3.surface() + " m²");
    }
}
