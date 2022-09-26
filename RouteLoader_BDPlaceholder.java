// --== CS400 Project 3 File Header ==--
// Name: Hong Kai Ng
// Email: hng7@wisc.edu
// Team: AK: blue
// TA: Yelun Bao
// Lecturer: Gary
// Notes to Grader: <optional extra notes>

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

/**
 * Placeholder class for the Route.java file that is being implemented by the algorithm engineer
 */
public class RouteLoader_BDPlaceholder implements IRouteLoader {

    /**
     * This method is hardcoded to always return the passenger list of a specific passenger named James
     */
    @Override
    public List<IRoute> loadUberPickUp(String filepath) throws FileNotFoundException {
        Route_BDPlaceholder passenger1 = new Route_BDPlaceholder("James", "Regent & State", "0800");

        List<IRoute> passengerList = new ArrayList<IRoute>();
        passengerList.add(passenger1);

        return passengerList;
    }
    
}
