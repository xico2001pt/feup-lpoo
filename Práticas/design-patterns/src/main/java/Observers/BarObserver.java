package Observers;

import Bars.Bar;

public interface BarObserver {
    void happyHourStarted(Bar bar);
    void happyHourEnded(Bar bar);
}
