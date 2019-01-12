package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import defaultpackage.AcoesUtils;
import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import defaultpackage.Driver;
import pages.CadastroPage;

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
