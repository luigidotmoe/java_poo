package com.cda2.classe;

public class Assassin extends Personnage {

    //Attributs
    private int bonusAttaque;

    //Constructeurs

    public Assassin(String nom, int vie, int attaque, int defense, int bonusAttaque) {
        super(nom, vie, attaque, defense);
        this.bonusAttaque = bonusAttaque;
    }

    //Getter et setters

    public int getBonusAttaque() {
        return bonusAttaque;
    }

    public void setBonusAttaque(int bonusAttaque) {
        this.bonusAttaque = bonusAttaque;
    }

    //Méthodes
    public void attaquer(Personnage cible) {
        // 5% de chance de CC
        double randomNumber = Math.random();
        int scaledNumber = (int) (randomNumber * 100) + 1;
        int degats = 0;
        if (scaledNumber <= 5) {
            degats = this.getAttaque() + this.bonusAttaque - cible.getDefense();
        } else {
            degats = this.getAttaque() - cible.getDefense();
        }
        if (degats < 0) {
            degats = 0;
        }
        cible.setVie(cible.getVie() - degats);
    }
}
