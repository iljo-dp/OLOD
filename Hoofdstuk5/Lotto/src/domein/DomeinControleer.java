package domein;

import java.security.SecureRandom;
import java.time.LocalDate;
import java.util.List;

public class DomeinControleer {

    private TrekkingRepository trekkingRepo;

    public DomeinControleer() {
        this.trekkingRepo = new TrekkingRepository();
    }

    public void registreerTrekking(String naam, LocalDate datum, List<Integer> nummers) {
        Trekking nieuweTrekking = new Trekking(naam, datum, nummers);
        trekkingRepo.voegTrekkingToe(nieuweTrekking);
    }

}