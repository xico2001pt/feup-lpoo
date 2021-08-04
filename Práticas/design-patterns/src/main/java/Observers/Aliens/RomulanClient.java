package Observers.Aliens;

import OrderingStrategies.ImpatientStrategy;
import OrderingStrategies.OrderingStrategy;

public class RomulanClient extends AlienClient {
    @Override
    protected OrderingStrategy createOrderingStrategy() {
        return new ImpatientStrategy();
    }
}
