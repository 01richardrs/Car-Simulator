import java.awt.*;

public class Car extends Vehicle {

    public Car(int posX, int posY){
        super(posX,posY);
        width = 100;
        height=50;
    }
    public void paintMe(Graphics g){
        g.setColor(Color.RED);
        g.fillRect(positionX,positionY,width,height);
        g.setColor(Color.black);
        g.setFont(g.getFont().deriveFont(30f));
        g.drawString("Lambo",positionX+5,positionY+30);//x and then y
    }

}
