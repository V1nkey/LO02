/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voitureVehiculeToussa;

/**
 *
 * @author v1nkey
 */
public class Voiture extends Vehicule implements Pilotable, Orientable {
    public Voiture()
    {
        super(4);
    }
    
    public void rouler(int km)
    {
        System.out.println("Je suis une voiture et j'avance de " + km + " km");
    }

    @Override
    public void accelerer() {
        System.out.println("Vroum vroum j'accélère");
    }

    @Override
    public void ralentir() {
        System.out.println("Criiiiii je ralentis");
    }

    @Override
    public void tournerAGauche() {
        System.out.println("A gauche");
    }

    @Override
    public void tournerADroite() {
        System.out.println("A droite");
    }
    
    public class Moteur
    {
        private int nbToursMax;

        public Moteur(int nbToursMax) { this.nbToursMax = nbToursMax; }
    }
}
