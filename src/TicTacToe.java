import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;

public class TicTacToe
{
    private static void println(String str) { System.out.println(str); }
    private static void print() { System.out.println(); }
    private static void print(String str) { System.out.print(str); }

    public static void Entry(Board board, Player minP, Player maxP)
    {
        Scanner read;
        Random rand = new Random();

        Cell[][] grid = board.getGrid();

        int userInput = 2;

        boolean coin;

        print("Welcome to TicTacToe!\nHeads (1) or Tails (0) to play first?");

        read = new Scanner(System.in);

        do
        {
            try
            {
                userInput = read.nextInt();
            }
            catch (InputMismatchException e)
            {
                println("Invalid input... Heads (1) or Tails (0) to play first?");
                read.nextLine();
                continue;
            }

            coin = rand.nextBoolean();

            print("It is " + (coin ? "heads" : "tails") + " ... ");
            switch (userInput)
            {
                case 0:
                    print("you're playing ");
                    if (!coin)
                    {
                        println(minP.getChar() + "...\n");
                        Game(minP, maxP, grid, true);
                    }
                    else
                    {
                        println(maxP.getChar() + "...\n");
                        Game(maxP, minP, grid, false);
                    }
                    break;
                case 1:
                    print("you're playing ");
                    if (coin)
                    {
                        print(maxP.getChar() + "...\n");
                        Game(maxP, minP, grid, false);
                    }
                    else
                    {
                        print(minP.getChar() + "...\n");
                        Game(minP, maxP, grid, true);
                    }
                    break;
                default:
                    println("\nInvalid input... Heads (1) or Tails (0) to play first?");
                    break;
            }
        }
        while (userInput != 1 && userInput != 0);

        read.close();
    }

    ///////////////////////////////////////////////////////////////////
    //																 //
    // Below is code containing the MINIMAX algorithm for both cases //
    // when the agent player is the maximizing player and the 		 //
    // minimizing player. Below code also handles logic for player 	 //
    // turns respective to who is the maximizing player (X). 		 //
    //																 //
    ///////////////////////////////////////////////////////////////////

    private static int minPScore;
    private static int maxPScore;

    private static int turnN;


    private static boolean isWinner;

    private static void Game(Player userP, Player agentP, Cell[][] grid, boolean isMax)
    {
        if (isMax)
        {

        }


    }
}