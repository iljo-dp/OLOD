package domein;

import persistentie.RekeningMapper;

import java.util.List;

public class RekeningRepository {
    private final RekeningMapper rm;
    private List<Rekening> rekeningen;

    public RekeningRepository() {
        rm = new RekeningMapper();
        rekeningen = rm.geefRekeningen();
    }
    public void wijzigRekeningen(){
        for (Rekening r : rekeningen) {
            if (r instanceof SpaarRekening){
                double rente = r.getSaldo() * SpaarRekening.getAangroeiIntrest() / 100;
                r.stortOp(rente);
            }
            else {
                if (r instanceof ZichtRekening zr){
                    double maxKredietVoorVerminderen = zr.getMaxKredietOnderNul();
                    zr.setMaxKredietOnderNul(maxKredietVoorVerminderen - 10);
                }
            }
        }
    }
}

