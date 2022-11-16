import java.util.Scanner;
public class App {

    public static void main(String[] args) throws Exception {

        // Choose rock paper or scissors and store in integers
        Scanner in = new Scanner(System.in);
        int playerOneChoice, playerTwoChoice;

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

        // Prompt for input
        System.out.println(Colors.ANSI_YELLOW + "Player 1" + Colors.ANSI_RESET + ", what do you choose?");
        playerOneChoice = in.nextInt();
        System.out.println(Colors.ANSI_PURPLE + "Excellent." + Colors.ANSI_RESET);
        Thread.sleep(750);
        space(1);

        System.out.println(Colors.ANSI_YELLOW + "Player 2" + Colors.ANSI_RESET + ", what do you choose?");
        playerTwoChoice = in.nextInt();
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

        System.out.println("Player 1 chose " + rpsString(playerOneChoice));
        space(1);
        System.out.println("Player 2 chose " + rpsString(playerTwoChoice));
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

    public static void space(int numSpaces) {
        for (int i = numSpaces; i > 0; i--) {
            System.out.print("\n");
        }
    }

}
