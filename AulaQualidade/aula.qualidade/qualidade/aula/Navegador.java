package qualidade.aula;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Navegador {
	private WebDriver driver;
	private String baseUrl;

	public void driver(){
    	System.setProperty("webdriver.gecko.driver", "C:\\Java Libs\\chromedriver.exe");
    	driver = new FirefoxDriver();
    	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    	driver.get(baseUrl);
    }

    public void fechaNavegador(){
    	driver.quit();
    } 

	public void setBaseUrl(String baseUrl) {
		this.baseUrl = baseUrl;
	}

	public WebDriver getDriver() {
		return driver;
	}

}