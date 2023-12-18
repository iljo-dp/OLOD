package cui;

import domein.Domeincontroller;
import dtos.VerplaatsingDTO;

import java.util.List;

public class VerplaatsingApplicatie {
    private final Domeincontroller dc;
    public VerplaatsingApplicatie(Domeincontroller dc) {
        this.dc = dc;
    }
    public void start() {
        List<VerplaatsingDTO> dtos = dc.geefVerplaatsingen();
        for (VerplaatsingDTO dto : dtos)
            System.out.printf("Verplaatsing van %s naar %s %s", dto.van(), dto.naar(), dto.soort() == 'A' ? "per auto" : (dto.stadslijn()? "stads" : "  ") + (dto.bus() ? "bus" : "tram"));
            System.out.printf("Kostprijs: %.2f%n", VerplaatsingDTO.geefKostprijs(dto));
        System.out.print("Totale kosten voor alles %.2f", dc.geefVerplaatsingen());
    }
}
