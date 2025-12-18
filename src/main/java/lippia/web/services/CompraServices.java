package lippia.web.services;

//import jdk.internal.util.xml.impl.Input;

import org.openqa.selenium.WebElement;

import com.crowdar.core.PropertyManager;
import static com.crowdar.core.actions.ActionManager.click;
import static com.crowdar.core.actions.ActionManager.setInput;
import static com.crowdar.core.actions.WebActionManager.navigateTo;
import com.crowdar.driver.DriverManager;

import junit.framework.Assert;
import static lippia.web.constants.CompraConstants.CHECKOUT_BUTTON_ID;
import static lippia.web.constants.CompraConstants.CHECKOUT_CONTINUE_BUTTON_ID;
import static lippia.web.constants.CompraConstants.CHECKOUT_FINISH_BUTTON_ID;
import static lippia.web.constants.CompraConstants.CHECKOUT_FIRSTNAME_ID;
import static lippia.web.constants.CompraConstants.CHECKOUT_LASTNAME_ID;
import static lippia.web.constants.CompraConstants.CHECKOUT_POSTALCODE_ID;
import static lippia.web.constants.CompraConstants.PRODUCT_1_ID;
import static lippia.web.constants.CompraConstants.PRODUCT_2_ID;
import static lippia.web.constants.CompraConstants.SHOPPING_CART_ID;


public class CompraServices {
    public static void navegarWeb(){
        navigateTo(PropertyManager.getProperty("web.base.url"));
    }

    //CONSULTAR
    /*
    public static void inputEmail (String userInput){
        setInput(INPUT_USER_ID, userInput);
    }

    public static void inputPass (String passInput){
        setInput(PASS_USER_ID, passInput);
    }

    public static void button_Login (){
        click(BUTTON_LOGIN_ID);
    }


     */
    public static void add_Product_1 (){
        click(PRODUCT_1_ID);
    }

    public static void add_Product_2 (){
        click(PRODUCT_2_ID);
    }

    public static void cart_Button (){
        click(SHOPPING_CART_ID);
    }

    public static void checkout_Button(){
        click(CHECKOUT_BUTTON_ID);
    }

    public static void checkout_FirstName(String string){
        setInput(CHECKOUT_FIRSTNAME_ID, string);
    }

    public static void checkout_LastName (String string){
        setInput(CHECKOUT_LASTNAME_ID, string);
    }

    public static void checkout_CodigoPostal (String string){
        setInput(CHECKOUT_POSTALCODE_ID, string);
    }

    public static void checkout_Continue_Button (){
        click(CHECKOUT_CONTINUE_BUTTON_ID);
    }

    public static void verify_Overview(String title, String titleProduct1, String titleProduct2){
        WebElement element = DriverManager.getDriverInstance().findElement(org.openqa.selenium.By.className("title"));
        Assert.assertEquals(title, element.getText());

        //Agrego asserciones para saber si estan o no los productos que quiero agregar.
        WebElement Product1 = DriverManager.getDriverInstance().findElement(org.openqa.selenium.By.cssSelector("#item_4_title_link"));
        Assert.assertEquals(titleProduct1, Product1.getText());

        WebElement Product2 = DriverManager.getDriverInstance().findElement(org.openqa.selenium.By.cssSelector("#item_0_title_link"));
        Assert.assertEquals(titleProduct2, Product2.getText());
    }



    public static void finish_Checkout (){
        click(CHECKOUT_FINISH_BUTTON_ID);
    }

    public static void verify_finish_Checkout (){
        Assert.assertEquals("Thank you for your order!", DriverManager.getDriverInstance().findElement(org.openqa.selenium.By.className("complete-header")).getText());
    }



    /*public static void verify_Title(String title){
        //WebElement element = DriverManager.getDriverInstance().findElement(org.openqa.selenium.By.className("title"));
        //Assert.assertEquals(title, element.getText());
    }*/

    /*public static void verify_Alert (String alert){
        //WebElement element = DriverManager.getDriverInstance().findElement(org.openqa.selenium.By.cssSelector(".error-message-container.error"));
        //Assert.assertEquals(alert, element.getText());
    }*/
}
