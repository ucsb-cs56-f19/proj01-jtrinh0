package earthquakes.searches;

public class EqSearch {
    private int distance;
    private int minmag;
    private double lat;
    private double lon;
    private String location;

    // No-arg constructor
    public EqSearch() {
    }

    // Getters

    /**
     Returns the distance of the eq search
     @return distance of the eq search
    */
    public int getDistance() {
        return this.distance;
    }

    /**
     Returns the minmag of the eq search
     @return minmag of the eq search
    */
    public int getMinmag() {
        return this.minmag;
    }

    /**
     Returns the lat of the eq search
     @return lat of the eq search
    */
    public double getLat() {
        return this.lat;
    }

    /**
     Returns the lon of the eq search
     @return lon of the eq search
    */
    public double getLon() {
        return this.lon;
    }

    /**
     Returns the location of the eq search
     @return location of the eq search
    */
    public String getLocation() {
        return this.location;
    }
    
    // Setters

    /**
     Sets the distance of the eq search
     @param distance distance of eq search
     */
    public void setDistance(int distance) {
        this.distance = distance;
    }

    /**
     Sets the minmag of the eq search
     @param minmag minmag of eq search
     */
    public void setMinmag(int minmag) {
        this.minmag = minmag;
    }

    /**
     Sets the lat of the eq search
     @param lat lat of eq search
     */
    public void setLat(double lat) {
        this.lat = lat;
    }

    /**
     Sets the lon of the eq search
     @param lon long of eq search
     */
    public void setLon(double lon) {
        this.lon = lon;
    }

    /**
     Sets the location of the eq search
     @param location location of eq search
     */
    public void setLocation(String location) {
        this.location = location;
    }
}