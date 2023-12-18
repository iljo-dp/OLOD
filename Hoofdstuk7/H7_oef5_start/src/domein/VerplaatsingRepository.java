package domein;

import persistentie.VerplaatsingMapper;

public class VerplaatsingRepository {
    private final Verplaatsing[] vpn;
    private final VerplaatsingMapper vm;

    public VerplaatsingRepository() {
        vm = new VerplaatsingMapper();
        vpn = vm.geefVerplaatsingen();
    }

    public Verplaatsing[] getVpn() {
        return vpn;
    }
    public double geefKostenVerplaatsing(int index) {
        Verplaatsing v = vpn[index];
        if (v instanceof VerplaatsingPerAuto vAuto) {
            return vAuto.berekenPrijs();
        } else if (v instanceof VerplaatsingPerBusTram vTrein) {
            return vTrein.berekenPrijs();
        } else {
            return 0;
        }


    }
    public double geefTotaleKosten() {
        double totaal = 0;
        for (int i = 0; i < vpn.length; i++) {
            totaal += geefKostenVerplaatsing(i);
        }
        return totaal;
    }
}
