import java.util.ArrayList;
import java.util.List;

public class MediumPizza implements Pizza {
    private List<Ingredient> ingredients;
    private double price;

    public MediumPizza() {
        this.ingredients = new ArrayList<>();
        this.price = 0;
    }

    @Override
    public boolean addIngredient(Ingredient ingredient) {
        if (this.contains(ingredient)) return false;
        return this.ingredients.add(ingredient);
    }

    @Override
    public int getIngredientCount() {
        return this.ingredients.size();
    }

    public boolean contains(Ingredient ingredient) {
        for (Ingredient ingredient1 : this.ingredients) {
            if (ingredient1.equals(ingredient))
                return true;
        }
        return false;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public void setPrice(double v) {
        this.price = v;
    }
}
