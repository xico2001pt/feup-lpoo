package Objects.Shapes.AreaShapes;

public class Triangle implements AreaShape {
    private double baseSize;
    private double height;

    public Triangle(double baseSize, double height) {
        this.baseSize = baseSize;
        this.height = height;
    }

    public double getBaseSize() {
        return baseSize;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double getArea() {
        return this.height * this.baseSize / 2;
    }

    public void setBaseSize(double baseSize) {
        this.baseSize = baseSize;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return this.baseSize == triangle.getBaseSize() && this.height == triangle.getHeight();
    }

    @Override
    public void draw() {
        System.out.println("Triangle");
    }
}
