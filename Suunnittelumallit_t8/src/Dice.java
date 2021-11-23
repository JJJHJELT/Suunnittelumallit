import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

class Dice extends Game {
 
     /* Implementation of necessary concrete methods */
	 Scanner s = new Scanner(System.in);
	 HashMap<Integer, Integer> playerNames = new HashMap<>();
	 int player = 0;
	 int throwCount = 0;

	 public Dice() {
		
	 }
 
     void initializeGame() {   
    	 System.out.println("Heitetään noppaa!");
     }
 
     void makePlay(int player) {
    	 this.player = player;
    	 int dice=(int)(Math.random()*6) + 1;
    	 playerNames.put(player, dice);
    	 throwCount++;
    	 System.out.println("Pelaajan " + player + " nopan silmäluku on " + dice);
     }
 
     boolean endOfGame() { 
    	 if (throwCount > 3) {
    		 return true;
    	 }
		return false;
     }
 
     void printWinner() {

    	 Entry<Integer,Integer> maxEntry = null;

    	 for(Entry<Integer,Integer> entry : playerNames.entrySet()) {
    	     if (maxEntry == null || entry.getValue() > maxEntry.getValue()) {
    	         maxEntry = entry;
    	     }
    	 }
    	 System.out.println("Pelaaja " + maxEntry.getKey() + " sai isoimman silmäluvun: " + maxEntry.getValue());
     }
 }
