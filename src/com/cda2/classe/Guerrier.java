package com.cda2.classe;

public class Guerrier extends Personnage {

    //Attributs
    private int bonusDefense;

    //Constructeurs

    public Guerrier(String nom, int vie, int attaque, int defense, int bonusDefense) {
        super(nom, vie, attaque, defense);
        this.bonusDefense = bonusDefense;
    }

    //Getter et setters

    public int getBonusDefense() {
        return bonusDefense;
    }

    public void setBonusDefense(int bonusDefense) {
        this.bonusDefense = bonusDefense;
    }

    //Méthodes
    public void attaquer(Personnage cible) {
        // 5% de chance de regen vie
        double randomNumber = Math.random();
        int scaledNumber = (int) (randomNumber * 100) + 1;
        if (scaledNumber <= 5) {
            this.setVie(this.getVie() + this.bonusDefense);
        }
        int degats = this.getAttaque() - cible.getDefense();
        if (degats < 0) {
            degats = 0;
        }
        cible.setVie(cible.getVie() - degats);
    }
}
