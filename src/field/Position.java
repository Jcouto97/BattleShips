package field;

public class Position {
    private int x, y;

    public Position(int x, int y) { //cabeça do barco
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}