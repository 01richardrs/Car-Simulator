import java.awt.*;

public class Vehicle {
    int x;
    int y;
    int speed;
    int width;
    int height;
    int position=0;

    public Vehicle(int x,int y) {
        this.x=x;
        this.y=y;
    }
    public void paintMe(Graphics g) {
    }

    public void setPosition(int p) {
        this.position=p;
    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }

    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }

}
