// --== CS400 Project Three File Header ==--
// Name: Amelia Sitzberger
// CSL Username: amelia
// Email: asitzberger@wisc.edu
// Lecture #: 001 @11:00am
// Notes to Grader: <any optional extra notes to your grader>

/**
 * This class creates intersection objects to be used as nodes in Dijkstra's algorithm
 */
public class Intersection implements IIntersection{
    protected String name; // name of the intersecting streets

    /**
     * Creates a new intersection object
     *
     * @param name the name of the streets that are intersecting
     */
    public Intersection(String name) {
        this.name = name;
    }

    /**
     * Getter method that returns the name of the intersection
     *
     * @return name of the intersection
     */
    @Override
    public String getName() {
        return this.name;
    }
}

