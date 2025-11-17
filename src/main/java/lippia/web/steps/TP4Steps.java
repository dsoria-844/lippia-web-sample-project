package lippia.web.steps;

import com.crowdar.core.PageSteps;
import cucumber.api.PendingException;
import io.cucumber.java.en.*;
import lippia.web.services.TP4Service;

public class TP4Steps extends PageSteps {


    //Login exitoso
    @Given("el usuario se encuentra en la pagina de Swag Labs")
    public void elUsuarioSeEncuentraEnLaPaginaDeSwagLabs() {
        TP4Service.navegarWeb();
    }

    @When("ingresa el user {string}")
    public void ingresaElUser(String arg0) {
    }

    @And("ingresa la pass {string}")
    public void ingresaLaPass(String arg0) {
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

    @And("el inicio de sesion exito del usuario con {string} y {string}")
    public void elInicioDeSesionExitoDelUsuarioConY(String arg0, String arg1) {
        //throw new PendingException();
    }

    @Then("el carrito de compras debe mostrar el numero {string}")
    public void elCarritoDeComprasMuestraElNumero(String arg0) {
        //throw new PendingException();
    }

    @And("el usuario presiona el boton {string} para agrega el producto {string} al carrito")
    public void elUsuarioPresionaElBotonParaAgregaElProductoAlCarrito(String arg0, String arg1) {
        //throw new PendingException();
    }
    @And("el usuario presiona el boton {string} para eliminar el producto {string} del carrito")
    public void elUsuarioPresionaElBotonParaEliminarElProductoDelCarrito(String arg0, String arg1) {
        //throw new PendingException();
    }

    @Then("el carrito de compras debe mostrarse vacio")
    public void elCarritoDeComprasDebeMostrarseVacio() {
        //throw new PendingException();
    }

}
