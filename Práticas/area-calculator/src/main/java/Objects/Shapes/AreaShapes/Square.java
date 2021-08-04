package Objects.Shapes.AreaShapes;

public class Square implements AreaShape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public double getArea() {
        return Math.pow(this.side, 2);
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return this.side == square.getSide();
    }

    @Override
    public void draw() {
        System.out.println("Square");
    }
}
