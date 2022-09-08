import java.util.Arrays;
//defines what a battleship is
public class SimpleBattleShip {

    private int[] shipCoordinates = new int[3] ; //which cells does ship occupies
    private int numOfHits;

    public String updateStatus(int guess){
        for (int i = 0; i<shipCoordinates.length; i++){
            if(guess == shipCoordinates[i]){
                numOfHits +=1;
                if (numOfHits ==3) {
                	return "kill";
                }
                else return "hit";
                
            }
           
        }
        return "miss";
    }

    public void setPosition(int[] coords){
        for (int i = 0; i<coords.length; i++) {
            shipCoordinates[i] = coords[i];
        }
        System.out.println(Arrays.toString(shipCoordinates));  
    }

}

