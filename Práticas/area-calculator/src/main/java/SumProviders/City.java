package SumProviders;

import Objects.House;

import java.util.ArrayList;
import java.util.List;

public class City implements SumProvider {
    private List<House> houses;

    public City() {
        this.houses = new ArrayList<>();
    }

    public City(List<House> houses) {
        this.houses = houses;
    }

    public double sum() {
        double areaSum = 0;
        for (House house : houses)
            areaSum += house.getArea();
        return areaSum;
    }
}
