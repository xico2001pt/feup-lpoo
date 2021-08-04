public class Speaker extends Person {
    protected int fee;

    public Speaker(String name) {
        this(name, 0);
    }

    public Speaker(String name, int age) {
        super(name, age);
        this.fee = 0;
    }

    public int getFee() {
        return fee;
    }

    @Override
    public String toString() {
        return "Speaker " + this.name + " has a fee value of " + this.fee + ".";
    }
}
