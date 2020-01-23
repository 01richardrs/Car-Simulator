import java.awt.*;

public class Bus extends Vehicle{
    public Bus(int x, int y) {
        super(x, y);
        width=0;// less bigger 3times than car
        height=0;
        speed=0;//set later based on GUI Size
    }

    public void paintMe(Graphics g) {
        g.setColor(Color.RED);
        g.fillRect(x, y, width, height);
    }

}
