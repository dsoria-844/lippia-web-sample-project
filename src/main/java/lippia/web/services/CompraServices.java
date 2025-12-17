package lippia.web.services;

//import jdk.internal.util.xml.impl.Input;

import com.crowdar.core.PropertyManager;
import com.crowdar.driver.DriverManager;
import junit.framework.Assert;
import org.openqa.selenium.WebElement;

import static com.crowdar.core.actions.ActionManager.click;
import static com.crowdar.core.actions.ActionManager.setInput;
import static com.crowdar.core.actions.WebActionManager.navigateTo;
import static lippia.web.constants.CompraConstants.*;


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

    public static void verify_Overview(String title){
        WebElement element = DriverManager.getDriverInstance().findElement(org.openqa.selenium.By.className("title"));
        Assert.assertEquals(title, element.getText());
    }

    public static void finish_Checkout (){
        click(CHECKOUT_FINISH_BUTTON_ID);
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
