package domein;

import java.time.LocalDate;
import java.util.List;

public class Trekking {

    private String naam;
    private LocalDate datum;
    private List<Integer> nummers;

    public Trekking(String naam, LocalDate datum, List<Integer> nummers) {
        this.naam = naam;
        this.datum = datum;
        this.nummers = nummers;
    }
}