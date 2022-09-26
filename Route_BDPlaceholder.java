import java.sql.Time;

// --== CS400 Project Three File Header ==--
// Name: Hong Kai Ng
// CSL Username: hng
// Email: hng7@wisc.edu
// Lecture #: 001 @11:00am
// Notes to Grader: <any optional extra notes to your grader>

/**
 * Placeholder class for the Route class 
 */
public class Route_BDPlaceholder implements IRoute{
    String name;
    String passengerLoc;
    String pickupTime;

    public Route_BDPlaceholder(String name, String passengerLoc, String pickupTime){
        this.name = name;
        this.passengerLoc = passengerLoc;
        this.pickupTime = pickupTime;
    }

    @Override
    public int compareTo(IRoute o) {
        return 0;
    }

    @Override
    public String getTime() {
        // TODO Auto-generated method stub
        return pickupTime;
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return name;
    }

    @Override
    public String getPassengerLocation() {
        // TODO Auto-generated method stub
        return passengerLoc;
    }

}
