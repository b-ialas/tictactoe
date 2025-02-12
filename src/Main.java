public class Main
{
    public static void main(String[] args)
    {
        Board board = new Board();

        Player minP = new Player(Player.PosType.MIN, 'O');
        Player maxP = new Player(Player.PosType.MAX, 'X');

        TicTacToe.Entry(board, minP, maxP);
    }
}