/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caunogame;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Mon Zin Oo
 */

public class UnoGame {
    int gameId;
    List<Player> lstPlayer = new LinkedList<>();    
    UNOCard c= new UNOCard();
    //UNOCard lstCard;
    String gStatus;
    //Player player;
    Deck d=new Deck();
    
    public void addPlayer(Player p){        
        lstPlayer.add(p);
    }
    
    public void startGame(){        
        gStatus="Game is Starting";
        d.createCard();        
        d.cardShuffle();
        
        for(int i=0; i<7; i++){
            for (Iterator<Player> iterator = lstPlayer.iterator(); iterator.hasNext();) {
                Player p = iterator.next();
                p.lstholdInHand.add(d.takeCardFromDeck());                
            }
        }        
    }
    
    public void throwCard(){        
    }
    
    public void createDeck(){
        Deck d =new Deck();
    }
    
    @Override
    public String toString() {
        return gStatus+"\n"+"Discard Pile "+d.createDiscardPile()+"\n"+"Deck left "+d.getTotalDrawCard()+"\n"+lstPlayer+ '}'+"\n";
    }  
}
