import java.awt.*;

public class Vehicle {
    int positionX;
    int positionY;
    int Size;
    private int Speed = 1;
    private boolean  Vehicle_state;
    private int Road;
    private String colour;
    private String Name;
    //private direction;
    private boolean visible;

    public int getSpeed() {
        return Speed;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

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

    public int getSize() {
        return Size;
    }

    public void setSize(int size) {
        Size = size;
    }

    public int getRoad() {
        return Road;
    }

    public void setRoad(int road) {
        Road = road;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public boolean isVehicle_state() {
        return Vehicle_state;
    }

    public void setVehicle_state(boolean vehicle_state) {
        Vehicle_state = vehicle_state;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }
    public void paintMe(Graphics g){

    }
}
