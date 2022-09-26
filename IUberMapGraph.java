// --== CS400 Project Three File Header ==--
// Name: Amelia Sitzberger
// CSL Username: amelia
// Email: asitzberger@wisc.edu
// Lecture #: 001 @11:00am
// Notes to Grader: <any optional extra notes to your grader>
import java.util.List;
import java.util.NoSuchElementException;

/**
 * This interface is used to create a class which extends the CS400Graph class.
 *
 * @param <T> node type
 */
public interface IUberMapGraph<T, R> extends GraphADT<T>{

    /**
     * This method should return a sorted list of the lowest weight to the highest weight locations based off where
     * the driver currently is.
     *
     * @param uberPickups all of the current nodes in the graph
     * @param driverLocation the driver's current location
     * @return a sorted list from the closest locations to the driver’s location to the furthest locations
     * @throws NoSuchElementException if driverLocation is null
     */
    public List<R> getSortedRoutes(List<R> uberPickups, T driverLocation);

}