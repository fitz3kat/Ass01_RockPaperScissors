import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String playerA = "";
        String playerB = "";
        String playerATryAgain = "y";
        String playerBTryAgain = "y";
        String playAgain = "y";
        Scanner in = new Scanner(System.in);

        do
        {
            do
            {
                System.out.println("Player A, what is your move? [r, p, s]: ");
                playerA = in.next();

                if(playerA.equalsIgnoreCase("r") || playerA.equalsIgnoreCase("p") ||  playerA.equalsIgnoreCase("s") )
                {
                    playerATryAgain = "n";
                }

                else
                {
                    System.out.println("You entered an incorrect input. Please try again.");
                }

            }while(!playerATryAgain.equalsIgnoreCase("n"));

            do
            {
                System.out.println("Player B, what is your move? [r, p, s]: ");
                playerB = in.next();

                if(playerB.equalsIgnoreCase("r") || playerB.equalsIgnoreCase("p") ||  playerB.equalsIgnoreCase("s") )
                {
                    playerBTryAgain = "n";
                }

                else
                {
                    System.out.println("You entered an incorrect input. Please try again.");
                }

            }while(!playerBTryAgain.equalsIgnoreCase("n"));

            if(playerA.equalsIgnoreCase("r"))
            {
                if(playerB.equalsIgnoreCase("r"))
                {
                    System.out.println("You both played rock! It's a tie!");
                }
                if(playerB.equalsIgnoreCase("p"))
                {
                    System.out.println("Paper covers rock, Player B wins!");

                }
                else
                {
                    System.out.println("Rock smashes scissors, Player A wins!");

                }
            }
            if(playerA.equalsIgnoreCase("p"))
            {
                if(playerB.equalsIgnoreCase("r"))
                {
                    System.out.println("Paper covers rock, Player A wins!");

                }
                if(playerB.equalsIgnoreCase("p"))
                {
                    System.out.println("You both played paper, it's a tie!");

                }
                else
                {
                    System.out.println("Scissors cuts paper, Player B wins!");

                }
            }

            if(playerA.equalsIgnoreCase("s"))
            {
                if(playerB.equalsIgnoreCase("r"))
                {
                    System.out.println("Rock smashes scissors, Player B wins!");

                }
                if(playerB.equalsIgnoreCase("p"))
                {
                    System.out.println("Scissors cuts paper, Player A wins!");

                }
                else
                {
                    System.out.println("You both played scissors, it's a tie!");

                }
            }
            System.out.println("Do you want to play again? [Y, N]: ");
            playAgain = in.next();
            playerATryAgain = "y";
            playerBTryAgain = "y";


        }while(!playAgain.equalsIgnoreCase("n"));



    }
}
