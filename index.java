
import java.util.Random;
import java.util.Scanner;

class Game{
    public int number;
    public int inputNumber;
    public int noOfGuesses = 0;

    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }

    Game(){
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }
    boolean takeUserInput(){
        System.out.println("Guess the number");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
        return false;
    }
    boolean isCorrectNumber(){
        noOfGuesses++;
        if (inputNumber==number){
            System.out.format("Yes you guessed it right, it was %d\nYou guessed it in %d attempts", number, noOfGuesses);
            return true;
        }
        else if(inputNumber<number){
            System.out.println("Too low...");
        }
        else if(inputNumber>number){
            System.out.println("Too high...");
        }
        return false;
    }

    public boolean isCorrectGuess() {
        return false;
    }

}
public class index{
    public static void main(String[] args) {
    System.out.println("1. Start the Game \n2. Exit");
    System.out.print("Enter your choice : ");
    int choice = takeIntegerInput(2);
    int nextRound = 1;
    int noOfRound = 0;
    
    if ( choice == 1 ) {
        
        // to check next round is there or not
        while ( nextRound == 1 ) {
            // creating object of Game class
            Game game = new Game();
            boolean isMatched = false;
            boolean isLimitCross = false;
            System.out.println("\nRound " + ++noOfRound + " starts...");
            
            // to check correct guess and limit cross
            while ( !isMatched && !isLimitCross) {
                isLimitCross = game.takeUserInput();
                isMatched = game.isCorrectGuess();
            }
            // input for next round
            System.out.println("1. Next Round \n2. Exit");
            System.out.println("Enter your choice : ");
            nextRound = takeIntegerInput(2);
            if ( nextRound != 1 ) {
                System.exit(0);
            }
        }
    }
    else {
        System.exit(0);
    }
    
}

    private static int takeIntegerInput(int i) {
        return 0;
    }
}
