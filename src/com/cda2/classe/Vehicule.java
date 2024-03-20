package com.cda2.classe;

public class Vehicule {

    //attributs
    private String type;
    private int nbrRoues;
    private int vitesse;

    //constructeurs
    public Vehicule() {
    }

    public Vehicule(String type, int nbrRoues, int vitesse) {
        this.type = type;
        this.nbrRoues = nbrRoues;
        this.vitesse = vitesse;
    }

    //getter et setters
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNbrRoues() {
        return nbrRoues;
    }

    public void setNbrRoues(int nbrRoues) {
        this.nbrRoues = nbrRoues;
    }

    public int getVitesse() {
        return vitesse;
    }

    public void setVitesse(int vitesse) {
        this.vitesse = vitesse;
    }

    //méthodes

    public void boost(){
        this.vitesse += 50;
    }
    public String detect(){
        if (this.nbrRoues == 2){
            return "C'est une moto";
        } else if (this.nbrRoues == 4){
            return "C'est une voiture";
        } else {
            return "C'est un autre type de véhicule";
        }
    }

    public String plusRapide(Vehicule vehicule){
        if (this.vitesse > vehicule.vitesse){
            return "Le véhicule le plus rapide est le véhicule " + this.type + " avec une vitesse de " + this.vitesse + " km/h";
        } else if (this.vitesse < vehicule.vitesse){
            return "Le véhicule le plus rapide est le véhicule " + vehicule.type + " avec une vitesse de " + vehicule.vitesse + " km/h";
        } else {
            return "Les deux véhicules ont la même vitesse";
        }
    }
}
