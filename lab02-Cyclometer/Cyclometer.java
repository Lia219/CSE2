// Lindsay Alvarez
//2/5/16
// CSE 02
// Bicycle Cyclometer: measuring speed and distance of bicycle 
//
public class Cyclometer {
    public static void main (String [ ] args) {
        // our imput data.
        int secsTrip1=480; // number of seconds on Trip1
        int secsTrip2=3220; // number of seconds on Trip2
        int countsTrip1=1561; // number of rotations on Trip1
        int countsTrip2=9037; // number of rotations on Trip2
        double wheelDiameter=27.0, //
        PI=3.14159, //
        feetPerMile=5280, //
        inchesPerFoot=12, //
        secondsPerMinute=60; //
        double distanceTrip1, distanceTrip2, totalDistance; //
        System.out.println("Trip 1 took " + (secsTrip1/secondsPerMinute)+" minutes and had "+ countsTrip1+" counts.");
        System.out.println("Trip 2 took "+ (secsTrip2/secondsPerMinute)+"minutes and had "+ countsTrip2+" counts.");
        //run the calculations; store the values. // running the calculations of each trip and storing those calculations
        distanceTrip1=countsTrip1*wheelDiameter*PI;
        //Above gives distance in inches
        //(for each count, a rotation of the wheel travels
        //the diameter in inches times PI)
        distanceTrip1/=inchesPerFoot*feetPerMile; // Gives distance in miles
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
        totalDistance=distanceTrip1+distanceTrip2;
        // Print out the output data.
        System.out.println("Trip 1 was "+distanceTrip1+" miles");
        System.out.println("Trip 2 was "+distanceTrip2+" miles");
        System.out.println("The total distance was "+totalDistance+" miles");
    } // end of main method 
} //end of class
