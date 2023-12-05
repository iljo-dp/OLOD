package domein;

public class SpaarRekening extends Rekening {
	private static double aangroeiIntrest;
	
	// getter en setter zijn ook static want voor static attribuut!
	public static double getAangroeiIntrest() {
		return aangroeiIntrest;
	}
	// moet final zijn want public!
	public final static void setAangroeiIntrest(double aangroeiIntrest) {
		if(aangroeiIntrest < 0)
			throw new IllegalArgumentException("Aangroeiintrest moet positief zijn");
		SpaarRekening.aangroeiIntrest = aangroeiIntrest;
	}
	
	public SpaarRekening(long rekeningNr, String houder) {
		super(rekeningNr, houder);
	}
	
	@Override
	public boolean haalAf(double bedrag) {
		if(bedrag <= /*super.*/getSaldo()) {
			return super.haalAf(bedrag);	// super. is hier verplicht!
		}
		return false;
	}
	
	@Override
	public String toString() {
		return String.format("%s Aangroeiintrest = %.2f%%",
				super.toString(), aangroeiIntrest);
	}
}
