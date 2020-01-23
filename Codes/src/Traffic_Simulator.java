import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Traffic_Simulator extends JFrame implements ActionListener {
    private JPanel Panelpane;
    JButton RunBut = new JButton("Run");
    JButton StopBut = new JButton("Stop");
    JPanel WestMenu = new JPanel(new GridLayout(2,1));
    JPanel CenterContent = new JPanel(new GridLayout(2,1));



    public static void main(String[] args){
        Traffic_Simulator Frame = new Traffic_Simulator();
        Frame.setSize(1058,629);
        Frame.setVisible(true);
    }

    public Traffic_Simulator(){
        setTitle("Traffic Simulator");
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Panelpane = new JPanel();

        add(WestMenu,BorderLayout.WEST);
        CenterContent.setSize(new Dimension(650,50));
        add(CenterContent,BorderLayout.CENTER);

        StopBut.addActionListener(this);
        RunBut.addActionListener(this);
        WestMenu.add(RunBut);
        WestMenu.add(StopBut);

    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

    }
}
