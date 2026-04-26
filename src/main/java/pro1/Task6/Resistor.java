package pro1.Task6;

public class Resistor
{
    private double resistance;
    public Resistor(double resistance) {
        this.resistance = resistance;
    }
    public double getCurrent(double voltage) {
        return voltage / resistance;
    }
}