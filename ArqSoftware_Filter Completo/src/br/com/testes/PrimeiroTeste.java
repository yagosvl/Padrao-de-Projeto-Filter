package br.com.testes;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;

import br.com.Filter.AlcoolFilter;
import br.com.Filter.CarroFilter;
import br.com.Filter.Filter;
import br.com.Filter.GasolinaFilter;
import br.com.control.Automovel;
import br.com.control.FabricaAutomovel;
import br.com.control.IF_FabricaAutomovel;

public class PrimeiroTeste extends TestCase{
	List<Automovel> veiculos = new ArrayList<Automovel>();
	IF_FabricaAutomovel fabrica = new FabricaAutomovel();
	
	public PrimeiroTeste(){
		super();
	}

	/*@Before
	 Esse é o novo recurso do JUnit 4;
	 ao invés de extender TestCase e  
	 */
	protected void setUp(){
		
		System.out.println("Inicializando Teste");
		veiculos.add(fabrica.criaAutomovel(FabricaAutomovel.MOTO, FabricaAutomovel.ALCOOL));
		veiculos.add(fabrica.criaAutomovel(FabricaAutomovel.MOTO, FabricaAutomovel.GASOLINA));
		veiculos.add(fabrica.criaAutomovel(FabricaAutomovel.CARRO, FabricaAutomovel.ALCOOL));
	}
	/*@After
	 Esse é o novo recurso do JUnit 4 
	 */
	protected void tearDown(){
		System.out.println("Finalizando Teste");
		veiculos = null;
	}

	@Test
	public void testFiltroGasolina() {
		assertNotNull(veiculos);
		Filter filtro = new GasolinaFilter();
		List<Automovel> resultadoEsperado = new ArrayList<Automovel>();
		resultadoEsperado.add(veiculos.get(1) );
		assertEquals( resultadoEsperado , filtro.doFilter(veiculos) );
	}
	
	@Test
	public void testFiltroAlcool() {
		assertNotNull(veiculos);
		Filter filtro = new AlcoolFilter();
		List<Automovel> resultadoEsperado = new ArrayList<Automovel>();
		resultadoEsperado.add(veiculos.get(0) );
		resultadoEsperado.add(veiculos.get(2) );
		assertEquals( resultadoEsperado , filtro.doFilter(veiculos) );
	}
	
	@Test
	public void testFiltroCarro() {
		assertNotNull(veiculos);
		Filter filtro = new CarroFilter();
		List<Automovel> resultadoEsperado = new ArrayList<Automovel>();
		resultadoEsperado.add(veiculos.get(2) );
		assertEquals( resultadoEsperado , filtro.doFilter(veiculos) );
	}
	
	@Test
	public void testFiltroNull() {
		List<Automovel> param = null;
		Filter filtro = new CarroFilter();
		assertNull(filtro.doFilter(param));
	}
	
	@Test
	public void testFiltroVazio() {
		List<Automovel> param = new ArrayList<Automovel>();
		Filter filtro = new CarroFilter();
		assertEquals( param , filtro.doFilter(param));
	}
	
}
