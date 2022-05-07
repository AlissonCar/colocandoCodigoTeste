package tests;

import java.io.IOException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Metodos;

public class steps {

	Metodos metodos = new Metodos();

	@Given("que eu esteja no {string}")

	public void que_eu_esteja_no(String appUrl) throws IOException {
		 metodos.abrirNavegador(appUrl, appUrl, appUrl);

	}

	@When("pesquisar o nome da escola")
	public void pesquisar_o_nome_da_escola() {

	}

	@Then("valido as informacoes")
	public void valido_as_informacoes() {

	}

}
