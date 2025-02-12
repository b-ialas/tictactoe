public class Cell
{
    private Player.PosType STATE_CELL;
    private int TURN_N;

    private char CHAR_CELL;

    public Cell() {
        this.STATE_CELL = Player.PosType.EMPTY;
        this.TURN_N = 0;
    }

    public Player.PosType getState() { return STATE_CELL; }
    public void setState(Player.PosType newState) { this.STATE_CELL = newState; }

    public int getTurnN() { return TURN_N; }
    public void setTurnN(int newTurnN) { this.TURN_N = newTurnN; }

    public char getChar() { return CHAR_CELL; }
    public void setChar(char newChar) { this.CHAR_CELL = newChar; }
}