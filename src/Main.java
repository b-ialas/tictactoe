public class Main
{
    public static void main(String[] args)
    {
        Player minP = new Player(Player.PosType.MIN, 'O');
        Player maxP = new Player(Player.PosType.MAX, 'X');

        TicTacToe.Entry(minP, maxP);
    }
}