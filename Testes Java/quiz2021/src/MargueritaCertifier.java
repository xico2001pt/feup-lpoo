public class MargueritaCertifier extends PizzaCertifier {
    @Override
    public boolean isCertified(Pizza pizza) {
        Ingredient tomato = new Ingredient("Tomato");
        Ingredient basil = new Ingredient("Basil");
        Ingredient mozzarella = new Ingredient("Mozzarella");

        if (pizza.getIngredientCount() != 3) return false;

        return pizza.contains(tomato) && pizza.contains(basil) && pizza.contains(mozzarella);
    }
}
