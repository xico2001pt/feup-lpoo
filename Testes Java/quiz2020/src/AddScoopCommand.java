public class AddScoopCommand extends Command {
    private Flavor flavor;

    public AddScoopCommand(Flavor flavor) {
        super();
        this.flavor = flavor;
    }

    @Override
    public void execute(Icecream icecream) {
        icecream.addScoop(flavor);
    }
}
