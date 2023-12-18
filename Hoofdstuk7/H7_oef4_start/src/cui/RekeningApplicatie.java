package cui;

import domein.DomeinController;
import dto.RekeningDTO;

import java.util.List;

public class RekeningApplicatie {

	//TODO attribuut + constructor
	private final DomeinController dc;

	public RekeningApplicatie(DomeinController dc){
		this.dc = dc;
	}
	public void werkenMetRekeningen()
	{
		List<RekeningDTO> rekeningDTOs = dc.geefRekeningDTOs();
		for (RekeningDTO dto : rekeningDTOs){
			System.out.printf("%S %d op naam van %S heeft saldo van %.2f", dto.soort()=='S'? "Spaarrekening" : "ZichtRekening", dto.rekeningnummer(), dto.houder(), dto.saldo());
			if (dto.soort() == 'S'){
				System.out.printf("Met aangroeiIntrest %.2f%n", dto.aangroeiIntrest());
			}
			else{
				System.out.printf("Met een maxkrediet van%.2f%n", dto.maxKredietOnderNul());
			}
		}
	}
}
