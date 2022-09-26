// --== CS400 Project 3 File Header ==--
// Name: <Soft Liampisan>
// Email: <liampisan@wisc.edu>
// Team: <AK>
// TA: <name of your team's ta>
// Lecturer: <Gary Dahl>
// Notes to Grader: <optional extra notes>

import java.io.FileNotFoundException;
import java.util.List;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class RouteLoader implements IRouteLoader{
	
	  public List<IRoute> loadUberPickUp(String filepath) throws FileNotFoundException{
		
		  JSONParser parser = new JSONParser(); 
		  
		  List<IRoute> uberPickUp = new ArrayList<IRoute>(); //creates a list of passenger data & routes for uber pick up
		  
		  try {
			 JSONArray jsonArr = (JSONArray) parser.parse(new FileReader(filepath));
			  
			  //Parse through the Json array for every objcet
			  for (Object obj: jsonArr) {
				  
				  JSONObject routes = (JSONObject) obj;
				  
				  String name = (String) routes.get("name"); //get the name of the object
		            
		          String time = (String) routes.get("time"); //get the time of the object
		            
		          String passengerLocation = (String) routes.get("passengerLocation"); //get the passenger then driver location
		 
		          
		          uberPickUp.add(new Route(name, time, passengerLocation)); //add to the array using the Route constructor
			  }
			  
			  return uberPickUp;
		
		  }catch(FileNotFoundException e) {
			  System.out.println("file not found");
		  }catch (Exception e) {
			  e.printStackTrace();  
		  }
		  
		  return null;
		  
	  }
}
