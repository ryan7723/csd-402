public class Fan {
    public static final int STOPPED = 0;
    public static final int SLOW=1;
    public static final int MEDIUM =2;
    public static final int FAST =3;

    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public Fan(){
        speed = STOPPED;
        on = false;
        radius = 6;
        color = "white";
    }

    public Fan(int speed, boolean on, double radius, String color){
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed(){
        return speed;
    }

    public void setSpeed(int speed){
        this.speed = speed;
    }

    public boolean isOn(){
        return on;
    }

    public void setOn(boolean on){
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String toString() {
        String speedText = "";

        if (speed == STOPPED) {
            speedText = "STOPPED";
        } else if (speed == SLOW) {
            speedText = "SLOW";
        } else if (speed == MEDIUM) {
            speedText = "MEDIUM";
        } else if (speed == FAST) {
            speedText = "FAST";
        }
        if (on) {
            return "Fan is on | Speed: " + speedText + " | Color: " + color + " | Radius: " + radius;
        } else {
            return "Fan is off | Color: " + color + " | Radius: " + radius;
        }
    }

    public static void main(String[] args) {
        Fan fan1 = new Fan ();
        Fan fan2 = new Fan(FAST, true, 10, "yellow");

        System.out.println("Default fan:");
        System.out.println(fan1);

        System.out.println();

        System.out.println("Argument constructor fan:");
        System.out.println(fan2);

        System.out.println();

        fan1.setOn(true);
        fan1.setSpeed(MEDIUM);
        fan1.setRadius(8);
        fan1.setColor("blue");

        System.out.println("Updated default fan:");
        System.out.println(fan1);

        System.out.println();

        System.out.println("Testing getters:");
        System.out.println("Fan2 speed: " + fan2.getSpeed());
        System.out.println("Fan2 on: " + fan2.isOn());
        System.out.println("Fan2 radius: " + fan2.getRadius());
        System.out.println("Fan2 color: " + fan2.getColor());
    }
}