/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.Collections;
import java.util.List;

/**
 *
 * @author v1nkey
 */
public class Deck {
    private List<Carte> cards;
    
    public Deck()
    {
        for (int i = 0; i < 4; i++)
            for (int j = 0; i < 8; j++)
                cards.add(new Carte(j, i));
    }
    
    public void shuffle() { Collections.shuffle(cards); }
    
    public void deal(List<Player> players)
    {
        for (int i = 0; i < cards.size(); i++)
            players.get(i%2).getHand().add(cards.get(i));
    }
}
