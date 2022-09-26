// --== CS400 Project Three File Header ==--
// Name: <Soft Liampisan>
// CSL Username: <soft>
// Email: <liampisan@wisc.edu>
// Lecture #: <001 @11:00am, 002 @1:00pm, 004 @4:00pm>
// Notes to Grader: <any optional extra notes to your grader>

import java.util.List;
import java.io.FileNotFoundException;
/**
 * Instances of classes that implement this interface can be used to load a list of uber pick ups from a specified json source file
 * The following JSON names are used to load these route attributes:
 *   - NAME: The name of the passenger requesting to be picked up
 *   - TIME: The time that the passenger requested to be picked up
 *   - DLOCATION: The location of the driver
 *   - PLOCATION: The location of the passenger
 */
public interface IRouteLoader {
  /**
   * This method loads the list of uber pick ups described within an json file.
   * @param filepath is relative to executable's working directory
   * @return a list of route objects that were read from specified file
   * @throws FileNotFoundException
   */
  public List<IRoute> loadUberPickUp(String filepath) throws FileNotFoundException;
}
