public class Move<P, G> {
    private P player;
    private G grid;
    private int x;
    private int y;

    public Move(P player, G grid, int x, int y) {
        this.player = player;
        this.grid = grid;
        this.x = x;
        this.y = y;
    }
}