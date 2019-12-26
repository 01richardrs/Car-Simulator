import javafx.scene.layout.TilePane;

import javax.swing.*;
import java.awt.*;

public class FieldTest {
    Motor moto1 = new Motor(10,380);

    public FieldTest(){

    }

    public static void main(String[] args){
        Field fields = new Field();
        JFrame testing = new JFrame("Test");

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        testing.setSize(screenSize.width, screenSize.height);

        fields.setPreferredSize(new Dimension(50,50));

        testing.add(fields);
        testing.setVisible(true);

        new FieldTest();
        testing.repaint();



    }
}
