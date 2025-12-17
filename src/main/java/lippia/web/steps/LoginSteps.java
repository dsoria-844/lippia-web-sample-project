package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.LoginServices;

public class LoginSteps extends PageSteps {
    @Given("el usuario se encuentra en la pagina de Swag Labs")
    public void elUsuarioSeEncuentraEnLaPaginaDeSwagLabs() {
        LoginServices.navegarWeb();
    }

    @When("^ingresa el user (.*)$")
    public void ingresaElUserUsername(String username)  {
        LoginServices.inputEmail(username);
    }


    @And("^ingresa la pass (.*)$")
    public void ingresaLaPass (String secret_sauce) throws InterruptedException {
        LoginServices.inputPass(secret_sauce);
        Thread.sleep(2000); // Pausa de 2 segundos

    }


    @And("hace click en el boton {string}")
    public void haceClickEnElBotonLogin()  {
        LoginServices.button_Login();
    }

    @Then("visualiza que la página cargada tiene el título {string}")
    public void visualizaQueLaPáginaCargadaTieneElTítulo(String titleProduct) {
        LoginServices.verify_Title(titleProduct);
    }


    //Login fallido
    @Then("^visualiza el mensaje de error (.*)$")
    public void visualizaElMensajeDeErrorMnsgError(String content_Alert) throws InterruptedException {
        LoginServices.verify_Alert(content_Alert);
        Thread.sleep(2000); // Pausa de 2 segundos

    }


}
