import java.awt.*;

public class Vehicle {
    int positionX;
    int positionY;
    int width;
    int height;
    final int Speed = 1;

    private boolean  Vehicle_state;
    private int Road;

    private String colour;
    private String Name;
    //private direction;

    public Vehicle(int posX, int posY) {
        this.positionX = posX;
        this.positionY = posY;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    public void paintMe(Graphics g){
    }


}
