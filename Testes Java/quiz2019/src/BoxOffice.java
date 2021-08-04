import java.util.ArrayList;
import java.util.List;

public class BoxOffice {
    public static List<Ticket> buy(Concert concert, int amount) throws InvalidTicket {
        List<Ticket> result = new ArrayList<>();
        for (int i = 0; i < amount; ++i)
            result.add(new Ticket(concert.sellTicket(), concert));
        return result;
    }
}
