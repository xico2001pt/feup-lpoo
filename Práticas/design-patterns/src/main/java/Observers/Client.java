package Observers;

import Bars.StringBar;
import StringTransformers.StringDrink;
import StringTransformers.StringRecipe;

public interface Client extends BarObserver {
    void wants(StringDrink drink, StringRecipe recipe, StringBar bar);
}
