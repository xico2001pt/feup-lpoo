package StringTransformers;

public class StringCaseChanger implements StringTransformer {
    @Override
    public void execute(StringDrink drink) {
        StringBuilder builder = new StringBuilder();
        char aux;
        for (int i = 0; i < drink.getText().length(); ++i) {
            aux = (Character.isLowerCase(drink.getText().charAt(i)) ? Character.toUpperCase(drink.getText().charAt(i)) : Character.toLowerCase(drink.getText().charAt(i)));
            builder.append(aux);
        }
        drink.setText(builder.toString());
    }

    @Override
    public void undo(StringDrink drink) {
        StringBuilder builder = new StringBuilder();
        char aux;
        for (int i = 0; i < drink.getText().length(); ++i) {
            aux = (Character.isLowerCase(drink.getText().charAt(i)) ? Character.toUpperCase(drink.getText().charAt(i)) : Character.toLowerCase(drink.getText().charAt(i)));
            builder.append(aux);
        }
        drink.setText(builder.toString());
    }
}
