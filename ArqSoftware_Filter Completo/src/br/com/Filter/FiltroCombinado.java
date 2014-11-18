package br.com.Filter;

import java.util.List;

import br.com.control.Automovel;

public class FiltroCombinado implements Filter{
	
	private Filter primeiroFiltro;
	private Filter segundoFiltro;
	
	
	public FiltroCombinado(Filter primeiroFiltro, Filter segundoFiltro) {
		super();
		this.primeiroFiltro = primeiroFiltro;
		this.segundoFiltro = segundoFiltro;
	}


	@Override
	public List<Automovel> doFilter(List<Automovel> autos) {
		List<Automovel> primeiraFiltragem = primeiroFiltro.doFilter(autos);
		return segundoFiltro.doFilter(primeiraFiltragem);
	}

}
