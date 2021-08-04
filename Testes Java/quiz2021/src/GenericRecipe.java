import java.util.List;

public class GenericRecipe extends Recipe {
    private List<Ingredient> ingredients;
    public GenericRecipe(List<Ingredient> ingredients) {
        super();
        this.ingredients = ingredients;
    }

    @Override
    public Pizza makeMediumPizza() {
        Pizza result = new MediumPizza();
        for (Ingredient i : this.ingredients) {
            result.addIngredient(i);
        }
        return result;
    }
}
