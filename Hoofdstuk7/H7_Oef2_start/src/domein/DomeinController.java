package domein;

import dtos.RekeningDTO;

import java.util.List;

public class DomeinController {
    RekeningRepository rr;


    public DomeinController() {
        rr = new RekeningRepository();
    }
    public List<RekeningDTO> geefRekeningDTOs() {

    }
}
