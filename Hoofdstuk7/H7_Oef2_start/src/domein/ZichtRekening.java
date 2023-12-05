package domein;

public class ZichtRekening extends Rekening {
	private double maxKredietOnderNul;
	
	public double getMaxKredietOnderNul() {
		return maxKredietOnderNul;
	}
	
	public final void setMaxKredietOnderNul(double maxKredietOnderNul) {
		if(maxKredietOnderNul> 0 || maxKredietOnderNul > /*super.*/getSaldo())
			throw new IllegalArgumentException("Maxkrediet moet negatief zijn en "
					+ "minder dan mijn huidig saldo");
		this.maxKredietOnderNul = maxKredietOnderNul;
	}
	
	public ZichtRekening(long rekeningNr, String houder, double maxKredietOnderNul) {
		super(rekeningNr, houder);
		setMaxKredietOnderNul(maxKredietOnderNul);
	}

	@Override
	public boolean haalAf(double bedrag) {
		if(getSaldo()- bedrag >= maxKredietOnderNul )
			return super.haalAf(bedrag);	// super. is hier verplicht!
		return false;
	}
	
	@Override
	public String toString() {
		return String.format("%s Max krediet onder nul = %.2f", 
				super.toString(), maxKredietOnderNul); // super. is hier verplicht!
	}
}
