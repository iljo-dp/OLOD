package domein;

public class ZichtRekening extends Rekening{
	private double maxKredietOnderNul;
	
	public double getMaxKredietOnderNul() {
		return maxKredietOnderNul;
	}
	
	public void setMaxKredietOnderNul(double maxKredietOnderNul) {
		if(maxKredietOnderNul > 0 || getSaldo() < maxKredietOnderNul) {
			throw new IllegalArgumentException("Max krediet onder nul moet negatief zijn");
		}
		this.maxKredietOnderNul = maxKredietOnderNul;
	}
	public ZichtRekening(long rekeningNr, String houder, double maxKredietOnderNul) {
		super(rekeningNr, houder);
		setMaxKredietOnderNul(maxKredietOnderNul);
	}
	@Override
	public boolean haalAf(double bedrag)
	{
		if (getSaldo() - bedrag >= maxKredietOnderNul)
		{
			super.haalAf(bedrag);
			return true;
		}
		else
			return false;
	}
	@Override
	public String toString() {
		return String.format("%s. Max krediet onder nul: %.2f", super.toString(), maxKredietOnderNul);
	}
	
}
