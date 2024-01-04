package domein;

import persistentie.RekeningMapper;

import java.util.List;

public class RekeningRepository
{
	private List<Rekening> rekeningen;
	private final RekeningMapper rm;
	public List<Rekening> getRekeningen()
	{
		return rm.geefRekeningen();
	}
	public RekeningRepository()
	{
		rm = new RekeningMapper();
	}
	public void wijzigRekeningen()
	{
		for (Rekening r : rm.geefRekeningen())
		{
			if (r instanceof SpaarRekening sr){
				sr.stortOp(r.getSaldo() * sr.getAangroeiIntrest() / 100);
			}
			else if (r instanceof ZichtRekening zr){
				zr.setMaxKredietOnderNul(zr.getMaxKredietOnderNul()-10);
			}
		}
	}
}

