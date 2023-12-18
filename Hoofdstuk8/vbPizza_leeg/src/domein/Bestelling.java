package domein;

public class Bestelling {
	private int aantal;

	private static final int MIN_AANTAL = 1;
	private static final int MAX_AANTAL = 10;
	public Bestelling(int aantal) {
		setAantal(aantal);
	}

	private void setAantal(int aantal) {
		if (aantal < MIN_AANTAL || aantal > MAX_AANTAL)
			throw new IllegalArgumentException(String.format("Aantal moet pâssen in het interval [%d, %d]", MIN_AANTAL, MAX_AANTAL));
		this.aantal = aantal;
	}

	public int getAantal() {
		return aantal;
	}

	public boolean geeftRechtOpKorting() {
		if (aantal >= 5)
			return true;
		else
			return false;
	}
}
