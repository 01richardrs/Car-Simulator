import java.util.Timer;

public class Traffic {
    private int height =3;
    private int width = 1;
    private String Traff_color = "White";
    private boolean status = true;

    public String getTraff_color() {
        return Traff_color;
    }

    public void setTraff_color(String traff_color) {
        Traff_color = traff_color;
        if(traff_color == "Green"){
            setStatus(true);
        }else if (traff_color == "Red"){
            setStatus(false);
        }
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}
