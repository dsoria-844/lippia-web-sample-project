package lippia.web.services;

import static com.crowdar.core.actions.ActionManager.click;
import static lippia.web.constants.YourCartConstants.CHECKOUT_BUTTON_ID;

public class YourCartServices {
    public static void checkout_Button(){
        click(CHECKOUT_BUTTON_ID);
    }
}
