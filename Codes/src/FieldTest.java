import javafx.scene.layout.Pane;

import java.awt.Rectangle;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FieldTest {
    private static final int ROWS = 10;
    private static final int COLS = ROWS;
    private static JButton[][] buttonGrid = new JButton[ROWS][COLS];
//    private static Field[][] draw = new Field[ROWS][COLS];

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
    public static void load(JFrame Testing){
        System.out.println("BAMGSAT");
        int test = 0,test2 = 0;
        try {
            File file = new File("test2.csv");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            String line = "";
            String[] tempArr;

            while((line = br.readLine()) != null) {
                tempArr = line.split(",");
                for (String tempStr : tempArr) {
                    System.out.print(tempStr + " ");
                    Road_translator(test,test2,tempStr,Testing);
                    test2++;
                }
                test2 = 0;
                test++;
                System.out.println();
            }
            br.close();
        } catch(IOException ioe) {
            ioe.printStackTrace();
        }
    }
    public static void Road_translator(int x,int y,String code,JFrame testing){
        JPanel p = null;
        if(code.equals("0")){
            p = new JPanel() {
                @Override
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);
                    g.setColor(Color.green);
                    g.fillRect(0,0,this.getWidth(),this.getHeight());
                }
            };
            }else if(code.equals("1")){
            p = new JPanel() {
                @Override
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);
                    g.setColor(Color.green);
                    g.fillRect(0,0,this.getWidth(),this.getHeight());
                    g.setColor(Color.white);
                    g.fillRect(0,5,this.getWidth(),10);// 0 for pos x , 125 for y pos //20 for height
                    g.setColor(Color.black);
                    g.fillRect(0,15,this.getWidth(),50);
                    g.setColor(Color.white);
                    g.fillRect(0,63,this.getWidth(),10);
                for (int b = 0; b < getWidth(); b = b + 40) {//line
                    g.setColor(Color.WHITE);
                    g.fillRect(b, 35, 10, 3);// i3 tebel i2 pjg
                    }
                }
            };
            }else{
            p = new JPanel() {
                @Override
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);
                    g.setColor(Color.BLACK);
                    g.fillRect(0,0,this.getWidth(),this.getHeight());
                }
            };
        }
//        buttonGrid[x][y].addActionListener(buttonListener);
//        testing.add(buttonGrid[x][y]);
        //        testing.add(draw[x][y]);
        testing.add(p);
        testing.setVisible(true);
        testing.repaint();
    }


    public static void main(String[] args){
        JFrame testing = new JFrame("Test");

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        testing.setSize(screenSize.width, screenSize.height);

        GridLayout testingt = new GridLayout(ROWS,COLS);
        testing.setLayout(testingt);
//        FieldTest.saves(ROWS,COLS);
        FieldTest.load(testing);
        testing.setVisible(true);
        testing.repaint();



    }


}
