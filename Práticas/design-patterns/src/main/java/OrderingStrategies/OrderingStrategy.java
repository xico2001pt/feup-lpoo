package OrderingStrategies;

import Bars.StringBar;
import StringTransformers.StringDrink;
import StringTransformers.StringRecipe;

public interface OrderingStrategy {
    void wants(StringDrink drink, StringRecipe recipe, StringBar bar);
    void happyHourStarted(StringBar bar);
    void happyHourEnded(StringBar bar);
}
