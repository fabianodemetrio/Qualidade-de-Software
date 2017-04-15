package qualidade.aula;

import org.junit.Assert;

public class TestePagamento {
	Metodos chamaMetodosWeb = new Metodos();
	
	public void pagamentoVoo(){
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
		chamaMetodosWeb.procuraBotao("reserveFlights");
		chamaMetodosWeb.clicaBotao("reserveFlights");
		chamaMetodosWeb.procuraElemento("passFirst0", "Fulano");
		chamaMetodosWeb.procuraElemento("passLast0", "de Tal");
		chamaMetodosWeb.selecionaLista("pass.0.meal", "Hindu");
		chamaMetodosWeb.selecionaLista("creditCard", "MasterCard");
		chamaMetodosWeb.procuraElemento("creditnumber", "5413330059687345");
		chamaMetodosWeb.procuraElemento("billAddress1", "Rua dos Bobos, 1234");
		chamaMetodosWeb.procuraElemento("billCity", "Porto Alegre");
		chamaMetodosWeb.procuraElemento("billState", "Rio Grande do Sul");
		chamaMetodosWeb.procuraElemento("billZip", "98765635");
		chamaMetodosWeb.selecionaLista("billCountry", "BRAZIL");
		chamaMetodosWeb.clicaBotao("ticketLess");
		chamaMetodosWeb.clicaBotao("buyFlights");
		String confirmacao = chamaMetodosWeb.procuraProxPagina();
		Assert.assertEquals(confirmacao,"http://newtours.demoaut.com/mercuryreservation2.php");
		chamaMetodosWeb.encerraConfig();
	}
}
