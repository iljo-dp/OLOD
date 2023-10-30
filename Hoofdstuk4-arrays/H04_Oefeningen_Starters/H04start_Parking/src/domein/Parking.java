package domein;

public class Parking {
	private String[] nummerplaten = new String[5];

	public int parkeer(String nummerplaat) {
		if (nummerplaat == null || nummerplaat.trim().isBlank() || nummerplaat.length() < 3 || nummerplaat.length() > 9) {
			return -1;
		}

		for (int i = 0; i < nummerplaten.length; i++) {
			if (nummerplaten[i] == null) {
				nummerplaten[i] = nummerplaat;
				return i;
			}
		}

		// If there are no free spots, return -1
		return -1;
	}

	public int geefAantalVrijePlaatsen() {
		int aantalVrij = 0;
		for (String np : nummerplaten) {
			if (np == null) {
				aantalVrij++;
			}
		}
		return aantalVrij;
	}

	public String toString() {
		StringBuilder plaatsen = new StringBuilder();
		for (int i = 0; i < nummerplaten.length; i++) {
			plaatsen.append(String.format("%12d", i));
		}
		plaatsen.append("\n");
		for (String np : nummerplaten) {
			plaatsen.append(String.format("%12s", np == null ? "--vrij--" : np));
		}
		return plaatsen.toString();
	}

	public boolean verlaat(String nummerplaat) {
		for (int i = 0; i < nummerplaten.length; i++) {
			if (nummerplaten[i] != null && nummerplaten[i].equals(nummerplaat)) {
				nummerplaten[i] = null;
				return true;
			}
		}
		return false;
	}
}