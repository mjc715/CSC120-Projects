import java.util.Scanner;
//======================================================================================================================
public class Interstate {
//----------------------------------------------------------------------------------------------------------------------
    private static final Scanner keyboard = new Scanner(System.in);
    private static final int SPEED_LIMIT = 65;
//----------------------------------------------------------------------------------------------------------------------
    public static void main (String[] args) {
        double miles, time, travelSpeed;
        boolean tooFast;
        introduction();

//----- User inputs

        System.out.println("Enter distance to travel : ");
        miles = keyboard.nextDouble();
        System.out.println("Enter time available : ");
        time = keyboard.nextDouble();

//----- Getting needed travel speed

        travelSpeed = travelSpeed(miles,time);

//----- Comparing needed travel speed to I95 speed limit

        tooFast = travelSpeed > SPEED_LIMIT;

//----- Outputting results

        System.out.println("You will have to travel at " + travelSpeed + " mph");
        System.out.println();
        System.out.println("Over the speed limit? : " + tooFast);


}
//----------------------------------------------------------------------------------------------------------------------
    private static void introduction() {
//----- Outputs introductory text/instructions

        System.out.println("Welcome to the I95 Speed Machine");
        System.out.println();
        System.out.println("You will have to supply:");
        System.out.println("1. The distance you want to travel, in miles");
        System.out.println("2. The time you have available, in hours");

    }
//----------------------------------------------------------------------------------------------------------------------
    private static double travelSpeed(double miles, double time) {
//------ Calculates the speed needed to travel accounting for rest

        double numStops;
        double stopTime;
        double driveTime;
        double travelSpeed;

        numStops = miles / 100;
        numStops = (int)numStops;
        if (miles % 100 != 0) {
            numStops = numStops + 1;
        }
        stopTime = numStops * .083333333333;
        driveTime = time - stopTime;
        travelSpeed = miles / driveTime;
        return travelSpeed;
    }
//----------------------------------------------------------------------------------------------------------------------
    }
//======================================================================================================================