import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        // Declarations
        String playerA;
        String playerB;
        // Initialize scanner for input
        Scanner in = new Scanner(System.in);

        // Prompt for user
        System.out.println("Get Ready to play the RPS game.");

        // Prompt for Player A
        System.out.println("What is your move Player A (R for Rock, P for Paper, S for Scissors)?");
        playerA = in.nextLine();

        // Check if player A's move is valid
        if (!playerA.equalsIgnoreCase("R") && !playerA.equalsIgnoreCase("P") && !playerA.equalsIgnoreCase("S"))
        {
            System.out.println("Error! You entered an invalid move for Player A!");
            System.out.println("Rerun the program to play a new game!");
            System.exit(0);
        }

        // Prompt for Player B
        System.out.println("What is your move Player B (R for Rock, P for Paper, S for Scissors)?");
        playerB = in.nextLine();

        // Check if player B's move is valid
        if (!playerB.equalsIgnoreCase("R") && !playerB.equalsIgnoreCase("P") && !playerB.equalsIgnoreCase("S"))
        {
            System.out.println("Error! You entered an invalid move for Player B!");
            System.out.println("Rerun the program to play a new game!");
            System.exit(0);
        }

        // Determine the winner
        if (playerA.equalsIgnoreCase(playerB))
        {
            System.out.println("It's a Tie!");
        }
        else if (playerA.equalsIgnoreCase("R") && playerB.equalsIgnoreCase("S"))
        {
            System.out.println("Rock breaks Scissors! Player A wins!");
        }
        else if (playerA.equalsIgnoreCase("S") && playerB.equalsIgnoreCase("P"))
        {
            System.out.println("Scissors cut Paper! Player A wins!");
        }
        else if ((playerA.equalsIgnoreCase("P") && playerB.equalsIgnoreCase("R")))
        {
            System.out.println("Paper covers Rock! Player A wins!");
        }
        else
        {
            if (playerB.equalsIgnoreCase("R") && playerA.equalsIgnoreCase("S"))
            {
                System.out.println("Rock breaks Scissors! Player B wins!");
            }
            else if (playerB.equalsIgnoreCase("S") && playerA.equalsIgnoreCase("P"))
            {
                System.out.println("Scissors cut Paper! Player B wins!");
            }
            else if ((playerB.equalsIgnoreCase("P") && playerA.equalsIgnoreCase("R")))
            {
                System.out.println("Paper covers Rock! Player B wins!");
            }
        }
    }
}