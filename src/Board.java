public class Board
{
    private static final int SIZE = 3;

    private final Cell[][] grid;

    public Cell[][] getGrid() { return grid; }

    public Board()
    {
        grid = new Cell[SIZE][SIZE];
        GridReset(grid);
    }

    private static void print(String str) { System.out.print(str); }
    private static void print() { System.out.println(); }

    @Override
    public static int[][] GetCoordinate(int cell)
    {
        int[][] coordinate = new int[1][2];

        int row = (cell - 1) / 3;
        int col = (cell - 1) % 3;

        coordinate[0][0] = row;
        coordinate[0][1] = col;

        return coordinate;
    }

    @Override
    public static void GridDisplay(Cell[][] grid)
    {
        for (int row = 0; row < SIZE; row++)
        {
            for (int col = 0; col < SIZE; col++)
            {
                print(grid[row][col].getChar() + " ");
            }
            print();
        }
        print();
    }

    private static void GridReset(Cell[][] grid) {
        for (int row = 0; row < SIZE; row++)
        {
            for (int col = 0; col < SIZE; col++)
            {
                grid[row][col] = new Cell();

                grid[row][col].setState(Player.PosType.EMPTY);
                grid[row][col].setChar('-');
            }
        }
    }

    public static Cell[][] GridUpdate(Player player, Cell[][] grid, int row, int col)
    {
        if (player.getType() == Player.PosType.MIN)
        {
            grid[row][col].setState(player.getType());
            grid[row][col].setChar(player.getChar());
        }

        if (player.getType() == Player.PosType.MAX)
        {
            grid[row][col].setState(player.getType());
            grid[row][col].setChar(player.getChar());
        }

        grid[row][col].setChar(player.getChar());

        return grid;
    }

    public static boolean IsWinner(Cell[][] grid, Player player)
    {
        Player.PosType type = player.getType();

        boolean isWin = true;

        // check row
        for (int row = 0; row < SIZE; row++)
        {
            isWin = true;
            for (int col = 0; col < SIZE; col++)
            {
                if (grid[row][col].getState() != type)
                {
                    isWin = false;
                    break;
                }
            }
            if (isWin) { return isWin; }
        }

        isWin = true;

        // check column
        for (int col = 0; col < SIZE; col++)
        {
            isWin = true;
            for (int row = 0; row < SIZE; row++)
            {
                if (grid[row][col].getState() != type)
                {
                    isWin = false;
                    break;
                }
            }
            if (isWin) { return isWin; }
        }

        isWin = true;

        // check diagonal
        for (int i = 0; i < SIZE; i++)
        {
            if (grid[i][i].getState() != type)
            {
                isWin = false;
                break;
            }
        }

        if (isWin) { return isWin; }
        isWin = true;

        for (int i = 0; i < SIZE; i++)
        {
            if (grid[i][SIZE - 1 - i].getState() != type)
            {
                isWin = false;
                break;
            }
        }

        return isWin;
    }

    public static boolean IsValidMove(Cell[][] grid, int row, int col)
    {
        return (grid[row][col].getState() == Player.PosType.EMPTY);
    }
}
