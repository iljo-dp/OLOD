package domein;
import dto.RekeningDTO;

import java.util.ArrayList;
import java.util.List;
public class DomeinController {

    //TODO attribuut + constructor
	public RekeningRepository rr;
	
	public DomeinController()
	{
		rr = new RekeningRepository();
	}
	public List<RekeningDTO> geefRekeningDTOs()
	{
		List<RekeningDTO> uitvoer = new ArrayList<>();
		rr.wijzigRekeningen();
		List<Rekening> rekening = rr.getRekeningen();
		for (Rekening r : rekening)
		{
			if (r instanceof ZichtRekening zr)
			{
				RekeningDTO dto = new RekeningDTO(zr.getRekeningNr(), zr.getSaldo(), zr.getHouder(), zr.getMaxKredietOnderNul(), '0', 'Z');
				uitvoer.add(dto);
			}
			else if (r instanceof SpaarRekening sr){
				RekeningDTO dto = new RekeningDTO(sr.getRekeningNr(), sr.getSaldo(), sr.getHouder(), '0', sr.getAangroeiIntrest(), 'S');
				uitvoer.add(dto);
			}
		}
		return uitvoer;
	}
}
