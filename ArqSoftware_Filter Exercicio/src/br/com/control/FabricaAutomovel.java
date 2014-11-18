package br.com.control;


public class FabricaAutomovel implements IF_FabricaAutomovel{
	
	public static final int CARRO = 0;
	public static final int MOTO = 1;
	public static final int GASOLINA = 2;
	public static final int ALCOOL = 3;

	@Override
	public Automovel criaAutomovel(int tipo, int combustivel) {
		if(FabricaAutomovel.CARRO == tipo && FabricaAutomovel.GASOLINA == combustivel){
			return new Carro("Palio", "Gasolina", "Carro");
		}else if(FabricaAutomovel.CARRO == tipo && FabricaAutomovel.ALCOOL == combustivel){
			return new Carro("Palio", "Alcool", "Carro");
		}else if(FabricaAutomovel.MOTO == tipo && FabricaAutomovel.ALCOOL == combustivel){
			return new Moto("Hayabusa", "Alcool", "Moto");
		}else if(FabricaAutomovel.MOTO == tipo && FabricaAutomovel.GASOLINA == combustivel){
			return new Moto("Hayabusa", "Gasolina", "Moto");
		}else return null;
	}

}
