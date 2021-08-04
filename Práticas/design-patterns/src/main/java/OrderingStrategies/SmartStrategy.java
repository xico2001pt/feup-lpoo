package OrderingStrategies;

import Bars.StringBar;
import StringTransformers.StringDrink;
import StringTransformers.StringRecipe;

import java.util.ArrayList;
import java.util.List;

public class SmartStrategy implements OrderingStrategy {
    private List<StringBar> bars;
    private List<StringRecipe> recipes;
    private List<StringDrink> drinks;

    public SmartStrategy() {
        this.bars = new ArrayList<>();
        this.recipes = new ArrayList<>();
        this.drinks = new ArrayList<>();
    }
    @Override
    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar) {
        if (bar.isHappyHour()) {
            bar.order(drink, recipe);
        } else {
            this.bars.add(bar);
            this.recipes.add(recipe);
            this.drinks.add(drink);
        }
    }

    @Override
    public void happyHourStarted(StringBar bar) {
        for (int i = 0; i < bars.size(); ++i) {
            if (bar == bars.get(i)) {
                bar.order(drinks.get(i), recipes.get(i));
            }
        }
    }

    @Override
    public void happyHourEnded(StringBar bar) {
        this.bars.clear();
        this.recipes.clear();
        this.drinks.clear();
    }
}
