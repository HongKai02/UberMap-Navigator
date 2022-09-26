public class AE_Route implements IRoute {
    protected String time;
    protected String name;
    protected String passengerLocation;

    public AE_Route(String passengerLocation) {
        this.time = time;
        this.name = name;
        this.passengerLocation = passengerLocation;
    }

    @Override
    public String getTime() {
        return null;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String getPassengerLocation() {
        return this.passengerLocation;
    }

    @Override
    public int compareTo(IRoute o) {
        return 0;
    }
}
