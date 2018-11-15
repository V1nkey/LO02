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
public class Train extends Vehicule implements Pilotable {
    public Train()
    {
        super(200);
    }
    
    public void rouler(int km)
    {
        System.out.println("Je suis un train et j'avance de " + km + " km");
    }

    @Override
    public void accelerer() {
        System.out.println("Tchou tchou j'accélère");
    }

    @Override
    public void ralentir() {
        System.out.println("Tchktchktchk je ralentis");
    }
}
