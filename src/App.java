import java.util.Scanner;
public class App {

    public static void main(String[] args) throws Exception {

        // Choose rock paper or scissors and store in integers
        Scanner in = new Scanner(System.in);
        int playerOneChoice, playerTwoChoice;

        System.out.println("Player 1, what do you choose?");
        playerOneChoice = in.nextInt();
        System.out.println("Excellent.");
        Thread.sleep(750);

        System.out.println("Player 2, what do you choose?");
        playerTwoChoice = in.nextInt();
        System.out.println("Excellent.");
        Thread.sleep(750);

        // TODO: Count down, reveal choices
        System.out.print("Rock, ");
        Thread.sleep(500);
        System.out.print("paper, ");
        Thread.sleep(500);
        System.out.print("scissors, ");
        Thread.sleep(500);
        System.out.print("shoot!");
        Thread.sleep(1000);
        System.out.println();

        System.out.print("Player one chose " + compareRPS(playerOneChoice));
        System.out.print("Player one chose " + compareRPS(playerTwoChoice));

        // TODO: Identify the winner!

        in.close();

    }

    public static String compareRPS(int rpsChoice) {

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

}
