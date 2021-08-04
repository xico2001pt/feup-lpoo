import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Concert {
    private String city;
    private String country;
    private String date;
    private List<Act> acts;
    private int ticketsSold;

    public Concert(String city, String country, String date) {
        this.city = city;
        this.country = country;
        this.date = date;
        this.acts = new ArrayList<>();
        this.ticketsSold = 0;
    }

    public String getCity() {
        return this.city;
    }

    public String getCountry() {
        return this.country;
    }

    public String getDate() {
        return this.date;
    }

    public List<Act> getActs() {
        return this.acts;
    }

    public int getTicketsSold() {
        return ticketsSold;
    }

    public int sellTicket() {
        this.ticketsSold += 1;
        return this.ticketsSold;
    }

    public void addAct(Act act) {
        this.acts.add(act);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Concert concert = (Concert) o;
        return city.equals(concert.city) && country.equals(concert.country) && date.equals(concert.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, country, date);
    }

    public boolean isValid(Ticket ticket) {
        return ticket.getConcert().equals(this);
    }

    public boolean participates(Artist artist) {
        for (Act act : this.acts) {
            if (act.getClass() != Band.class) {
                if (act.equals(artist))
                    return true;
            }
            else {
                    Band band = (Band) act;
                    if (band.containsArtist(artist))
                        return true;
                }
        }
        return false;
    }
}
