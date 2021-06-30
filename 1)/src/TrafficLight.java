//: enumerated/TrafficLight.java
// Enums in switch statements.
// Define an enum type:

import static enums.Signal.GREEN;
import static enums.Signal.RED;
import static enums.Signal.YELLOW;

public class TrafficLight {
    enums.Signal color = RED;
    public void change() {
        switch(color) {
            // Note that you don’t have to say Signal.RED
            // in the case statement:
            case RED: color = GREEN;
                break;
            case GREEN: color = YELLOW;
                break;
            case YELLOW: color = RED;
                break;
        }
    }
    public String toString() {
        return "The traffic light is " + color;
    }
    public static void main(String[] args) {
        TrafficLight t = new TrafficLight();
        for(int i = 0; i < 7; i++) {
            System.out.println(t);
            t.change();
        }
    }
}
