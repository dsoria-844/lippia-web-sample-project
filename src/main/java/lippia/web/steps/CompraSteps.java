package lippia.web.steps;

import com.crowdar.core.PageSteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.*;

public class CompraSteps extends PageSteps {

    // Variables para almacenar los nombres de los productos
    private String producto1;
    private String producto2;


    @Given("el usuario se encuentra logueado con user (.*) y pass (.*)$")
    public void elUsuarioSeEncuentraLogueadoConUserUsernameYPass(String userName, String secret_sauce) throws InterruptedException {
        LoginServices.navegarWeb();
        LoginServices.inputEmail(userName);
        LoginServices.inputPass(secret_sauce);
        Thread.sleep(2000);
        LoginServices.button_Login();
    }

    @And("^tiene agregado al carrito el producto (.*) y (.*)$")
    public void tieneAgregadoAlCarritoElProductoY(String arg0, String arg1) {
        // Guardar los nombres de los productos
        this.producto1 = arg0;
        this.producto2 = arg1;
        
        CompraServices.add_Product_1();
        CompraServices.add_Product_2();
    }

    @When("hace click en el icono del carrito")
    public void haceClickEnElIconoDelCarrito() throws InterruptedException {
        CompraServices.cart_Button();
        Thread.sleep(2000); 

    }

    @And("hace click en el boton Checkout")
    public void haceClickEnElBotonCheckout()  {
        YourCartServices.checkout_Button();
    }

    @And("^completa los datos personales con Nombre (.*), Apellido (.*) y Código Postal (.*)$")
    public void completaLosDatosPersonalesConNombreNombreApellidoApellidoYCódigoPostalCodigoPostal(String nombre, String Apellido, String codigoPostal) throws InterruptedException {
        CheckoutYourInformationServices.checkout_FirstName(nombre);
        CheckoutYourInformationServices.checkout_LastName(Apellido);
        CheckoutYourInformationServices.checkout_CodigoPostal(codigoPostal);
        Thread.sleep(2000); 
    }

    @And("hace click en el boton Continue")
    public void haceClickEnElBotonContinueCheckout()  {
        CheckoutYourInformationServices.checkout_Continue_Button();
    }

    @Then("visualiza la página de Overview con los productos agregados al carrito")
    public void visualizaLaPáginaDeOverviewConLosProductosAgregadosAlCarrito() throws InterruptedException {
        // Verifico el título y los productos en el Overview
        OverviewServices.verify_Overview("Checkout: Overview", producto1, producto2);
        Thread.sleep(2000); 
    }


    @And("hace click en el boton Finish")
    public void haceClickEnElBotonFinishCheckout()  {
        OverviewServices.finish_Checkout();
    }

    @Then("^visualiza la página de confirmación de la compra con el mensaje (.*)$")
    public void visualizaLaPáginaDeConfirmaciónDeLaCompraConElMensaje(String arg0) throws InterruptedException {
        OverviewServices.verify_finish_Checkout();
        Thread.sleep(2000); 
    }



}
