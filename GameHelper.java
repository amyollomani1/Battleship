//this takes care of user output
import java.util.Scanner;

public class GameHelper {
    public int getInput(String prompt) {
         System.out.print(prompt + ": ");
         Scanner scanner = new Scanner(System.in);
         return scanner.nextInt();
    }
}