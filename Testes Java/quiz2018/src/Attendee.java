public class Attendee extends Person {
    protected boolean hasPaid;
    public Attendee(String name) {
        super(name);
        hasPaid = false;
    }

    public Attendee(String name, int age) {
        super(name, age);
    }

    public boolean hasPaid() {
        return hasPaid;
    }

    @Override
    public String toString() {
        return "Attendee " + this.name + (this.hasPaid ? " has" : " hasn't") + " paid its registration.";
    }
}
