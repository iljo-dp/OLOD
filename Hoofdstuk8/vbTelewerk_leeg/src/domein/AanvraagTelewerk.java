package domein;

import java.util.List;
import java.util.ArrayList;

import utils.Weekdag;

/* ===== De klasse AanvraagTelewerk na code generatie uit VP ===== */
public class AanvraagTelewerk {

	private final String naam;
	private List<Weekdag> dagenThuiswerk;

	private static final int MIN_AANTAL_TEKENS_NAAM = 2;
	private static final int MAX_AANTAL_DAGEN_TELEWERK = 3;
	private static final Weekdag VERBODEN_TELEWERK_DAG = Weekdag.MAANDAG;


	public AanvraagTelewerk(String naam) {
		// TODO - implement AanvraagTelewerk.AanvraagTelewerk
		throw new UnsupportedOperationException();
	}

	private void controleerNaam(String naam) {
		// TODO - implement AanvraagTelewerk.controleerNaam
		throw new UnsupportedOperationException();
	}

	public void voegDagToe(Weekdag dag) {
		// TODO - implement AanvraagTelewerk.voegDagToe
		throw new UnsupportedOperationException();
	}

	public boolean controleerVoorVerzenden() {
		// TODO - implement AanvraagTelewerk.controleerVoorVerzenden
		throw new UnsupportedOperationException();
	}

	public String getNaam() {
		return this.naam;
	}

	public List<Weekdag> getDagenThuiswerk() {
		return dagenThuiswerk;
	}
}
