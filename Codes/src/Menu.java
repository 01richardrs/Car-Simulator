import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame {
    Field fields = new Field();
    private JLabel City = new  JLabel("City",SwingConstants.CENTER);
    private JLabel Citytxt = new  JLabel("100 peps",SwingConstants.CENTER);
    private JLabel mode = new  JLabel("Mode",SwingConstants.CENTER);
    private JLabel modetxt = new  JLabel("Start",SwingConstants.CENTER);
    private JLabel status = new  JLabel("Status",SwingConstants.CENTER);
    private JLabel statustxt = new  JLabel("Starting",SwingConstants.CENTER);


    private JButton New_but = new JButton("New");
    private JButton Open_but = new JButton("Open ");
    private JButton Save_but = new JButton("Save");
    private JButton Exit_but = new JButton("Exit");

    private JButton BtnFive = new JButton("Start");
    private JButton Stop = new JButton("Stop");
    private JPanel West_Content = new JPanel(new GridLayout(4, 1));//left
    private JPanel North_content = new JPanel(new GridLayout(2,2));//top
    private JPanel South_content = new JPanel(new GridLayout(1,4));//below
    private JPanel Center_content = new JPanel();//center
    Car mobil1 = new Car(10,100);
    Bus nus1 = new Bus(10,180);
    Motor moto1 = new Motor(10,380);

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
        add(fields, BorderLayout.CENTER);//right
        add(North_content, BorderLayout.NORTH);//up
        add(South_content, BorderLayout.SOUTH);//below
        add(West_Content, BorderLayout.WEST);//left
        West_Content.setPreferredSize(new Dimension(240, 120));
        North_content.setPreferredSize(new Dimension(this.getWidth(), 80));
        South_content.setPreferredSize(new Dimension(this.getWidth(), 80));


        North_content.add(City) ;
        North_content.add(BtnFive);
        North_content.add(Citytxt) ;
        North_content.add(Stop);

        West_Content.add(New_but);
        West_Content.add(Open_but);
        West_Content.add(Save_but);
        West_Content.add(Exit_but);


        South_content.add(mode);
        South_content.add(modetxt);
        South_content.add(status);
        South_content.add(statustxt);

        fields.addVehicle(mobil1);
        fields.addVehicle(nus1);
        fields.addVehicle(moto1);
        this.repaint();
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
