import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;

public class TicTacToe
{
    private static void println(String str) { System.out.println(str); }
    private static void print() { System.out.println(); }
    private static void print(String str) { System.out.print(str); }

    public static void Entry(Player minP, Player maxP)
    {
        Random rand = new Random();

        int userInput = 2;

        boolean coin;

        print("Welcome to TicTacToe!\nHeads (1) or Tails (0) to play first?");

        Scanner read = new Scanner(System.in);

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
                    if (!coin) // 0, 0 -> max
                    {
                        println(maxP.getChar() + "...\n");
                        Game(maxP, minP, true);
                    }
                    else // 0, 1 -> min
                    {
                        println(minP.getChar() + "...\n");
                        Game(minP, maxP, false);
                    }
                    break;
                case 1:
                    print("you're playing ");
                    if (coin) // 1, 1 -> max
                    {
                        print(maxP.getChar() + "...\n");
                        Game(maxP, minP, true);
                    }
                    else // 1, 0 -> min
                    {
                        print(minP.getChar() + "...\n");
                        Game(minP, maxP, false);
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

    private static Board board = new Board();
    private static Cell[][] grid = board.getGrid();

    private static boolean AgentPlayerTurn(Player agent)
    {
        return false;
    }

    private static boolean UserPlayerTurn(Player player)
    {
        int userInput = -1;
        int[][] coordinate = new int[1][2];

        Scanner read = new Scanner(System.in);

        coordinate[0][0] = userInput;
        coordinate[0][1] = userInput;

        print("Enter your move (1 - 9): ");
        do
        {
            do
            {
                try
                {
                    userInput = read.nextInt();
                    read.nextLine();
                }
                catch (InputMismatchException e)
                {
                    println("Invalid input... You must enter a number between 1 and 9...");
                }
            }
            while (userInput < 1 || userInput > 9);

            coordinate = Board.GetCoordinate(userInput);

            if (!Board.IsValidMove(grid, coordinate[0][0], coordinate[0][1]))
            {
                println("Invalid move... try again...");
                Board.GridDisplay(grid);
            }
        }
        while (!Board.IsValidMove(grid, coordinate[0][0], coordinate[0][1]));

        grid = Board.GridUpdate(player, grid, coordinate[0][0], coordinate[0][1]);

        Board.GridDisplay(grid);

        return Board.IsWinner(grid, player);
    }

    private static void Game(Player userP, Player agentP, boolean isMax)
    {
        boolean isWinner = false;

        if (isMax) { isWinner = UserPlayerTurn(userP); }

        isWinner = AgentPlayerTurn(agentP);

        while (!isWinner)
        {
            isWinner = UserPlayerTurn(userP);
            if (isWinner) { println("You win!");  break; }

            isWinner = AgentPlayerTurn(agentP);
            if (isWinner) { println("Agent player " + agentP.getChar() + " wins..."); break; }
        }
    }
}