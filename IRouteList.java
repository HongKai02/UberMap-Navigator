// --== CS400 Project Three File Header ==--
// Name: <Soft Liampisan>
// CSL Username: <soft>
// Email: <liampisan@wisc.edu>
// Lecture #: <001 @11:00am, 002 @1:00pm, 004 @4:00pm>
// Notes to Grader: <any optional extra notes to your grader>
import java.util.List;
/**
 * Instances of classes that implement this interface represent list of uber pick up objects that can be unmarshalled
 */
public interface IRouteList {
    public List<IRoute> getUberPickUp(); // accessor method for list of uber pick ups
}
