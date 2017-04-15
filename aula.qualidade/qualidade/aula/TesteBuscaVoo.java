package qualidade.aula;

import org.junit.Assert;

public class TesteBuscaVoo {
	Metodos chamaMetodosWeb = new Metodos();
	
	public void buscaVoo(){
		chamaMetodosWeb.configInicial();
		chamaMetodosWeb.procuraElemento("userName", "teste");
		chamaMetodosWeb.procuraElemento("password", "teste");
		chamaMetodosWeb.procuraBotao("login");
		chamaMetodosWeb.clicaBotao("login");
		chamaMetodosWeb.selecionaLista("fromPort", "London");
		chamaMetodosWeb.selecionaLista("fromMonth", "October");
		chamaMetodosWeb.selecionaLista("fromDay", "10");
		chamaMetodosWeb.selecionaLista("toPort", "New York");
		chamaMetodosWeb.selecionaLista("toMonth", "October");
		chamaMetodosWeb.selecionaLista("toDay", "29");
		chamaMetodosWeb.selecionaLista("airline", "Unified Airlines");
		chamaMetodosWeb.clicaBotao("findFlights");
		String teste = chamaMetodosWeb.procuraProxPagina();
		Assert.assertEquals(teste,"http://newtours.demoaut.com/mercuryreservation2.php");
		chamaMetodosWeb.encerraConfig();
	}
}