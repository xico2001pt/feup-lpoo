import java.util.Comparator;
import java.util.Objects;
import java.util.TreeSet;

public class Event {
    private String title;
    private String date;
    private String description;
    protected TreeSet<Person> audience;

    public Event(String title) {
        this(title, "");
    }

    public Event(String title, String date) {
        this(title, date, "");
    }

    public Event(String title, String date, String description) {
        this.title = title;
        this.date = date;
        this.description = description;
        this.audience = new TreeSet<>();
    }

    public Event(Event event) {
        this(event.getTitle(), event.getDate(), event.getDescription());
    }

    public String getTitle() {
        return this.title;
    }

    public String getDate() {
        return this.date;
    }

    public String getDescription() {
        return this.description;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return this.title + " is a " + this.description + " and will be held at " + this.date + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return title.equals(event.title) && date.equals(event.date) && description.equals(event.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, date, description);
    }

    public void addPerson(Person person) {
        audience.add(person);
    }

    public int getAudienceCount() {
        return audience.size();
    }
}