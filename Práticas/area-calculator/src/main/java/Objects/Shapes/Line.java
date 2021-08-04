package Objects.Shapes;

public class Line implements Shape {
    private double lenght;

    public Line(double lenght) {
        this.lenght = lenght;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Line line = (Line) o;
        return this.lenght == line.getLenght();
    }

    @Override
    public void draw() {
        System.out.println("Line");
    }
}
