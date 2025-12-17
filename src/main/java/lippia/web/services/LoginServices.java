package lippia.web.services;

//import jdk.internal.util.xml.impl.Input;

import org.openqa.selenium.WebElement;

import com.crowdar.core.PropertyManager;
import static com.crowdar.core.actions.ActionManager.click;
import static com.crowdar.core.actions.ActionManager.setInput;
import static com.crowdar.core.actions.WebActionManager.navigateTo;
import com.crowdar.driver.DriverManager;

import junit.framework.Assert;
import static lippia.web.constants.LoginConstants.BUTTON_LOGIN_ID;
import static lippia.web.constants.LoginConstants.INPUT_USER_ID;
import static lippia.web.constants.LoginConstants.PASS_USER_ID;


public class LoginServices {
    public static void navegarWeb(){
        navigateTo(PropertyManager.getProperty("web.base.url"));
    }

    public static void inputEmail (String userInput){
        setInput(INPUT_USER_ID, userInput);
    }

    public static void inputPass (String passInput){
        setInput(PASS_USER_ID, passInput);
    }

    public static void button_Login (){
        click(BUTTON_LOGIN_ID);
    }

    public static void verify_Title(String title){
        WebElement element = DriverManager.getDriverInstance().findElement(org.openqa.selenium.By.className("title"));
        Assert.assertEquals(title, element.getText());
    }

    public static void verify_Alert (String alert){
        WebElement element = DriverManager.getDriverInstance().findElement(org.openqa.selenium.By.cssSelector(".error-message-container.error"));
        Assert.assertEquals(alert, element.getText());
    }
}
