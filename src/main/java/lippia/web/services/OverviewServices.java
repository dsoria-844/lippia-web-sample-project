package lippia.web.services;

import com.crowdar.driver.DriverManager;
import junit.framework.Assert;
import org.openqa.selenium.WebElement;

import static com.crowdar.core.actions.ActionManager.click;
import static lippia.web.constants.OverviewConstants.CHECKOUT_FINISH_BUTTON_ID;

public class OverviewServices {

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

}
