// --== CS400 Project Three File Header ==--
// Name: <Soft Liampisan>
// CSL Username: <soft>
// Email: <liampisan@wisc.edu>
// Lecture #: <001 @11:00am, 002 @1:00pm, 004 @4:00pm>
// Notes to Grader: <any optional extra notes to your grader>
/**

 * Instances of classes that implement this interface represent a single uber pickup object that can be stored, sorted, and searched for based on these accessors below

 * Instances of classes that implement this interface represent a single uber pickup object that can be stored, sor
ted, and searched for based on these accessors below

 */
public interface IRoute extends Comparable<IRoute> {
  
  // no-arg constructor
  // constructor args (String time, String name, String driverLocation, String passengerLocation)
  public String getTime(); // retrieve the time the pick up request was submitted
  public String getName(); // retrieve the name of the person that submitted the request
  public String getPassengerLocation(); // retrieve the location of the passenger

 
  // compareTo() methods supports sorting routes in order by priority (time submitted)
  // oldest (high priority) to newest (low priority) requests
  
}
