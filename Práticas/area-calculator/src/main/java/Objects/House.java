package Objects;

public class House implements HasArea {
    public double area;

    public House(double area) {
        this.area = area;
    }

    @Override
    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        House house = (House) o;
        return this.area == house.getArea();
    }
}
