// base class
class Bicycle {
    // Fields of the Bicycle class
    public int gear;
    public int speed;

    // Constructor for the Bicycle class
    public Bicycle(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }

    // Methods of the Bicycle class
    public void applyBrake(int decrement) {
        speed -= decrement;
    }

    public void speedUp(int increment) {
        speed += increment;
    }

    // toString() method to print info of Bicycle
    public String toString() {
        return ("No of gears are " + gear + "\n"
                + "speed of bicycle is " + speed);
    }
}

// derived class
class MountainBike extends Bicycle {
    // Additional field in the MountainBike subclass
    public int seatHeight;

    // Constructor for the MountainBike subclass
    public MountainBike(int startHeight, int gear, int speed) {
        // Calling the base-class(Bicycle) constructor using super()
        
        super(gear, speed);
        seatHeight = startHeight;
		
    }

    // Additional method in the MountainBike subclass
    public String tString() {
        return ("\nseat height is " + seatHeight);
    }
}

// driver class
public class inher {
    public static void main(String args[]) {
        MountainBike mb = new MountainBike(25, 3, 5);
        System.out.println(mb.tString());
    }
}
