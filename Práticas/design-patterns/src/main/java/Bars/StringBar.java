package Bars;

import StringTransformers.StringDrink;
import StringTransformers.StringRecipe;

public class StringBar extends Bar {
    public void order(StringDrink drink, StringRecipe recipe) {
        recipe.mix(drink);
    }
}
