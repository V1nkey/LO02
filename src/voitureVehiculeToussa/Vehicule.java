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
public abstract class Vehicule {
    private int nbPlaces;
    private int capaciteMarchandises;

    public Vehicule(int nbPlaces) 
    {
        this.nbPlaces = nbPlaces;
    }
    
    public abstract void rouler(int km);
}
