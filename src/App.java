import java.util.Scanner;
import java.util.Random;
public class App {

    private static int playerOneWinCount = 0, playerTwoWinCount = 0;

    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        // Intro text
        System.out.println("\nWelcome to the " + Colors.ANSI_PURPLE + "Rock-Paper-Scissors Dojo." + Colors.ANSI_RESET);

        space(1);
        
        // Necessary variables
        String playerOneChoice, playerTwoChoice;
        String play = "yes";
        boolean firstGame = true;

        // Game loop
        do {

            Thread.sleep(750);

            // Print out play a game or play again based on whether it's the first game or not
            if (firstGame) {
                System.out.println(Colors.ANSI_PURPLE + "Would you like to play a game?" + Colors.ANSI_RESET);
            }
            else {
                System.out.println(Colors.ANSI_PURPLE + "Would you like to play again?" + Colors.ANSI_RESET);
            }
            
            // Play if they answer yes
            play = in.nextLine();
            play = play.toLowerCase();

            if (play.equals("yes")) {
                firstGame = false;
                space(1);

                // Choose rock paper or scissors and store in integers
                // Player 1
                System.out.println(Colors.ANSI_YELLOW + "Player 1" + Colors.ANSI_RESET + ", what do you choose?");
                playerOneChoice = rpsChoosing(false);

                Thread.sleep(750);
                System.out.println(Colors.ANSI_PURPLE + "Excellent." + Colors.ANSI_RESET);
                space(1);

                // Player 2
                System.out.println(Colors.ANSI_YELLOW + "Player 2" + Colors.ANSI_RESET + ", what do you choose?");
                playerTwoChoice = rpsChoosing(true);

                Thread.sleep(750);
                System.out.println(Colors.ANSI_PURPLE + "Excellent." + Colors.ANSI_RESET);
                space(1);
                
                Thread.sleep(750);
                
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
    
                System.out.println("Player 1 chose " + Colors.ANSI_CYAN + playerOneChoice + Colors.ANSI_RESET + ".");
                space(1);
                Thread.sleep(750);
                System.out.println("Player 2 chose " + Colors.ANSI_CYAN + playerTwoChoice + Colors.ANSI_RESET + ".");
                space(1);
                
                // Identify the winner!
                Thread.sleep(1000);
                rpsCompareString(playerOneChoice, playerTwoChoice);
                space(1);
                Thread.sleep(750);
                displayWinCount();

                space(1);

            }

            else {
                space(1);
                System.out.println("See you later!");
                space(1);
                break;
            }

        } while (true);

    }

    public static String rpsChoosing(boolean random) {
        String playerChoice;

        // 2 player game, no AI opponent
        if (!random) {
            do {

                playerChoice = in.nextLine().toLowerCase();
    
                if (!playerChoice.equals("rock") 
                    && !playerChoice.equals("paper") 
                    && !playerChoice.equals("scissors")
                ) {
                    System.out.println("Please enter \"rock\", \"paper\", or \"scissors\".");
                }
                else {
                    return playerChoice;
                }
    
            } while (true);
        }

        // 1 player game, AI opponent
        else {
            Random rand = new Random();
            switch (rand.nextInt(3)) {
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
    }

    // public static String rpsString(int rpsChoice) {

    //     switch (rpsChoice) {
    //         case 0: 
    //             return "rock";
    //         case 1: 
    //             return "paper";
    //         case 2: 
    //             return "scissors";
    //         default: 
    //             return null;
    //     }

    // }

    // Compare choices of players using Strings
    public static void rpsCompareString(String playerOneChoice, String playerTwoChoice) {
        
        // Draw
        if (playerOneChoice.equals(playerTwoChoice)) {
            System.out.println(Colors.ANSI_CYAN + "It's a tie!" + Colors.ANSI_RESET);
        }
        // Player 1 wins
        else if (
                (playerOneChoice.equals("rock") && playerTwoChoice.equals("scissors")) ||
                (playerOneChoice.equals("paper") && playerTwoChoice.equals("rock")) ||
                (playerOneChoice.equals("scissors") && playerTwoChoice.equals("paper"))
        ) {
            System.out.println(Colors.ANSI_GREEN + "Player 1 wins!" + Colors.ANSI_RESET);
            playerOneWinCount++;
        }
        // Player 2 wins
        else if (
                (playerTwoChoice.equals("rock") && playerOneChoice.equals("scissors")) ||
                (playerTwoChoice.equals("paper") && playerOneChoice.equals("rock")) ||
                (playerTwoChoice.equals("scissors") && playerOneChoice.equals("paper"))
        ) {
            System.out.println(Colors.ANSI_GREEN + "Player 2 wins!" + Colors.ANSI_RESET);
            playerTwoWinCount++;
        }
        else {
            System.out.println("Something went wrong.");
        }
        
    }

    public static void displayWinCount() {
        System.out.println(Colors.ANSI_YELLOW + "Records" + Colors.ANSI_RESET
                            + Colors.ANSI_CYAN + "\n\nPlayer 1 \n" + Colors.ANSI_RESET
                                + "Wins: " + Colors.ANSI_GREEN + playerOneWinCount + Colors.ANSI_RESET 
                                + "\t\tLosses: " + Colors.ANSI_RED + playerTwoWinCount + Colors.ANSI_RESET
                            + Colors.ANSI_CYAN + "\n\nPlayer 2 \n" + Colors.ANSI_RESET
                                + "Wins: " + Colors.ANSI_GREEN + playerTwoWinCount + Colors.ANSI_RESET 
                                + "\t\tLosses: " + Colors.ANSI_RED + playerOneWinCount + Colors.ANSI_RESET);
    }


    public static void space(int numSpaces) {
        for (int i = numSpaces; i > 0; i--) {
            System.out.print("\n");
        }
    }

}
