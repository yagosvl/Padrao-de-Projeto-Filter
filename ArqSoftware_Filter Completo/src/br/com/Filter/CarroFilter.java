package br.com.Filter;

import java.util.ArrayList;
import java.util.List;

import br.com.control.Automovel;

public class CarroFilter implements Filter{
	
	public List<Automovel> doFilter(List<Automovel> autos) {
		
		List<Automovel> carros = new ArrayList<Automovel>();
		if(autos != null){
			for (Automovel automovel : autos) {
				if(automovel.getTipo().equalsIgnoreCase("carro")){
					carros.add(automovel);
				}
			}
		}
		return carros;
		
	}

}
