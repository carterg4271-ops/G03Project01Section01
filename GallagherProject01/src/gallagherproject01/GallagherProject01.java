package gallagherproject01;
//Import Random
import static gallagherproject01.Leach.draw;
import static gallagherproject01.Leach.printDeck;
import java.util.Random;
 //@author Carter Gallagher, Cohen Leach
public class GallagherProject01 {
    //Problem 1-----------------------------------------------------------------
    public static String[] newDeck(){
        //Create the array to store the deck
        String[] deck = new String[52];
        //multiple for loops to assign proper values to the deck
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
   
    //Problem 3-----------------------------------------------------------------
    public static void printCard (String[] deck, int index){
        //call draw function to display a card 
        String card = draw(deck, index);
        System.out.print(card);
    }
   
    //Problem 5-----------------------------------------------------------------
    public static int deal(String[] deck){
        Random rand = new Random();
        int notUsed = 0;
        int index  = rand.nextInt(52);
        //do while to find a random unused index
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
        //Main program for sample run
        
        //Create a random object
        Random rand = new Random();
        
        //Call new deck
        String[] deckOne = newDeck();
        
        //Display orignal order of the new deck
        System.out.println("Original Order of Deck: ");
        printDeck(deckOne);
        
        //Refresh deck
        deckOne = newDeck();
        
        //Create an array for card indexes
        int[] cardOrder = new int[52];
        for (int i = 0; i < cardOrder.length; i++) {
            cardOrder[i] = i;
        }

        //Shuffle the indexes
        for (int i = 0; i < cardOrder.length; i++) {
            int index = rand.nextInt(52);

            int temp = cardOrder[i];
            cardOrder[i] = cardOrder[index];
            cardOrder[index] = temp;
        }

        //Display shuffled deck
        System.out.println("\nShuffle 1: ");
        for (int i = 0; i < cardOrder.length; i++) {
            System.out.println(draw(deckOne, cardOrder[i]));
        }
        
         //Refresh deck
        deckOne = newDeck();
        
        //Create an array for card indexes
        cardOrder = new int[52];
        for (int i = 0; i < cardOrder.length; i++) {
            cardOrder[i] = i;
        }

        //Shuffle the indexes
        for (int i = 0; i < cardOrder.length; i++) {
            int index = rand.nextInt(52);

            int temp = cardOrder[i];
            cardOrder[i] = cardOrder[index];
            cardOrder[index] = temp;
        }

        //Display shuffled deck
        System.out.println("\nShuffle 2: ");
        for (int i = 0; i < cardOrder.length; i++) {
            System.out.println(draw(deckOne, cardOrder[i]));
        }
        
         //Refresh deck
        deckOne = newDeck();
        System.out.println("");
        
        //Create an array to represent the hand
        int[] hand = new int[5];
        
        //nested for loop to create a new hand 5 times
        for(int k = 1;k<6;k++){
            System.out.print("Hand "+ k + ": ");
            for(int i = 0;i<hand.length;i++){
                 hand[i] = deal(deckOne);
                printCard(deckOne,hand[i]);
                System.out.print(", ");
                }
            System.out.println();
        }
    } 
}