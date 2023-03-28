/// Is-A And Has-A Reletion
public class Car {
     private String Colour;
    private int maxSpeed;
    public void setColour( String setColour){
        System.out.println("Color is :"+setColour);
    }
    public void setMaxSpeed(int setMaxSpeed){
        System.out.println("Speed Is :"+setMaxSpeed);
    }

    public static void main(String[] args) {
        Car nano = new Car();
        nano.setColour("Red");
        nano.setMaxSpeed(435);
    }
}
