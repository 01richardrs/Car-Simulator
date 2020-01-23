import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Traffic_Simulator extends JFrame implements ActionListener,Runnable {
    JButton RunBut = new JButton("Run");
    JButton StopBut = new JButton("Stop");
    JPanel WestMenu = new JPanel(new GridLayout(2,1));
    City_Content Content = new City_Content();
    JPanel CenterContent = new JPanel();

    boolean running=false;



    public static void main(String[] args){
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Traffic_Simulator Frame = new Traffic_Simulator();
                    Frame.setSize(1058,629);
                    Frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });


    }

    public Traffic_Simulator(){
        setTitle("Traffic Simulator");
        setResizable(false);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(WestMenu,BorderLayout.WEST);
        CenterContent.add(Content);
        add(CenterContent,BorderLayout.CENTER);

        StopBut.addActionListener(this);
        RunBut.addActionListener(this);
        WestMenu.add(RunBut);
        WestMenu.add(StopBut);

    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if(actionEvent.getSource().equals(RunBut)) {
            if(running==false) {
                running=true;
                Thread t=new Thread(this);
                t.start();
            }
        }
        if(actionEvent.getSource().equals(StopBut)) {
            running=false;
        }
    }

    @Override
    public void run() {
        while(running==true) {
            Content.Move();
            Content.repaint();

            try {
                Thread.sleep(500);
            }
            catch(Exception e) {
                e.printStackTrace();
            }
        }
    }


}
