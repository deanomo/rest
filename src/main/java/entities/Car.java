package entities;

/**
 * Created by bursode on 11/1/2017.
 */
public class Car {
    private String VIN;
    private String color;
    private Integer miles;

    public String getVIN() {
        return VIN;
    }
    public void setVIN(final String inVin) {
        VIN = inVin;
    }

    public String getColor() {
        return color;
    }
    public void setColor(final String inColor) {
        color = inColor;
    }

    public Integer getMiles() {
        return miles;
    }
    public void setMiles(final Integer inMiles) {
        miles = inMiles;
    }
}
