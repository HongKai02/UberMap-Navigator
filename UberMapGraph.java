// --== CS400 Project Three File Header ==--
// Name: Amelia Sitzberger
// CSL Username: amelia
// Email: asitzberger@wisc.edu
// Lecture #: 001 @11:00am
// Notes to Grader: <any optional extra notes to your grader>

import java.util.List;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Iterator;
import java.util.Collection;

public class UberMapGraph extends CS400Graph<IIntersection> implements IUberMapGraph<IIntersection, IRoute>{

    @Override
    public List<IRoute> getSortedRoutes(List<IRoute> uberPickups, IIntersection driverLocation)
            throws NoSuchElementException {
        // if driver's location is null, throws an exception
        if(driverLocation == null || uberPickups == null || uberPickups.isEmpty()) {
            throw new NoSuchElementException();
        }

        List<IRoute> sortedRoutes = new ArrayList<>(); // list of passenger locations
        List<Path> shortestPaths = new ArrayList<Path>(); // list of the paths to the passenger location

        for(IRoute r: uberPickups) { // loops through the passenger list creating a new path object for each
            
	    // Loops through all the locations in the map to find the passenger's location
            Collection<CS400Graph<IIntersection>.Vertex> verts = vertices.values();
            Iterator<CS400Graph<IIntersection>.Vertex> ver = verts.iterator();
            Intersection passengerLocation = null;
            while(ver.hasNext()) {
                Intersection v = (Intersection) ver.next().data;
                if(v.getName().equals(r.getPassengerLocation())) {
                    passengerLocation = v;
                    break;
                }
            }

            if(passengerLocation == null) {
                throw new NoSuchElementException(); // the passenger location is not within the map
            }

            // creates a new path from the driver to the passenger
            Path routePath = dijkstrasShortestPath(driverLocation, passengerLocation);

            // Sorts all of the routes to the passengers by their distances
            if(sortedRoutes.isEmpty()) {
                shortestPaths.add(routePath);
                sortedRoutes.add(r);
            } else {
                for(int i = 0; i < shortestPaths.size(); i++) {
                    if(routePath.distance < shortestPaths.get(i).distance) {
                        shortestPaths.add(i, routePath);
                        sortedRoutes.add(i, r);
                        break;
                    } else if(i == shortestPaths.size()-1) {
                        shortestPaths.add(routePath);
                        sortedRoutes.add(r);
                        break;
                    }
                }
            }
        }
        return sortedRoutes;
    }
}
