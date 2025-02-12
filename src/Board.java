public class Board
{
    // board size
    private static final int SIZE = 3;

    public int getSize() { return SIZE; }

    private Cell[][] grid;

    public Cell[][] getGrid() { return grid; }
    public void setGrid(Cell[][] newGrid) { this.grid = newGrid; }

    public Board()
    {
        grid = new Cell[SIZE][SIZE];
        GridReset(grid);
    }

    private static void print(String str) { System.out.print(str); }
    private static void print() { System.out.println(); }

    public static void DisplayGrid(Cell[][] grid)
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
            grid[row][col].setState(Player.PosType.EMPTY);
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

    public static boolean IsValidMove(Cell[][] grid, int row, int col)
    {
        return (grid[row][col].getState() == Player.PosType.EMPTY);
    }
}