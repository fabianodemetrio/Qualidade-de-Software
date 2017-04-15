package qualidade.aula;

import org.junit.Assert;

public class TesteLogin {
	Metodos chamaMetodosWeb = new Metodos();

	public void loginEmBranco(){
		chamaMetodosWeb.configInicial();
		chamaMetodosWeb.procuraBotao("login");
		chamaMetodosWeb.clicaBotao("login");
		String register = chamaMetodosWeb.procuraBotaoRegistro("register");
		Assert.assertEquals(register,"register");
		chamaMetodosWeb.encerraConfig();
	}
	
	public void erraLogin(){
		chamaMetodosWeb.configInicial();
		chamaMetodosWeb.procuraElemento("userName", "2345frt");
		chamaMetodosWeb.procuraElemento("password", "yhtu74");
		chamaMetodosWeb.procuraBotao("login");
		chamaMetodosWeb.clicaBotao("login");
		String errou = chamaMetodosWeb.procuraBotaoRegistro("register");
		Assert.assertEquals(errou,"register");
		chamaMetodosWeb.encerraConfig();
	}
	
	public void acertaLogin(){
		chamaMetodosWeb.configInicial();
		chamaMetodosWeb.procuraElemento("userName", "teste");
		chamaMetodosWeb.procuraElemento("password", "teste");
		chamaMetodosWeb.procuraBotao("login");
		chamaMetodosWeb.clicaBotao("login");
		String acertou = chamaMetodosWeb.procuraBotaoRegistro("findflight");
		Assert.assertEquals(acertou,"findflight");
		chamaMetodosWeb.encerraConfig();
	}
	
	public void fazerLogoff(){
		chamaMetodosWeb.configInicial();
		chamaMetodosWeb.procuraElemento("userName", "teste");
		chamaMetodosWeb.procuraElemento("password", "teste");
		chamaMetodosWeb.procuraBotao("login");
		chamaMetodosWeb.clicaBotao("login");
		String logoff = chamaMetodosWeb.procuraGenerica("SIGN-OFF");
		Assert.assertEquals(logoff,"SIGN-OFF");
		chamaMetodosWeb.encerraConfig();
		
	}
}