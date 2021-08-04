public class MargueritaRecipe extends Recipe {
    @Override
    public Pizza makeMediumPizza() {
        Pizza result = new MediumPizza();
        result.addIngredient(new Ingredient("Mozzarella"));
        result.addIngredient(new Ingredient("Basil"));
        result.addIngredient(new Ingredient("Tomato"));
        return result;
    }
}
