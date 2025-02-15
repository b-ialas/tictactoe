public class Cell
{
    private Player.PosType STATE_CELL;

    private char CHAR_CELL;

    public Cell()
    {
        this.STATE_CELL = Player.PosType.EMPTY;
    }

    public Player.PosType getState() { return STATE_CELL; }
    public void setState(Player.PosType newState) { this.STATE_CELL = newState; }

    public char getChar() { return CHAR_CELL; }
    public void setChar(char newChar) { this.CHAR_CELL = newChar; }
}