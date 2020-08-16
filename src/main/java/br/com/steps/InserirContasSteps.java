package br.com.steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

import com.github.javafaker.Faker;

import br.com.defaultpackage.AcoesUtils;
import br.com.defaultpackage.Driver;
import br.com.pages.CadastroPage;

import org.openqa.selenium.WebDriver;

public class InserirContasSteps {

	WebDriver driver;
	AcoesUtils acoesutils = new AcoesUtils();
	CadastroPage cadastro = new CadastroPage();
	Faker faker = new Faker();

	@Dado("^que estou acessando a aplicação$")
	public void estouAplicacao() throws Throwable {
		Driver.setup();
		acoesutils.acessarCadastroPage();

	}

	@Quando("^preencho os campos$")
	public void preenchoCampos() throws Throwable {
		cadastro.verificarElementoVisivel();
		cadastro.preencherCampoNome(faker.name().firstName());
		cadastro.preencherCampoEmail(faker.internet().emailAddress());
		cadastro.preencherCampoSenha(faker.internet().password());
		cadastro.clicarBotaoCadastrar();

	}

	@Então("^a conta é inserida com sucesso$")
	public void validaContaInseridacomSucesso() throws Throwable {
		acoesutils.tiraPrint();
		Driver.teardown();
	}
}
