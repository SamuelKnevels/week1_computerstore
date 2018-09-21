package be.pxl.computerstore.hardware;

public class Processor extends ComputerComponent{
    private String vendor;
    private String name;
    private Double price;
    private double clockspeed;
    private static final Double MINIMUMCLOCKSPEED = 0.7;

    public Processor(String vendor, String name, Double price, Double clockspeed) {
        super(vendor, name, price);
        setClockspeed(clockspeed);
    }

    public double getClockspeed() {
        return clockspeed;
    }

    public void setClockspeed(double clockspeed) {
        if (clockspeed < MINIMUMCLOCKSPEED){
            clockspeed = MINIMUMCLOCKSPEED;
        }
        this.clockspeed = clockspeed;
    }
}
