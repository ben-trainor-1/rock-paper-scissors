import java.util.Scanner;
public class App {

    public static void main(String[] args) throws Exception {

        // Choose rock paper or scissors and store in integers
        Scanner in = new Scanner(System.in);
        int playerOneChoice, playerTwoChoice;

        // Intro text
        System.out.println(
                            "Welcome to the Rock-Paper-Scissors Dojo."
                            + "\n0: Rock"
                            + "\n1: Paper"
                            + "\n2: Scissors"
                            );

        space(1);

        // Prompt for input
        System.out.println("Player 1, what do you choose?");
        playerOneChoice = in.nextInt();
        System.out.println("Excellent.");
        Thread.sleep(750);
        space(1);

        System.out.println("Player 2, what do you choose?");
        playerTwoChoice = in.nextInt();
        System.out.println("Excellent.");
        Thread.sleep(750);
        space(1);

        // Count down, reveal choices
        System.out.print("Rock, ");
        Thread.sleep(500);
        System.out.print("paper, ");
        Thread.sleep(500);
        System.out.print("scissors, ");
        Thread.sleep(500);
        System.out.print("shoot!");
        Thread.sleep(1000);
        space(2);

        System.out.println("Player one chose " + rpsString(playerOneChoice));
        space(1);
        System.out.println("Player two chose " + rpsString(playerTwoChoice));
        space(1);
        
        // Identify the winner!
        Thread.sleep(1000);
        rpsCompare(playerOneChoice, playerTwoChoice);


        in.close();

    }

    public static String rpsString(int rpsChoice) {

        switch (rpsChoice) {
            case 0: 
                return "rock";
            case 1: 
                return "paper";
            case 2: 
                return "scissors";
            default: 
                return null;
        }
    }

    public static void rpsCompare(int playerOneChoice, int playerTwoChoice) {
        
        // Draw
        if (playerOneChoice == playerTwoChoice) {

        }
        // Player 1 wins
        else if (
                (playerOneChoice == 0 && playerTwoChoice == 2) ||
                (playerOneChoice == 1 && playerTwoChoice == 1) ||
                (playerOneChoice == 2 && playerTwoChoice == 0)
        ) {
            System.out.println("Player one wins!");
        }
        // Player 2 wins
        else if (
                (playerTwoChoice == 0 && playerOneChoice == 2) ||
                (playerTwoChoice == 1 && playerOneChoice == 1) ||
                (playerTwoChoice == 2 && playerOneChoice == 0)
        ) {
            System.out.println("Player two wins!");
        }
        
    }

    public static void space(int numSpaces) {
        for (int i = numSpaces; i > 0; i--) {
            System.out.print("\n");
        }
    }

}
