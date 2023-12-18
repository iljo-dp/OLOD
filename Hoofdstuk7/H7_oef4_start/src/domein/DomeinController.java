package domein;

import dto.RekeningDTO;

import java.util.ArrayList;
import java.util.List;

public class DomeinController {

    //TODO attribuut + constructor
	private final RekeningRepository rr;

	public DomeinController(){
		rr = new RekeningRepository();
	}
	public List<RekeningDTO> geefRekeningDTOs()
	{
		// wijzig de lijst van de Repository en zet het daarna om naar een lijst van DTO's
		List<RekeningDTO> uitvoer = new ArrayList<>();
		rr.wijzigRekeningen();
		List<Rekening> rekening = rr.getRekeningen();
		for (Rekening r : rekening){
			if (r instanceof SpaarRekening){
				RekeningDTO dto = new RekeningDTO(r.getRekeningNr(), r.getSaldo(), r.getHouder(), 0, SpaarRekening.getAangroeiIntrest(), 'S' );
				uitvoer.add(dto);
			}
			else if (r instanceof ZichtRekening zr){
				RekeningDTO dto = new RekeningDTO(zr.getRekeningNr(), zr.getSaldo(), zr.getHouder() ,zr.getMaxKredietOnderNul(), 0, 'Z' );
				uitvoer.add(dto);
			}
		}
		return uitvoer;
	}
}
