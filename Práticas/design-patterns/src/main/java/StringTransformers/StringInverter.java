package StringTransformers;

public class StringInverter implements StringTransformer {
    @Override
    public void execute(StringDrink drink) {
        StringBuilder builder = new StringBuilder(drink.getText());
        drink.setText(builder.reverse().toString());
    }

    @Override
    public void undo(StringDrink drink) {
        StringBuilder builder = new StringBuilder(drink.getText());
        drink.setText(builder.reverse().toString());
    }
}
