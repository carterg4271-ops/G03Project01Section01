/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gallagherproject01;
//Import Random
import java.util.Random;

/**
 *
 * @author s581142
 */
public class GallagherProject01 {
    //Problem 1-----------------------------------------------------------------
    public static String[] newDeck(){
        String[] deck = new String[52];
        for(int i=0; i<=9; i++){
         deck[i]= "Clubs";    
         }
        for(int i=40; i<=42; i++){
         deck[i]= "Clubs";    
         }
        for(int i=10; i<=19; i++){
         deck[i]= "Diamonds";    
         }
        for(int i=43; i<=45; i++){
         deck[i]= "Diamonds";    
         }
        for(int i=20; i<=29; i++){
         deck[i]= "Hearts"; 
         }
        for(int i=46; i<=48; i++){
         deck[i]= "Hearts";    
         }
        for(int i=30; i<=39; i++){
         deck[i]= "Spades";  
         }
        for(int i=49; i<=51; i++){
         deck[i]= "Spades";    
         }
        return deck;
    }
    
    //Problem 2-----------------------------------------------------------------
    
    public static String draw(String[] deck, int index) {
        String rank;

        if (index < 40) {
            switch (index % 10) {
                case 0:
                    rank = "A";
                    break;
                case 1:
                    rank = "2";
                    break;
                case 2:
                    rank = "3";
                    break;
                case 3:
                    rank = "4";
                    break;
                case 4:
                    rank = "5";
                    break;
                case 5:
                    rank = "6";
                    break;
                case 6:
                    rank = "7";
                    break;
                case 7:
                    rank = "8";
                    break;
                case 8:
                    rank = "9";
                    break;
                default:
                    rank = "10";
                    break;
            }
        } else {
            switch ((index - 40) % 3) {
                case 0:
                    rank = "J";
                    break;
                case 1:
                    rank = "Q";
                    break;
                default:
                    rank = "K";
                    break;
            }
    }

        String card = rank + " of " + deck[index];
        deck[index] = "used";
        return card;
          }
    
    //Problem 3-----------------------------------------------------------------
    
    public static void printCard (String[] deck, int index){
        String card = draw(deck, index);
        System.out.println(card);
    }
    
    //Problem 4-----------------------------------------------------------------
    
    public static void printDeck(String[] deck) {
    for (int i = 0; i < deck.length; i++) {
        String suit = deck[i];

        printCard(deck, i);

        deck[i] = suit;
    }
}
    //Problem 5-----------------------------------------------------------------
    
    public static int deal(String[] deck){
        Random rand = new Random();
        int notUsed = 0;
        int index  = rand.nextInt(52);
        
        do{
            if(deck[index].equals("used")){
               index  = rand.nextInt(52); 
            }
            else{
               notUsed = 1;
            }
           
        }while (notUsed != 1);
        
        return index;
    }
    
    

    
    
    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
                

    }
    
}
