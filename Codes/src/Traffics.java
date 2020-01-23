import java.awt.*;

public class Traffics {
    int x =0 , y =0;
    boolean red =false;
    boolean green =false;

    public Traffics (int x,int y,boolean Red,boolean Green){
        this.x = x;
        this.y= y;
        this.red = Red;
        this.green = Green;
    }
    public void setStatus(boolean Red,boolean Green) {
        this.red=Red;
        this.green=Green;
    }
    public void paintMe(Graphics g){
        g.setColor(Color.BLACK);
        g.fillRect(x, y, 10, 40);

        if(this.red==true) {
            g.setColor(Color.RED);
            g.fillOval(x+1, y+10, 8, 8);

        }
        else {
            g.setColor(Color.GREEN);
            g.fillOval(x+1, y+10, 8, 8);}

        }
}
