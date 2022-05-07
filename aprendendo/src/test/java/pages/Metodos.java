package pages;

import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import junit.framework.Assert;

public class Metodos {
WebDriver driver;
	
	public void abrirNavegador(String appUrl, String navegador, String descricaoPasso) throws IOException{
		try {
			if (navegador == "CHROME" || navegador == "FIREFOX") {
				if (navegador == "CHROME") {
					System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
					driver = new ChromeDriver();
					driver.get(appUrl);
					driver.manage().window().maximize();
				} else if (navegador == "FIREFOX") {
					System.setProperty("webdriver.gecko.driver", "C:\\Drivers\\geckodriver.exe");
					driver = new FirefoxDriver();
					driver.get(appUrl);
					driver.manage().window().maximize();
				}
			} else {
				System.out.println("Opcao invalida, escolha CHOROME ou FIREFOX");
			}
			
		}catch (Exception e) {
			Assert.fail(LocalDateTime.now() + "--erro ao tentar" + descricaoPasso);
		}
	}

}


