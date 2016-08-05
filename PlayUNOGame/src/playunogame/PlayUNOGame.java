/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playunogame;

import caunogame.Deck;
import caunogame.Player;
import caunogame.UnoGame;

/**
 *
 * @author Tun Lwin Aung
 */
public class PlayUNOGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        UnoGame ug = new UnoGame();           
        Player p1 = new Player("Tuu Tuu", "a123");
        Player p2 = new Player("Suu Suu", "q125");
        Player p3 = new Player("Phang Phang", "g875");
        Player p4 = new Player("Char Char", "k643");
        Player p5 = new Player("Hua Hua", "j340");
        ug.addPlayer(p1);
        ug.addPlayer(p2);
        ug.addPlayer(p3);
        ug.addPlayer(p4);
        ug.addPlayer(p5);
        ug.createDeck();
ug.startGame();             
        System.out.println(ug);   
    }   
}
