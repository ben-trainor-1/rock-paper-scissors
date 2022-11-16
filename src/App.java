import java.util.Scanner;
public class App {

    public static void main(String[] args) throws Exception {

        // Intro text
        System.out.println(
                            "Welcome to the " + Colors.ANSI_PURPLE + "Rock-Paper-Scissors Dojo." + Colors.ANSI_RESET
                            + Colors.ANSI_CYAN
                            + "\n0: Rock"
                            + "\n1: Paper"
                            + "\n2: Scissors"
                            + Colors.ANSI_RESET
                            );

        space(1);
        Thread.sleep(750);
        
        Scanner in = new Scanner(System.in);
        String playerOneChoice, playerTwoChoice;

        // Game loop
        do {

            System.out.println("Would you like to play a game?");
            space(1);
            
            if (in.nextLine().equals("yes")) {

                space(1);

                // Choose rock paper or scissors and store in integers
                System.out.println(Colors.ANSI_YELLOW + "Player 1" + Colors.ANSI_RESET + ", what do you choose?");
                playerOneChoice = in.nextLine();
                System.out.println(Colors.ANSI_PURPLE + "Excellent." + Colors.ANSI_RESET);
                Thread.sleep(750);
                space(1);
    
                System.out.println(Colors.ANSI_YELLOW + "Player 2" + Colors.ANSI_RESET + ", what do you choose?");
                playerTwoChoice = in.nextLine();
                System.out.println(Colors.ANSI_PURPLE + "Excellent." + Colors.ANSI_RESET);
                Thread.sleep(750);
                space(1);
    
                // Count down, reveal choices
                System.out.print("Rock, ");
                Thread.sleep(500);
                System.out.print("paper, ");
                Thread.sleep(500);
                System.out.print("scissors, ");
                Thread.sleep(500);
                System.out.print(Colors.ANSI_RED + "shoot!" + Colors.ANSI_RESET);
                Thread.sleep(1000);
                space(2);
    
                System.out.println("Player 1 chose " + playerOneChoice);
                space(1);
                System.out.println("Player 2 chose " + playerTwoChoice);
                space(1);
                
                // Identify the winner!
                Thread.sleep(1000);
                rpsCompareString(playerOneChoice, playerTwoChoice);

            }

            else {
                System.out.println("See you later!");
                break;
            }

        } while (true);


        in.close();

    }

    public static void rpsGameLoop() {
        
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

    // Compare choices of players using integers
    public static void rpsCompareInt(int playerOneChoice, int playerTwoChoice) {
        
        // Draw
        if (playerOneChoice == playerTwoChoice) {

        }
        // Player 1 wins
        else if (
                (playerOneChoice == 0 && playerTwoChoice == 2) ||
                (playerOneChoice == 1 && playerTwoChoice == 0) ||
                (playerOneChoice == 2 && playerTwoChoice == 1)
        ) {
            System.out.println(Colors.ANSI_GREEN + "Player 1 wins!" + Colors.ANSI_RESET);
        }
        // Player 2 wins
        else if (
                (playerTwoChoice == 0 && playerOneChoice == 2) ||
                (playerTwoChoice == 1 && playerOneChoice == 0) ||
                (playerTwoChoice == 2 && playerOneChoice == 1)
        ) {
            System.out.println(Colors.ANSI_GREEN + "Player 2 wins!" + Colors.ANSI_RESET);
        }
        
    }

    // Compare choices of players using Strings
    public static void rpsCompareString(String playerOneChoice, String playerTwoChoice) {
        
        // Draw
        if (playerOneChoice == playerTwoChoice) {

        }
        // Player 1 wins
        else if (
                (playerOneChoice.equals("rock") && playerTwoChoice.equals("scissors")) ||
                (playerOneChoice.equals("paper") && playerTwoChoice.equals("rock")) ||
                (playerOneChoice.equals("scissors") && playerTwoChoice.equals("paper"))
        ) {
            System.out.println(Colors.ANSI_GREEN + "Player 1 wins!" + Colors.ANSI_RESET);
        }
        // Player 2 wins
        else if (
                (playerTwoChoice.equals("rock") && playerOneChoice.equals("scissors")) ||
                (playerTwoChoice.equals("paper") && playerOneChoice.equals("rock")) ||
                (playerTwoChoice.equals("scissors") && playerOneChoice.equals("paper"))
        ) {
            System.out.println(Colors.ANSI_GREEN + "Player 2 wins!" + Colors.ANSI_RESET);
        }
        
    }


    public static void space(int numSpaces) {
        for (int i = numSpaces; i > 0; i--) {
            System.out.print("\n");
        }
    }

}
