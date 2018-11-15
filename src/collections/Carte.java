/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

/**
 *
 * @author v1nkey
 */
public class Carte {

    private Enums.Colors couleur;
    private Enums.Values valeur;

    public Carte (int valeur, int couleur) 
    {
        this.valeur = Enums.Values.values()[valeur];
        this.couleur = Enums.Colors.values()[couleur];
    }

    public Carte (String valeur, String couleur) 
    {   
        this.valeur = Enums.Values.valueOf(valeur.toUpperCase());
        this.couleur = Enums.Colors.valueOf(couleur.toUpperCase());
    }

    public Enums.Colors getCouleur() { return couleur; }

    public Enums.Values getValeur() { return valeur; }

    public String toString() 
    {
        StringBuffer sb = new StringBuffer();
        sb.append(valeur);
        sb.append(" de ");
        sb.append(couleur);
        return sb.toString();
    }
    
    public int hashCode() { return valeur.ordinal() * 10 + couleur.ordinal(); }
    
    public boolean equals(Object o)
    {
        if (o instanceof Carte)
        {
            Carte c = (Carte)o;
            if (valeur == c.getValeur() && couleur == c.getCouleur())
                return true;
        }
        
        return false;
    }
}
