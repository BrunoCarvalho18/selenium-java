package defaultpackage;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public final class AcoesUtils {

	Driver driver = new Driver();
	String homePageUrl = "http://srbarriga.herokuapp.com";

	public Driver acessarHomePage() {
		Driver.getDriver().get(homePageUrl);
		return driver;
	}

	public Driver acessarCadastroPage() {
		Driver.getDriver().get(homePageUrl + "/cadastro");
		return driver;
	}

	public Driver clicarElemento(By by) {
		Driver.getDriver().findElement(by);
		return driver;

	}

	public Driver escreveNoElemento(By by, String Escreve) {
		Driver.getDriver().findElement(by).sendKeys(Escreve);
		return driver;

	}

	public Driver verificarElementoPresente(By by) {
		Driver.getDriver().findElement(by).isDisplayed();
		return driver;
	}

	public Driver enviarFormulario(By by) {
		Driver.getDriver().findElement(by).submit();
		return driver;
	}

	public Driver timeoutImplicito() {
		Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Driver.getDriver().get(homePageUrl);
		return driver;
	}

	public Driver tiraPrint() throws IOException {
		File scrFile = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("screenshot/screenshot.png"));
		return driver;
	}

}
