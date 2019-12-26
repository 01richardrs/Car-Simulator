import java.awt.Rectangle;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class FieldTest {
    private static final int ROWS = 10;
    private static final int COLS = ROWS;
    private static JButton[][] buttonGrid = new JButton[ROWS][COLS];
    private static ActionListener buttonListener = new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent evt) {
            JButton selectedBtn = (JButton) evt.getSource();
            for (int row = 0; row < buttonGrid.length; row++) {
                for (int col = 0; col < buttonGrid[row].length; col++) {
                    if (buttonGrid[row][col] == selectedBtn) {
                        System.out.printf("Selected row and column: %d %d%n", row, col);
                    }
                }
            }
        }
    };

    public static void saves(int row, int col){
        try (PrintWriter writer = new PrintWriter(new File("test2.csv"))) {

            StringBuilder sb = new StringBuilder();
            int c=1;// can give conditions so if its road or smth
            int at=0;
            for(int a=0;a<row;a++){
                for(int b=0;b<col;b++){
                    sb.append(c);
                    c++;
                    at++;
                    if(at == 10){
                        sb.append('\n');
                        at = 0;
                    }else{
                        sb.append(',');
                    }
                }
            }

            writer.write(sb.toString());

            System.out.println("done!");

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }

    public static void main(String[] args){
        JFrame testing = new JFrame("Test");

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        testing.setSize(screenSize.width, screenSize.height);


        GridLayout testingt = new GridLayout(ROWS,COLS);
        testing.setLayout(testingt);

        int b=1;

        for(int y=0;y<10;y++) {
            for (int x = 0; x < 10; x++) {
                buttonGrid[y][x] = new JButton(""+b);

                if(y==2){
                    try {
                        Image img = ImageIO.read(FieldTest.class.getResource("straight2.jpg"));
                        buttonGrid[y][x].setIcon(new ImageIcon(img));
                    } catch (Exception ex) {
                        System.out.println(ex);
                    }
                }else if(y==4){
                    try {
                        Image img = ImageIO.read(FieldTest.class.getResource("straight2.jpg"));
                        buttonGrid[y][x].setIcon(new ImageIcon(img));
                    } catch (Exception ex) {
                        System.out.println(ex);
                    }
                }else if(y==6){ try {
                    Image img = ImageIO.read(FieldTest.class.getResource("straight2.jpg"));
                    buttonGrid[y][x].setIcon(new ImageIcon(img));
                } catch (Exception ex) {
                    System.out.println(ex);
                }}else {
                try {
                    Image img = ImageIO.read(FieldTest.class.getResource("grass.jpg"));
                    buttonGrid[y][x].setIcon(new ImageIcon(img));
                } catch (Exception ex) {
                    System.out.println(ex);
                }
                }

                buttonGrid[y][x].addActionListener(buttonListener);
                b++;
                testing.add(buttonGrid[y][x]);
            }
        }


        testing.setVisible(true);
        testing.repaint();
        FieldTest.saves(ROWS,COLS);

    }


}
