import java.awt.*;

public class Car extends Vehicle {
    public Car(int posX, int posY){
        super(posX,posY);
        this.setSize(2);
//        this.setName(Car_name);
//        this.setColour(Car_colour);
        this.setRoad(0);
        this.setVehicle_state(false);
        this.setVisible(false);
    }
    public void paintMe(Graphics g){
        g.setColor(Color.RED);
        g.fillRect(positionX,positionY,200,100);
        g.setColor(Color.black);
        g.setFont(g.getFont().deriveFont(30f));
        g.drawString("MAKLO",50,70);//x and then y
    }

}
