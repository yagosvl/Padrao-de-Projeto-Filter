package br.com.Tela;

import java.util.ArrayList;
import java.util.List;



//import br.com.Filter.*;
import br.com.control.Automovel;
import br.com.control.FabricaAutomovel;
import br.com.control.IF_FabricaAutomovel;

public class FilterDemo {

	public static void main(String[] args) {
		
		List<Automovel> veiculos = new ArrayList<Automovel>();
		IF_FabricaAutomovel fabrica = new FabricaAutomovel();
		
		veiculos.add(fabrica.criaAutomovel(FabricaAutomovel.MOTO, FabricaAutomovel.ALCOOL));
		veiculos.add(fabrica.criaAutomovel(FabricaAutomovel.MOTO, FabricaAutomovel.GASOLINA));
		veiculos.add(fabrica.criaAutomovel(FabricaAutomovel.CARRO, FabricaAutomovel.ALCOOL));
		veiculos.add(fabrica.criaAutomovel(FabricaAutomovel.MOTO, FabricaAutomovel.ALCOOL));
		veiculos.add(fabrica.criaAutomovel(FabricaAutomovel.CARRO, FabricaAutomovel.GASOLINA));
		veiculos.add(fabrica.criaAutomovel(FabricaAutomovel.CARRO, FabricaAutomovel.GASOLINA));
		veiculos.add(fabrica.criaAutomovel(FabricaAutomovel.MOTO, FabricaAutomovel.ALCOOL));
		
		System.out.println("************** Veiculos a base de Alcool ************************");
		for(Automovel automovel : veiculos){
			if(automovel.getCombustivel().equalsIgnoreCase("Alcool")){
				System.out.println("Veiculo: " + automovel.getNome() + " Combustivel: " +automovel.getCombustivel()+ " Tipo: " +automovel.getTipo());
	         }
		}
		
		System.out.println("************** Veiculos a base de Gasolina **********************");
		for(Automovel automovel : veiculos){
			if(automovel.getCombustivel().equalsIgnoreCase("Gasolina")){
				System.out.println("Veiculo: " + automovel.getNome() + " Combustivel: " +automovel.getCombustivel()+ " Tipo: " +automovel.getTipo());
	         }
		}
		
		System.out.println("************** Carros ************************");
		for(Automovel automovel : veiculos){
			if(automovel.getTipo().equalsIgnoreCase("Carro")){
				System.out.println("Veiculo: " + automovel.getNome() + " Combustivel: " +automovel.getCombustivel()+ " Tipo: " +automovel.getTipo());
	         }
		}
		
		System.out.println("************** Carros exclusivamente a base de Gasolina ************************");
		for(Automovel automovel : veiculos){
			if( (automovel.getCombustivel().equalsIgnoreCase("Gasolina") ) && ( automovel.getTipo().equalsIgnoreCase("Carro") ) ){
				System.out.println("Veiculo: " + automovel.getNome() + " Combustivel: " +automovel.getCombustivel()+ " Tipo: " +automovel.getTipo());
	         }
		}
		
	}
	/*
	public static void printResults(List<Automovel> autos){
		for(Automovel automovel : autos){
			System.out.println("Veiculo: " + automovel.getNome() + " Combustivel: " +automovel.getCombustivel()+ " Tipo: " +automovel.getTipo());
		}
	}
	*/

}
