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
	
	public void testeDeLoginErrado()throws Exception {
		testeDeLogin.erraLogin();
	}
	
	public void testeDeLoginCerto() throws Exception {
		testeDeLogin.acertaLogin();
	}
	
	public void testeDeLogoff() throws Exception {
		testeDeLogin.fazerLogoff();
	}
	
	public void testeBuscaVoo() throws Exception {
		testeDePesquisa.buscaVoo();
	}
	
	public void testePagamentoVoo() throws Exception {
		testeDePagamento.pagamentoVoo();
	}
	
	public void testeItinerario() throws Exception {
		testedoItinerario.clicaItinerario();
	}

	@After
	public void tearDown() throws Exception {
		
	}
}