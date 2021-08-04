package StringTransformers;

public class StringReplacer implements StringTransformer {
    private char fromChar;
    private char toChar;

    public StringReplacer(char fromChar, char toChar) {
        this.fromChar = fromChar;
        this.toChar = toChar;
    }

    @Override
    public void execute(StringDrink drink) {
        drink.setText(drink.getText().replace(fromChar, toChar));
    }

    @Override
    public void undo(StringDrink drink) {
        drink.setText(drink.getText().replace(toChar, fromChar));
    }
}
