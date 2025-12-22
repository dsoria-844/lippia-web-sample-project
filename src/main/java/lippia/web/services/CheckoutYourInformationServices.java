package lippia.web.services;

import static com.crowdar.core.actions.ActionManager.click;
import static com.crowdar.core.actions.ActionManager.setInput;
import static lippia.web.constants.CheckoutYourInformationConstants.*;

public class CheckoutYourInformationServices {

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
}
