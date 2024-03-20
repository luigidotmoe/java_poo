import com.cda2.classe.Habitation;
import com.cda2.classe.Vehicule;
public class Main {
    public static void main(String[] args) {
        Habitation habitation1 = new Habitation("Maison", 10, 5, 2);
        Habitation habitation2 = new Habitation("Appartement", 5, 5, 1);
        Habitation habitation3 = new Habitation("Villa", 15, 10, 3);

        System.out.println("L'habitation " + habitation1.getNom() + " a une surface de " + habitation1.surface() + " m²");
        System.out.println("L'habitation " + habitation2.getNom() + " a une surface de " + habitation2.surface() + " m²");
        System.out.println("L'habitation " + habitation3.getNom() + " a une surface de " + habitation3.surface() + " m²");

        Vehicule vehicule1 = new Vehicule("Voiture", 4, 100);
        Vehicule vehicule2 = new Vehicule("Moto", 2, 150);
        Vehicule vehicule3 = new Vehicule("Camion", 6, 80);
        Vehicule vehicule4 = new Vehicule("Bateau", 0, 50);

        System.out.println(vehicule1.detect());
        System.out.println(vehicule2.detect());
        System.out.println(vehicule3.detect());
        System.out.println(vehicule4.detect());

        System.out.println("Le véhicule " + vehicule1.getType() + " possède une vitesse de " + vehicule1.getVitesse() + " km/h");
        System.out.println("Le véhicule " + vehicule2.getType() + " possède une vitesse de " + vehicule2.getVitesse() + " km/h");
        System.out.println("Le véhicule " + vehicule3.getType() + " possède une vitesse de " + vehicule3.getVitesse() + " km/h");
        System.out.println("Le véhicule " + vehicule4.getType() + " possède une vitesse de " + vehicule4.getVitesse() + " km/h");

        System.out.println(vehicule1.plusRapide(vehicule2));
    }
}
