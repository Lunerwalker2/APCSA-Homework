public class SodaCan {


    private double height;
    private double diameter;

    public SodaCan(double height, double diameter){
        this.height = height;
        this.diameter = diameter;
    }

    /**
     * Returns the volume of the soda can.
     * @return The volume of the soda can
     */
    public double getVolume(){
        return Math.PI * Math.pow(diameter/2, 2) * height;
    }

    /**
     * Returns the surface area of the soda can.
     * @return The surface area of the soda can
     */
    public double getSurfaceArea(){
        return 2*(Math.PI * Math.pow(diameter/2, 2)) + ((Math.PI*(diameter/2))*height);
    }
}
