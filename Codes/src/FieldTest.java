import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class FieldTest {
    private static final int ROWS = 10;
    private static final int COLS = ROWS;
    private static JButton[][] buttonGrid = new JButton[ROWS][COLS];
    private static Boolean modes=true;

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
    public static void load(JFrame Testing,boolean modes){
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
                    Road_translator(test,test2,tempStr,Testing,modes);
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
    public static void Road_translator(int x,int y,String code,JFrame testing,boolean modes){
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
            buttonGrid[x][y] = new JButton("0");
            }else if(code.equals("1")){
            p = new JPanel() {
                @Override
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);
                    g.setColor(Color.green);
                    g.fillRect(0,0,this.getWidth(),this.getHeight());
                    g.setColor(Color.white);
                    g.fillRect(0,23,this.getWidth(),5);// 0 for pos x , 125 for y pos //20 for height
                    g.setColor(Color.black);
                    g.fillRect(0,28,this.getWidth(),50);
                    g.setColor(Color.white);
                    g.fillRect(0,78,this.getWidth(),5);
                for (int b = 0; b < getWidth(); b = b + 40) {//line
                    g.setColor(Color.WHITE);
                    g.fillRect(b, 50, 10, 3);// i3 tebel i2 pjg
                    }
                }
            };
            buttonGrid[x][y] = new JButton("1");
                }else if(code.equals("2")){
                    p=new JPanel(){
                        @Override
                        protected void paintComponent(Graphics g) {
                            super.paintComponent(g);
                            g.setColor(Color.green);
                            g.fillRect(0,0,this.getWidth(),this.getHeight());
                            g.setColor(Color.white);
                            g.fillRect(70,0,5,this.getHeight());// 0 for pos x , 125 for y pos //20 for height
                            g.setColor(Color.black);
                            g.fillRect(75,0,50,this.getHeight());
                            g.setColor(Color.white);
                            g.fillRect(125,0,5,this.getHeight());
                            for (int b = 0; b < getHeight(); b = b + 40) {//line
                                g.setColor(Color.WHITE);
                                g.fillRect(98, b, 3, 10);// i3 tebel i2 pjg
                            }
                        }
                    };
            buttonGrid[x][y] = new JButton("2");
                }else if(code.equals("3r")){
            p=new JPanel(){
                @Override
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);
                    g.setColor(Color.green);
                    g.fillRect(0,0,this.getWidth(),this.getHeight());
                    g.setColor(Color.white);
                    g.fillRect(70,0,5,this.getHeight());// 0 for pos x , 125 for y pos //20 for height
                    g.fillRect(0,23,75,5);
                    g.setColor(Color.black);
                    g.fillRect(75,0,50,this.getHeight());
                    g.fillRect(0,28,75,50);
                    g.setColor(Color.white);
                    g.fillRect(125,0,5,this.getHeight());
                    g.fillRect(0,78,75,5);
                    g.setColor(Color.WHITE);
                    g.fillRect(98, 5, 3, 10);// i3 tebel i2 pjg
                    g.fillRect(98, 75, 3, 10);// i3 tebel i2 pjg
                    g.fillRect(65, 50, 10, 3);
                    g.fillRect(35, 50, 10, 3);
                    g.fillRect(5, 50, 10, 3);
                }
            };
            buttonGrid[x][y] = new JButton("3r");
        }else if(code.equals("3t")){
            p=new JPanel(){
                @Override
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);
                    g.setColor(Color.green);
                    g.fillRect(0,0,this.getWidth(),this.getHeight());
                    g.setColor(Color.white);
                    g.fillRect(70,40,5,this.getHeight());// 0 for pos x , 125 for y pos //20 for height
                    g.fillRect(0,23,this.getWidth(),5);
                    g.fillRect(125,40,5,this.getHeight());
                    g.fillRect(0,78,this.getWidth(),5);
                    g.setColor(Color.black);
                    g.fillRect(75,40,50,75);
                    g.fillRect(0,28,this.getWidth(),50);
                    g.setColor(Color.WHITE);
                    g.fillRect(98, 75, 3, 10);// i3 tebel i2 pjg
                    g.fillRect(165, 50, 10, 3);
                    g.fillRect(135, 50, 10, 3);
                    g.fillRect(65, 50, 10, 3);
                    g.fillRect(35, 50, 10, 3);
                    g.fillRect(5, 50, 10, 3);
                }
            };
            buttonGrid[x][y] = new JButton("3t");
        }else if(code.equals("3low")){
            p=new JPanel(){
                @Override
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);
                    g.setColor(Color.green);
                    g.fillRect(0,0,this.getWidth(),this.getHeight());
                    g.setColor(Color.white);
                    g.fillRect(70,0,5,70);// 0 for pos x , 125 for y pos //20 for height
                    g.fillRect(0,23,this.getWidth(),5);
                    g.fillRect(125,0,5,70);
                    g.fillRect(0,78,this.getWidth(),5);
                    g.setColor(Color.black);
                    g.fillRect(75,0,50,75);
                    g.fillRect(0,28,this.getWidth(),50);
                    g.setColor(Color.WHITE);
                    g.fillRect(98, 15, 3, 10);// i3 tebel i2 pjg
                    g.fillRect(165, 50, 10, 3);
                    g.fillRect(135, 50, 10, 3);
                    g.fillRect(65, 50, 10, 3);
                    g.fillRect(35, 50, 10, 3);
                    g.fillRect(5, 50, 10, 3);
                }
            };
            buttonGrid[x][y] = new JButton("3low");
        }else if(code.equals("4")){
            p=new JPanel(){
                @Override
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);
                    g.setColor(Color.green);
                    g.fillRect(0,0,this.getWidth(),this.getHeight());
                    g.setColor(Color.white);
                    g.fillRect(70,0,5,this.getHeight());// 0 for pos x , 125 for y pos //20 for height
                    g.fillRect(0,23,this.getWidth(),5);
                    g.fillRect(125,0,5,this.getHeight());
                    g.fillRect(0,78,this.getWidth(),5);
                    g.setColor(Color.black);
                    g.fillRect(75,0,50,this.getHeight());
                    g.fillRect(0,28,this.getWidth(),50);
                    g.setColor(Color.WHITE);
                    g.fillRect(98, 5, 3, 10);// i3 tebel i2 pjg
                    g.fillRect(98, 75, 3, 10);// i3 tebel i2 pjg
                    g.fillRect(65, 50, 10, 3);
                    g.fillRect(35, 50, 10, 3);
                    g.fillRect(5, 50, 10, 3);
                    g.fillRect(135, 50, 10, 3);
                    g.fillRect(165, 50, 10, 3);
                }
            };
            buttonGrid[x][y] = new JButton("4");
        }
        else{
            p = new JPanel() {
                @Override
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);
                    g.setColor(Color.green);
                    g.fillRect(0,0,this.getWidth(),this.getHeight());
                    g.setColor(Color.BLACK);
                    g.fillRect(15,15,150,100);

                }
            };
            buttonGrid[x][y] = new JButton("null");
        }
        System.out.println(x+"adas"+y);
        buttonGrid[x][y].addActionListener(buttonListener);

        testing.add(p);
        if(modes){
            buttonGrid[x][y].setVisible(true);
        }else{
            buttonGrid[x][y].setVisible(false);
        }
//        testing.add(buttonGrid[x][y]);
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
        FieldTest.load(testing,modes);
        testing.setVisible(true);
        testing.repaint();

    }
}