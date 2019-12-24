import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame {
    private JButton BtnOne = new JButton("One");
    private JButton BtnTwo = new JButton("Two");
    private JButton BtnThree = new JButton("Three");
    private JButton BtnFour = new JButton("Four");
    private JButton BtnFive = new JButton("Five");
    private JButton BtnSix = new JButton("Six");
    private JButton BtnSvn = new JButton("Seven");
    private JPanel PnlOne = new JPanel(new GridLayout(3, 1));
    private JPanel PnlTwo = new JPanel(new GridLayout(1,3));
    private JPanel PnlThree = new JPanel(new GridLayout(1,3));
    private JPanel PnlFour = new JPanel(new GridLayout(1,3));


    public Menu(String title) {
        super(title);//set title
        ImageIcon img = new ImageIcon("C:\\Users\\Rlakkys\\Desktop\\Codes\\Software\\Car-Simulator\\Codes\\icon.png");
        this.setIconImage(img.getImage());//set icon
        this.setSize(970, 1050);
//        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
//        aFrame.setSize(screenSize.width, screenSize.height);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//set when x pressed

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);//set menu bar
        JMenu file = new JMenu("File");
        JMenuItem helpMenu = new JMenuItem("Help");
        JMenuItem aboutMenu = new JMenuItem("About");
        JMenuItem quit = new JMenuItem("Quit");
        quit.addActionListener(new exitApp());
        file.add(helpMenu);//add inside menubar 1
        file.add(aboutMenu);//add inside menubar 1
        file.add(quit);//add inside menubar 1
        menuBar.add(file);//add menubar 1

        setLayout(new BorderLayout());
        add(PnlFour, BorderLayout.CENTER);//right
        add(PnlTwo, BorderLayout.NORTH);//up
        add(PnlThree, BorderLayout.SOUTH);//below
        add(PnlOne, BorderLayout.WEST);//left
        PnlOne.setPreferredSize(new Dimension(240, 120));
        PnlTwo.setPreferredSize(new Dimension(this.getWidth(), 80));
        PnlThree.setPreferredSize(new Dimension(this.getWidth(), 80));
        PnlFour.setPreferredSize(new Dimension(50, 120));
        PnlOne.add(BtnOne);
        PnlFour.add(BtnOne);
        PnlOne.add(BtnTwo);
        PnlOne.add(BtnThree);
        PnlTwo.add(BtnFour);
        PnlTwo.add(BtnFive);
        PnlTwo.add(BtnSix);
        PnlThree.add(BtnSvn);
        setVisible(true);

    }
    public static void main(String[] args) {
        Menu myApp = new Menu("Car Simulator");// add name
        myApp.setVisible(true);// make app visible
        myApp.isResizable();
    }

    static class exitApp implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            System.exit(0);//exit actions
        }
    }
}
