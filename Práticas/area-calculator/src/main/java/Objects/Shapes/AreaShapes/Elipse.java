package Objects.Shapes.AreaShapes;

public class Elipse implements AreaShape {
    private double xRadius;
    private double yRadius;

    public Elipse(double xRadius, double yRadius) {
        this.xRadius = xRadius;
        this.yRadius = yRadius;
    }

    public double getxRadius() {
        return xRadius;
    }

    public double getyRadius() {
        return yRadius;
    }

    @Override
    public double getArea() {
        return Math.PI * this.xRadius * this.yRadius;
    }

    public void setxRadius(double xRadius) {
        this.xRadius = xRadius;
    }

    public void setyRadius(double yRadius) {
        this.yRadius = yRadius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Elipse elipse = (Elipse) o;
        return this.xRadius == elipse.getxRadius() && this.yRadius == elipse.getyRadius();
    }

    @Override
    public void draw() {
        System.out.println("Elipse");
    }
}
