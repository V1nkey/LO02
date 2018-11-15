/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author v1nkey
 */
public class Player {
    private String name;
    private Queue<Carte> hand;
    
    public Player(String name)
    {
        this.name = name;
        hand = new LinkedList();
    }

    public Queue<Carte> getHand() { return hand; }
    
    @Override
    public String toString() { return name; }
}
