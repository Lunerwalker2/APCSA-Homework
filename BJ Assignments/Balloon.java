/**
 * A class that represents a balloon
 */
public class Balloon {


    private double r;

    /**
     * Constructs a balloon with a radius of 0
     */
    public Balloon(){
        r = 0;
    }

    /**
     * Increases the radius by a given amount
     * @param amount The amount to increase by
     */
    public void inflate(double amount){
        r += amount;
    }

    /**
     * Returns the volume of the balloon
     * @return The volume of the balloon
     */
    public double getVolume(){
        return 4 /3 * Math.PI * r * r * r;
    }
}
