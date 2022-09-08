import java.util.Random;

public class SimpleBattleShipGame {
	
	public static void main(String args[]) {
	    int numOfGuesses = 0;
	
	    SimpleBattleShip ship = new SimpleBattleShip();
	
	
	    Random rand = new Random();
	    int coord1 = rand.nextInt(5);
	    int[] coordinates = {coord1, coord1+1, coord1+2};
	    ship.setPosition(coordinates);
	    
	    boolean isAlive = true;
	    String result = "";
	    
	    GameHelper x = new GameHelper();
	    
	    while(isAlive){
	       int userGuess = x.getInput("Enter a number");
	        result = ship.updateStatus(userGuess);
	        System.out.println(result);
	        numOfGuesses ++;
	        if(result.equals("kill")) {
	            isAlive = false;
	            System.out.println("You took " + numOfGuesses + " guesses");
	
	        }
	    }



	}
}
