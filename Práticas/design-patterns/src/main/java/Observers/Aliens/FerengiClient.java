package Observers.Aliens;

import OrderingStrategies.OrderingStrategy;
import OrderingStrategies.SmartStrategy;

public class FerengiClient extends AlienClient {
    @Override
    protected OrderingStrategy createOrderingStrategy() {
        return new SmartStrategy();
    }
}
