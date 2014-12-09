package br.com.Filter;

import java.util.ArrayList;
import java.util.List;

import br.com.control.Automovel;
import br.com.control.Carro;

public class AlcoolFilter  implements Filter{

	@Override
	public List<Automovel> doFilter(List<Automovel> autos) {
		
		List<Automovel> AutomovelsAlcool = new ArrayList<Automovel>();
		if(autos != null){
			for (Automovel automovel : autos) {
				if(automovel.getCombustivel().equalsIgnoreCase("Alcool")){
					AutomovelsAlcool.add(automovel);
				}
			}
		}
		return AutomovelsAlcool;
	}
}
