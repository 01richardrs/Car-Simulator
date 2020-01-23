import java.awt.*;

public class Car extends Vehicle{
    public Car(int x, int y) {
        super(x, y);
        width=0;
        height=0;
        speed=0;//set later based on GUI Size
    }

    public void paintMe(Graphics g) {
        g.setColor(Color.YELLOW);
        g.fillRect(x, y, width, height);
    }

}
