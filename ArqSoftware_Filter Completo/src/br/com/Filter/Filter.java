package br.com.Filter;

import java.util.List;

import br.com.control.Automovel;

public interface Filter {
	
	public List<Automovel> doFilter(List<Automovel> autos);

}