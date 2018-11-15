/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author v1nkey
 */
public class Game {
    private List<Player> players;
    private Deck deck;
    private List<Carte> board;
    
    public Game() 
    {
        players = new ArrayList();
        deck = new Deck();
        board = new ArrayList();
    }
    
    public void initGame()
    {
        players.add(new Player("Bot 1"));
        players.add(new Player("Bot 2"));
        
        deck.shuffle();
        deck.deal(players);
    }
    
    public void play()
    {
        do
        {
            board.add(players.get(0).getHand().poll());
            board.add(players.get(1).getHand().poll());
            
            showBoard();

            int lastCardIndexP1 = board.size()-2;
            int lastCardIndexP2 = board.size()-1;

            if (board.get(lastCardIndexP1).getValeur().ordinal() > board.get(lastCardIndexP2).getValeur().ordinal())
                players.get(0).getHand().addAll(board);
            else
                players.get(1).getHand().addAll(board);
            
        } while (!players.get(0).getHand().isEmpty() && !players.get(1).getHand().isEmpty());
    }
    
    public void showBoard()
    {
        StringBuffer sb = new StringBuffer();
        int i = 0;
        for (Carte c : board)
        {
            if (i%4 == 3 || i%4 == 0)
                sb.append("Carte cachée");
            else
                sb.append(c);
            
            sb.append("\t");
            
            if (i%2 == 1)
                sb.append("\n");
        }
    }
    
}
