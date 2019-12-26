import java.awt.*;

public class Bus extends Vehicle{

    public Bus(int posX, int posY){
        super(posX,posY);
        width = 200;
        height=50;
    }
    public void paintMe(Graphics g){
        g.setColor(Color.BLUE);
        g.fillRect(positionX,positionY,width,height);
        g.setColor(Color.black);
        g.setFont(g.getFont().deriveFont(30f));
        g.drawString("Bus",positionX+5,positionY+30);//x and then y
    }
}
