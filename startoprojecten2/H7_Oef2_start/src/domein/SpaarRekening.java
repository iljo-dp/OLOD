package domein;

public class SpaarRekening extends Rekening{
	//Make this code based on the super class and on the test class
	 private static double aangroeiIntrest;
	
	public static double getAangroeiIntrest() {
		return aangroeiIntrest;
	}
	public static void setAangroeiIntrest(double aangroeiIntrest) {
		if (aangroeiIntrest < 0)
			throw new IllegalArgumentException("Aangroeiintrest moet meer dan 0 zijn");
		SpaarRekening.aangroeiIntrest = aangroeiIntrest;
	}
	public SpaarRekening(long rekeningNr, String houder) {
		super(rekeningNr, houder);
	}
	@Override
	public boolean haalAf(double bedrag)
	{
		if (bedrag <= getSaldo())
		{
			return super.haalAf(bedrag);
		}
		
		return false;
	}
	
}
