import java.awt.*;

public class Motor extends Vehicle{

    public Motor(int posX, int posY){
        super(posX,posY);
        width = 80;
        height=30;
    }
    public void paintMe(Graphics g){
        g.setColor(Color.ORANGE);
        g.fillRect(positionX,positionY,width,height);
        g.setColor(Color.black);
        g.setFont(g.getFont().deriveFont(18f));
        g.drawString("NINJA",positionX+5,positionY+25);//x and then y
    }
}
