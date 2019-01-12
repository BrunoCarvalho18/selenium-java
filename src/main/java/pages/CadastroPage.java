package pages;

import org.openqa.selenium.By;
import defaultpackage.AcoesUtils;

public class CadastroPage {

	AcoesUtils acoesutils = new AcoesUtils();
	private By elementoTela = By.linkText("Seu Barriga");
	private By campoNome = By.id("nome");
	private By campoEmail = By.id("email");
	private By campoSenha = By.id("senha");
	private By btnCadastrar = By.xpath("/html/body/div[2]/form/input");

	public By getelementoTela() {
		return elementoTela;
	}

	public By getCampoNome() {
		return campoNome;
	}

	public By getCampoEmail() {
		return campoEmail;
	}

	public By getCampoSenha() {
		return campoSenha;
	}

	public By getBtnCadastrar() {
		return btnCadastrar;
	}

	public void verificarElementoVisivel() {
		acoesutils.verificarElementoPresente(elementoTela);
	}

	public void preencherCampoNome(String nome) {
		acoesutils.escreveNoElemento(campoNome, nome);
	}

	public void preencherCampoEmail(String email) {
		acoesutils.escreveNoElemento(campoEmail, email);
	}

	public void preencherCampoSenha(String senha) {
		acoesutils.escreveNoElemento(campoSenha, senha);
	}

	public void clicarBotaoCadastrar() {
		acoesutils.enviarFormulario(btnCadastrar);

	}

}