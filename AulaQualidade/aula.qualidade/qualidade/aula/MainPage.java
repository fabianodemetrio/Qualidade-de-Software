package qualidade.aula;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MainPage {
	TesteLogin testeDeLogin = new TesteLogin();
	TesteBuscaVoo testeDePesquisa = new TesteBuscaVoo();
	TestePagamento testeDePagamento = new TestePagamento();
	TesteItinerario testedoItinerario = new TesteItinerario();

	@Before
	public void setUp() throws Exception {

	}

	@Test
	public void testeDeLoginEmBranco() throws Exception {
		testeDeLogin.loginEmBranco();
	}
	@Test
	
	public void testeDeLoginErrado()throws Exception {
		testeDeLogin.erraLogin();
	}
	@Test
	
	public void testeDeLoginCerto() throws Exception {
		testeDeLogin.acertaLogin();
	}
	@Test
	
	public void testeDeLogoff() throws Exception {
		testeDeLogin.fazerLogoff();
	}
	@Test
	
	public void testeBuscaVoo() throws Exception {
		testeDePesquisa.buscaVoo();
	}
	@Test
	
	public void testePagamentoVoo() throws Exception {
		testeDePagamento.pagamentoVoo();
	}
	
	@Test
	public void testeItinerario() throws Exception {
		testedoItinerario.clicaItinerario();
	}

	@After
	public void tearDown() throws Exception {
		
	}
}