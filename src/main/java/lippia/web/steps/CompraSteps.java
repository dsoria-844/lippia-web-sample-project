package lippia.web.steps;

import com.crowdar.core.PageSteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.CompraServices;
import lippia.web.services.LoginServices;

public class CompraSteps extends PageSteps {


    @Given("el usuario se encuentra logueado con user (.*) y pass (.*)$")
    public void elUsuarioSeEncuentraLogueadoConUserUsernameYPass(String userName, String secret_sauce) {
        LoginServices.navegarWeb();
        LoginServices.inputEmail(userName);
        LoginServices.inputPass(secret_sauce);
        LoginServices.button_Login();
    }

    @And("^tiene agregado al carrito el producto (.*) y (.*)$")
    public void tieneAgregadoAlCarritoElProductoY(String arg0, String arg1) {
        CompraServices.add_Product_1();
        CompraServices.add_Product_2();
    }

    @When("hace click en el icono del carrito")
    public void haceClickEnElIconoDelCarrito() {
        CompraServices.cart_Button();

    }

    @And("hace click en el boton Checkout")
    public void haceClickEnElBotonCheckout()  {
        CompraServices.checkout_Button();
    }

    @And("^completa los datos personales con Nombre (.*), Apellido (.*) y Código Postal (.*)$")
    public void completaLosDatosPersonalesConNombreNombreApellidoApellidoYCódigoPostalCodigoPostal(String nombre, String Apellido, String codigoPostal) {
        CompraServices.checkout_FirstName(nombre);
        CompraServices.checkout_LastName(Apellido);
        CompraServices.checkout_CodigoPostal(codigoPostal);
    }

    @And("hace click en el boton Continue")
    public void haceClickEnElBotonContinueCheckout()  {
        CompraServices.checkout_Continue_Button();
    }

    @Then("visualiza la página de Overview con los productos agregados al carrito")
    public void visualizaLaPáginaDeOverviewConLosProductosAgregadosAlCarrito() {
        CompraServices.verify_Overview("Checkout: Overview");  //VERIFICO EL TITULO

    }


    @And("hace click en el boton Finish")
    public void haceClickEnElBotonFinishCheckout()  {
        CompraServices.finish_Checkout();
    }

    @Then("^visualiza la página de confirmación de la compra con el mensaje (.*)$")
    public void visualizaLaPáginaDeConfirmaciónDeLaCompraConElMensaje(String arg0) {

    }



}
