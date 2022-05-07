package Elementos;

import org.openqa.selenium.By;

public class Elementos {
	// elementos web
	
	 private By pesquisar  = By.name("q");
	 private By e2etreinamentos = By.xpath("//*[@id=\"_lX1xYvPzIZzf1sQPldWfaA23\"]/div[1]/div[2]/div[2]/div/div[2]/h2/span");
	 private By inovacao = By.xpath("//*[@id=\"_wH1xYubxKrvM1sQPtOaI8AQ46\"]/div[2]/div/div/div/div[2]/h2/span");
	 private By felicidade = By.xpath("//*[@id=\"_131xYvTpOJ-j1sQP1pSu0A8113\"]/div[2]/div/div/div/div[2]/h2/span");
	 // elementos publicos
	 
	public By getE2etreinamentos() {
		return e2etreinamentos;
	}

	public By getInovacao() {
		return inovacao;
	}

	public By getFelicidade() {
		return felicidade;
	}

	public By getPesquisar() {
		return pesquisar;
	}

	 
}
