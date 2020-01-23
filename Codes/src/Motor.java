import java.awt.*;

public class Motor extends Vehicle{
    public Motor(int x, int y) {
        super(x, y);
        width=0;// less smaller 2times than car
        height=0;
        speed=0;//set later based on GUI Size
    }

    public void paintMe(Graphics g) {
        g.setColor(Color.ORANGE);
        g.fillRect(x, y, width, height);
    }

}
