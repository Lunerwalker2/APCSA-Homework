public class MobileApp {


    private String name;
    private String type;
    private double cost;


    public MobileApp(String aName, String aType, double aCost){
        name = aName;
        type = aType;
        cost = aCost;
    }

    /**
     * Returns the name of the app
     * @return The name
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the cost of the app
     * @return The cost
     */
    public double getCost() {
        return cost;
    }

    /**
     * Returns the type of the app
     * @return The type
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the name of the app
     * @param newName The new name
     */
    public void setName(String newName) {
        this.name = newName;
    }

    /**
     * Sets the type of the app
     * @param newType The new type
     */
    public void setType(String newType) {
        this.type = newType;
    }

    /**
     * Sets the cost of the app
     * @param newCost The new cost
     */
    public void setCost(double newCost) {
        this.cost = newCost;
    }
}
