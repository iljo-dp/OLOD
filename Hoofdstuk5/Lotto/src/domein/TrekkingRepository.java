package domein;

import java.util.ArrayList;
import java.util.List;

public class TrekkingRepository {

    private List<Trekking> trekkingen;

    public TrekkingRepository() {
        this.trekkingen = new ArrayList<>();
    }

    public void voegTrekkingToe(Trekking nieuweTrekking) {
        trekkingen.add(nieuweTrekking);
    }
    public void selecteerTrekking(String naam){

    }

}