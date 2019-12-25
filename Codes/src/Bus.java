public class Bus extends Vehicle{
    public Bus(String Bus_name, String Bus_colour){
        super(0,0);
        this.setSize(6);
        this.setName(Bus_name);
        this.setColour(Bus_colour);
//        this.setPositionX(0);
//        this.setPositionY(0);
        this.setRoad(0);
        this.setVehicle_state(false);
        this.setVisible(false);
    }
}
