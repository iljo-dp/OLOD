package domein;

import persistentie.RekeningMapper;

import java.util.List;

public class RekeningRepository
{
	//TODO attributen + constructor

	private List<Rekening> rekeningen;
	public List<Rekening> getRekeningen()
	{
		return rekeningen;
	}
	public RekeningRepository() {
		RekeningMapper r = new RekeningMapper();
		rekeningen = r.geefRekeningen();
	}
	public void wijzigRekeningen()
	{
		for (Rekening r : rekeningen)
		{
			if (r instanceof SpaarRekening){
				double rente = r.getSaldo() * SpaarRekening.getAangroeiIntrest() / 100;
				r.stortOp(rente);
			}
			else {
				if (r instanceof ZichtRekening zr){
					zr.setMaxKredietOnderNul(zr.getMaxKredietOnderNul()-10);
				}
			}
		}
	}
}

