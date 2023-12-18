package domein;

import dtos.VerplaatsingDTO;

import java.util.ArrayList;
import java.util.List;

public class Domeincontroller {
    private final VerplaatsingRepository verplaatsRepo;
    public Domeincontroller(){
        verplaatsRepo = new VerplaatsingRepository();
    }

    public double geefKostenVerplaatsing(int index){
        return verplaatsRepo.geefKostenVerplaatsing(index);
    }
    public double geefAantalKmVerplaatsing(){
        return verplaatsRepo.geefTotaleKosten();
    }
    public List<VerplaatsingDTO> geefVerplaatsingen(){
        List<VerplaatsingDTO> uitvoer = new ArrayList<>();
        Verplaatsing[] vpn = verplaatsRepo.getVpn();
        for (Verplaatsing verplaatsing : vpn) {
            if (verplaatsing instanceof VerplaatsingPerAuto vAuto){
                uitvoer.add(new VerplaatsingDTO(vAuto.getVan(), vAuto.getNaar(), vAuto.berekenPrijs(), 0, false, false, 'A'));
            }
            else if (verplaatsing instanceof VerplaatsingPerBusTram vBus){
                uitvoer.add(new VerplaatsingDTO(vBus.getVan(), vBus.getNaar(), vBus.berekenPrijs(), vBus.getLijnnr(), vBus.isBus(), vBus.isStadslijn(), 'B'));
            }
        }
        return uitvoer;

    }
}

