package hello;

public class EqSearch {
    private int distance;
    private int minmag;

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

    // Setters

    /**
     Sets the distance of the eq search
     @param distance distance of eq search
     */
    public void setDistance() {
        this.distance = distance;
    }

    /**
     Sets the minmag of the eq search
     @param minmag minmag of eq search
     */
    public void setMinmag() {
        this.minmag = minmag;
    }
}