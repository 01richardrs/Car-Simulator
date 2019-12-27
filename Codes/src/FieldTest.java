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
        if(code.equals("0")){
                try {
                    buttonGrid[x][y] = new JButton("0");
                    Image img = ImageIO.read(FieldTest.class.getResource("grass.jpg"));
                    buttonGrid[x][y].setIcon(new ImageIcon(img));
                } catch (Exception ex) {
                    System.out.println(ex);
                }

            }else if(code.equals("1")){
                try {
                    buttonGrid[x][y] = new JButton("1");
                    Image img = ImageIO.read(FieldTest.class.getResource("straight2.jpg"));
                    buttonGrid[x][y].setIcon(new ImageIcon(img));
                } catch (Exception ex) {
                    System.out.println(ex);
                }
            }else{
            buttonGrid[x][y] = new JButton("X NOT FUND");
        }
        buttonGrid[x][y].addActionListener(buttonListener);
        testing.add(buttonGrid[x][y]);
        testing.setVisible(true);
        testing.repaint();
    }
//    public static void create_env(int xt,int yt,JFrame testing,String code){
//
//        for(int x=0;x<xt;x++) {
//            for (int y = 0; y < yt; y++) {
//                Road_translator(x,y,code,testing);
//            }
//        }
//
//    }

    public static void main(String[] args){
        JFrame testing = new JFrame("Test");

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        testing.setSize(screenSize.width, screenSize.height);

        GridLayout testingt = new GridLayout(ROWS,COLS);
        testing.setLayout(testingt);

//        FieldTest.create_env(testing);
//        FieldTest.saves(ROWS,COLS);
        FieldTest.load(testing);
    }


}
