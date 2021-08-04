public class Party extends Event {
    public Party(String title, String date, String description) {
        super(title, date, description);
    }

    public void addEvent(Event e) {
        for (Person p : e.audience)
            this.audience.add(p);
    }
}
