package earthquakes.searches;

public class LocSearch {
    private String location;

    // No-arg constructor
    public LocSearch() {
    }

    // Getters

    /**
     Returns the location of the eq search
     @return location of the eq search
    */
    public String getLocation() {
        return this.location;
    }

    // Setters

    /**
     Sets the location of the eq search
     @param location location of eq search
     */
    public void setLocation(String location) {
        this.location = location;
    }
}