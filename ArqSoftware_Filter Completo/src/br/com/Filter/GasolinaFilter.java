package br.com.Filter;

import java.util.ArrayList;
import java.util.List;

import br.com.control.Automovel;
import br.com.control.Automovel;

public class GasolinaFilter  implements Filter{

	@Override
	public List<Automovel> doFilter(List<Automovel> autos) {
		
		List<Automovel> AutomovelsGasolina = new ArrayList<Automovel>();
		if(autos != null){
			for (Automovel automovel : autos) {
				if(automovel.getCombustivel().equalsIgnoreCase("gasolina")){
					AutomovelsGasolina.add(automovel);
				}
			}
		}
		return AutomovelsGasolina;
	}
}
