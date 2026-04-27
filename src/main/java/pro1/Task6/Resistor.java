package pro1.Task6;

public class Resistor
{
    private double resistance;
    public Resistor(double resistance) {
        this.resistance = resistance;
    }
    public double getCurrent(double voltage) {
        double result = voltage / resistance;
        if (!Double.isFinite(result)) {
            throw new ResistorException("Result is not a valid number: " + result);
        }
        return result;
    }
    public class ResistorException extends RuntimeException {
        public ResistorException(String message) {
            super(message);
        }
    }
}