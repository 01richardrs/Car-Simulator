import java.awt.*;

public class Motor extends Vehicle{
    public Motor(int x, int y) {
        super(x, y);
        width=15;
        height=10;
        speed=20;
    }

    public void paintMe(Graphics g) {
        g.setColor(Color.ORANGE);
        g.fillRect(x, y, width, height);
    }

}
