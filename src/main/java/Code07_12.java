class Rabbit2{
    private String shape;
    private int xPos;
    private int yPos;

    void setPosition(int x, int y) {
        xPos = x;
        yPos = y;
    }
}

public class Code07_12 {
    public static void main(String[] args) {
        Rabbit2 rabbit2 = new Rabbit2();

        rabbit2.setPosition(100,200);
    }
}
