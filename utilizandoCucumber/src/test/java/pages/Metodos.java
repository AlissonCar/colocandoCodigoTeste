package pages;







import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Metodos {

	WebDriver driver;

	public void abrirNavegador(String appUrl) {
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(appUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
	}

	public void escrever(String texto, By elemento) {

		driver.findElement(elemento).sendKeys(texto);

	}

	public void submit(By elemento) {

		driver.findElement(elemento).submit();
	}

	public void fecharNavegador() {
		driver.quit();
	}
	
	public void validarTexto(String textoEsperado, By elemento) {
		String texto = driver.findElement(elemento).getText();
		assertEquals(textoEsperado, texto);
		
	}
	
	public void screnShot(String nome) throws IOException {
		
		TakesScreenshot scrShot = ((TakesScreenshot)driver);
		File scrFile = scrShot.getScreenshotAs(OutputType.FILE);
		File desFile = new File("./scr/evidencias/"+nome+".png");
		FileUtils.copyFile(scrFile, desFile);
		
	}

}
