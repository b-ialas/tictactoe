public class Player
{
    public enum PosType { EMPTY, MIN, MAX }

    private PosType TYPE;
    private int SCORE;

    private char CHAR;

    public PosType getType() { return TYPE; }
    public void setType(PosType newType) { this.TYPE = newType; }

    public int getScore() { return SCORE; }
    public void setScore(int newScore) { this.SCORE = newScore; }


    public char getChar() { return CHAR; }
    public void setChar(char newChar) { this.CHAR = newChar; }

    public Player(PosType type, char character)
    {
        this.TYPE = type;
        this.CHAR = character;
        this.SCORE = 0;
    }
}