/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gallagherproject01;

import static gallagherproject01.GallagherProject01.printCard;

/**
 *
 * @author s581142
 */
public class Leach {
     //Problem 2-----------------------------------------------------------------
    public static String draw(String[] deck, int index) {
        String rank;
        //Switch Structure to assign A-10 to proper index
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
        //Switch structure to assign face values to proper index
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
            }}
        //Format the card and assign used when a card is used
        String card = rank + " of " + deck[index];
        deck[index] = "used";
        return card;
          }
    
    
     //Problem 4-----------------------------------------------------------------
    public static void printDeck(String[] deck) {
    // print the deck 
    for (int i = 0; i < deck.length; i++) {
      printCard(deck, i);
        System.out.println();
    }}
    
}
