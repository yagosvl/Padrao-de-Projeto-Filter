package br.com.Tela;

import java.util.ArrayList;
import java.util.List;



import br.com.Filter.*;
import br.com.control.Automovel;
import br.com.control.FabricaAutomovel;
import br.com.control.IF_FabricaAutomovel;

public class FilterDemo {

	public static void main(String[] args) {
		
		List<Automovel> veiculos = new ArrayList<Automovel>();
		IF_FabricaAutomovel fabrica = new FabricaAutomovel();
		
		veiculos.add(fabrica.criaAutomovel(1, 3));
		veiculos.add(fabrica.criaAutomovel(1, 2));
		veiculos.add(fabrica.criaAutomovel(0, 3));
		veiculos.add(fabrica.criaAutomovel(1, 3));
		veiculos.add(fabrica.criaAutomovel(0, 2));
		veiculos.add(fabrica.criaAutomovel(0, 2));
		veiculos.add(fabrica.criaAutomovel(1, 3));
		
		Filter af = new AlcoolFilter();
		Filter gf = new GasolinaFilter();
		Filter cf = new CarroFilter();
		Filter combinado = new FiltroCombinado(gf, cf);
		
		System.out.println("************** Veiculos a base de Alcool ************************");
		printResults(af.doFilter(veiculos));
		
		System.out.println("************** Veiculos a base de Gasolina **********************");
		printResults(gf.doFilter(veiculos));
		
		System.out.println("************** Carros ************************");
		printResults(cf.doFilter(veiculos));
		
		System.out.println("************** Carros exclusivamente a base de Gasolina ************************");
		printResults(combinado.doFilter(veiculos));
		
	}
	
	public static void printResults(List<Automovel> autos){
		for(Automovel automovel : autos){
			System.out.println("Veiculo: " + automovel.getNome() + " Combustivel: " +automovel.getCombustivel()+ " Tipo: " +automovel.getTipo());
		}
	}

}
