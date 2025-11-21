package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.*;
import lippia.web.services.TP4Service;

public class TP4Steps extends PageSteps {


    //Login exitoso
    @Given("el usuario se encuentra en la pagina de Swag Labs")
    public void elUsuarioSeEncuentraEnLaPaginaDeSwagLabs() {
        TP4Service.navegarWeb();
    }


    @When("^ingresa el user (.*)$")
    public void ingresaElUser(String standard_user) {
        TP4Service.inputUser(standard_user);
    }


    @And("^ingresa la pass (.*)$")
    public void ingresaLaPass(String secret_sauce) {
        TP4Service.inputPass(secret_sauce);
    }

    @And("hace click en el boton {string}")
    public void clickeaElBoton(String arg0) {
    TP4Service.loginButton();
    }


    @Then("visualiza que la página cargada tiene el título {string}")
    public void visualizaQueLaPáginaCargadaTieneElTítulo(String arg0) {
        //throw new PendingException();
    }


    //Login fallido por usuario incorrecto


    @Then("visualiza el mensaje de error {string}")
    public void visualizaElMensajeDeError(String arg0) {
        //throw new PendingException();
    }


    //Agregar producto al carrito

    @And("^el inicio de sesion exito del usuario con (.*) y (.*)$")
    public void elInicioDeSesionExitoDelUsuarioConY(String userInput, String passInput) {
      TP4Service.completarUserSegunInput(userInput);
      TP4Service.completarPassSegunInput(passInput);
      //Toco el boton login
      TP4Service.loginButton();
    }

    @Then("el carrito de compras debe mostrar el numero {string}")
    public void elCarritoDeComprasDebeMostrarElNumero(String arg0) {
        TP4Service.shoppingCarButton();
        //throw new PendingException();
    }


    @And("el usuario presiona el boton {string} para agrega el producto {string} al carrito")
    public void elUsuarioPresionaElBotonParaAgregaElProductoAlCarrito(String arg0, String arg1) {
        TP4Service.addToCarButton();
        //throw new PendingException();
    }
    @And("el usuario presiona el boton {string} para eliminar el producto {string} del carrito")
    public void elUsuarioPresionaElBotonParaEliminarElProductoDelCarrito(String arg0, String arg1) {
        TP4Service.REMOVE_PROD();
        //throw new PendingException();
    }

    @Then("el carrito de compras debe mostrarse vacio")
    public void elCarritoDeComprasDebeMostrarseVacio() {
        TP4Service.shoppingCarOnlyButton();
        //throw new PendingException();
    }

    @And("el carrito de compras debe mostrar el numero {int}")
    public void elCarritoDeComprasDebeMostrarElNumero(int arg0) {
        TP4Service.shoppingCarButton();
        //throw new PendingException();
    }
}
