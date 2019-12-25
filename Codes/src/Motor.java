public class Motor extends Vehicle{
    public Motor(String Motor_name, String Motor_color){
        super(0,0);
        this.setSize(1);
        this.setName(Motor_name);
        this.setColour(Motor_color);
//        this.setPositionX(0);
//        this.setPositionY(0);
        this.setRoad(0);
        this.setVehicle_state(false);
        this.setVisible(false);
    }
}
