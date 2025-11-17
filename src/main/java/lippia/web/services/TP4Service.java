package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import org.testng.Assert;
//import jdk.internal.util.xml.impl.Input;

import static com.crowdar.core.actions.WebActionManager.navigateTo;
import static lippia.web.constants.TP4Constants.*;

public class TP4Service extends ActionManager {

    public static void navegarWeb(){
        navigateTo(PropertyManager.getProperty("web.base.url"));
    }

    public static void inputUser(String texto){
        setInput(INPUT_USER_ID,texto);
    }

    public static void inputPass(String texto){
        setInput(INPUT_PASS_ID,texto);
    }

    public static void loginButton (){
        click(LOGIN_BUTTON_ID);
    }

    public static void Tittle_Product (){
        Assert.assertTrue(isVisible(TITTLE_ID));
    }

    public static void alertUsuarioBloqueado (){
        Assert.assertTrue(isVisible(ALERT_ID));
    }

    public static void addToCarButton (){
        click(ADD_TO_CAR_BTN_ID);
    }

    public static void completarUserSegunOutline (String User_Outline){
        setInput(INPUT_USER_ID, User_Outline);
    }

    public static void completarPassSegunOutline (String Pass_Outline){
        setInput(INPUT_PASS_ID, Pass_Outline);
    }

    public void REMOVE_PROD (){
        click(REMOVE_TO_CAR_ID);
    }

}
