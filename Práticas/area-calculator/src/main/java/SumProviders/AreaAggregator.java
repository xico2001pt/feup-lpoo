package SumProviders;

import Objects.HasArea;
import SumProviders.SumProvider;

import java.util.ArrayList;
import java.util.List;

public class AreaAggregator implements SumProvider {
    private List<HasArea> hasAreaShapes = new ArrayList<>();

    public void addArea(HasArea hasArea) {
        hasAreaShapes.add(hasArea);
    }

    public double sum() {
        double sum = 0;
        for (HasArea hasArea : hasAreaShapes) {
            sum += hasArea.getArea();
        }
        return sum;
    }
}
