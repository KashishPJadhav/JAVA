package MyMath;

public class Trig {
    private double angle;

    public Trig(double angle) {
        this.angle = Math.toRadians(angle); // Convert degrees to radians
    }

    public double getSine() {
        return Math.sin(angle);
    }

    public double getCosine() {
        return Math.cos(angle);
    }

    public double getTangent() {
        return Math.tan(angle);
    }

    public double getSecant() {
        return 1 / Math.cos(angle);
    }

    public double getCosecant() {
        return 1 / Math.sin(angle);
    }

    public double getCotangent() {
        return 1 / Math.tan(angle);
    }
}
