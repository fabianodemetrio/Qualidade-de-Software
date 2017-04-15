package qualidade.aula;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class Metodos {

	Navegador navega = new Navegador();
	
	public void configInicial(){
		navega.setBaseUrl("http://newtours.demoaut.com");
		navega.driver();
	}
	
	public void encerraConfig(){
		navega.fechaNavegador();
	}
	
    public void procuraElemento(String nome, String conteudo){
    	navega.getDriver().findElement(By.name(nome)).clear();
    	navega.getDriver().findElement(By.name(nome)).sendKeys(conteudo);
    }
    
    public void procuraBotao(String nome){
    	navega.getDriver().findElement(By.name(nome));
    }
    
    public String procuraBotaoRegistro(String nome){
    	navega.getDriver().findElement(By.name(nome));
    	return nome;
    }
    
    public String procuraGenerica(String nome){
    	navega.getDriver().findElement(By.linkText(nome));
    	return nome;
    }
    
    public String procuraProxPagina(){
    	return navega.getDriver().getCurrentUrl();
    }
    
    public void clicaBotao(String nomeBotao){
    	navega.getDriver().findElement(By.name(nomeBotao)).click();
    }
    
    public void selecionaLista(String nomeVariavel, String textoVisivel){
        new Select(navega.getDriver().findElement(By.name(nomeVariavel))).selectByVisibleText(textoVisivel);
    }
}