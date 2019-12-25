public class TraffTest {
    public static void main(String[] args){
        Traffic traf1 = new Traffic();
        System.out.println("Now Traff color is : "+traf1.getTraff_color());
        System.out.println("Now Traff state is : "+traf1.isStatus());
        traf1.setTraff_color("Green");
        System.out.println("Now Traff color is : "+traf1.getTraff_color());
        System.out.println("Now Traff state is : "+traf1.isStatus());
        traf1.setTraff_color("Red");
        System.out.println("Now Traff color is : "+traf1.getTraff_color());
        System.out.println("Now Traff state is : "+traf1.isStatus());
    }
}
