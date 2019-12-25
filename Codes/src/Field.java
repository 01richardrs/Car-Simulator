import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

import static javax.swing.UIManager.get;

public class Field extends JPanel {

    ArrayList<Vehicle> TESTING = new ArrayList<Vehicle>();

    public Field(){
        super();
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.green);
        g.fillRect(1 ,0,this.getWidth(),this.getHeight());
        g.setColor(Color.BLACK);
        for(int a=150;a<600 ;a = a+150){//lane
            for(int b=0; b<getWidth();b =b+35){//line
                g.fillRect(b,a,30,5);
            }
        }
        for(int a=0;a< TESTING.size();a++){
            TESTING.get(a).paintMe(g);
        }
    }

    public void addCar(Vehicle v){
        TESTING.add(v);
    }

}
