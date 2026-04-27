// Ryan Barber assignment 7.2 4/26/26

import java.util.ArrayList;

public class UseFans {

    // Display ONE fan (no toString used)
    public static void displayFan(Fan fan) {
        String speedText ="";

        if (fan.getSpeed() ==Fan.STOPPED) {
            speedText = "STOPPED";
        } else if (fan.getSpeed() == Fan.SLOW){
            speedText = "SLOW";
        } else if (fan.getSpeed() == Fan.MEDIUM){
            speedText = "MEDIUM";
        } else if (fan.getSpeed() == Fan.FAST){
            speedText = "FAST";
        }

        System.out.println("Fan Info:");
        System.out.println("Speed:"+speedText);
        System.out.println("On:"+fan.isOn());
        System.out.println("Radius:"+fan.getRadius());
        System.out.println("Color:"+fan.getColor());
        System.out.println();
    }

    // Display COLLECTION of fans
    public static void displayFans(ArrayList<Fan>fans) {
        for (Fan fan : fans) {
            displayFan(fan);
        }
    }

    public static void main(String[] args) {

        ArrayList<Fan>fans = new ArrayList<>();

        // Create Fans
        Fan fan1 = new Fan();
        Fan fan2 = new Fan(Fan.SLOW, true, 8, "blue");
        Fan fan3 = new Fan(Fan.MEDIUM,true, 10, "yellow");
        Fan fan4 = new Fan(Fan.FAST, false, 12, "green");

        // Add to Collection
        fans.add(fan1);
        fans.add(fan2);
        fans.add(fan3);
        fans.add(fan4);

        // Display one fan
        System.out.println("Display one fan:");
        displayFan(fan1);

        // Display all fans
        System.out.println("Displaying all fans:");
        displayFans(fans);
    }
}