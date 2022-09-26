// --== CS400 Project 3 File Header ==--
// Name: <Soft Liampisan>
// Email: <liampisan@wisc.edu>
// Team: <AK>
// TA: <name of your team's ta>
// Lecturer: <Gary Dahl>
// Notes to Grader: <optional extra notes>

public class Route implements IRoute{
	String name;
	String time;
	String passengerLocation;
		
	public Route() {
		this.name = "";
		this.time = "";
		this.passengerLocation = "";
	
	}
	
	/*
	 * Constructor that creates the route with all the data
	 * @param name, the name of the passenger
	 * @param time, time that the uber is booked
	 * @param passengerLocation, the location that the passenger will be picked up	
	 * @param driverLocation, where the driver is before the passenger is picked up
	 */
	public Route(String name, String time, String passengerLocation) {
		this.name = name;
		this.time = time;
		this.passengerLocation = passengerLocation;
	
	}
	
	public String getTime() {
		return time;
	}
	
	public String getName() {
		return name;
	}
	
	public String getPassengerLocation() {
		return passengerLocation; 
//		Intersection_DWPlaceholder passengerLocation = new Intersection_DWPlaceholder();
//		return passengerLocation;
	}
	
	

	
	/*
	 * This method compares the time the uber was booked in hours then minutes,
	 * returns -1, 0 or 1 by comparing the hours and minutes
	 */
	public int compareTo(IRoute o) {
		int firstHour = Integer.parseInt((this.time).substring(0, 2));
		int firstMin = Integer.parseInt((this.time).substring(2, 4));
		int secHour = Integer.parseInt((o.getTime()).substring(0, 2));
		int secMin = Integer.parseInt((o.getTime()).substring(2, 4));
		
		if (firstHour > secHour) {
			return 1;
		} else if (firstHour < secHour) {
			return -1;
		} else {
			if (firstMin > secMin) {
				return 1;
			} else if (firstMin < secMin) {
				return -1;
			} else {
				return 0;
			}
		}
		
	}
}
