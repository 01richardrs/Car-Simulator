public class Road {
    private int length;
    private int roadnum;
    private int height;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getRoadnum() {
        return roadnum;
    }

    public void setRoadnum(int roadnum) {
        this.roadnum = roadnum;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}

////below Straight road
//        g.setColor(Color.white);
//                g.fillRect(0,125,this.getWidth(),20);// 0 for pos x , 125 for y pos //20 for height
//                g.setColor(Color.black);
//                g.fillRect(0,145,this.getWidth(),250);
//                g.setColor(Color.white);
//                g.fillRect(0,395,this.getWidth(),20);
//                for (int b = 0; b < getWidth(); b = b + 150) {//line
//        g.setColor(Color.WHITE);
//        g.fillRect(b, 255, 50, 20);// i3 tebel i2 pjg
//        }
//        //up Straight road
//
//        //traff light
//        g.setColor(Color.gray);
//        g.fillRect(this.getWidth()-48,100,15,45);
//        g.setColor(Color.yellow);
//        g.fillRect(this.getWidth()-65,15,50,100);
//        g.setColor(Color.red);
//        g.fillOval(this.getWidth()-55, 25, 30, 30);
//        g.setColor(Color.GREEN);
//        g.fillOval(this.getWidth()-55, 70, 30, 30);
////end traff