package pro1.Task2;

public class FloatCircle
{
    private final float radius;

    public FloatCircle(float radius) {
        this.radius = radius;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }
}