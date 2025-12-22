package lippia.web.services;

import com.crowdar.core.PropertyManager;
import static com.crowdar.core.actions.ActionManager.click;
import static com.crowdar.core.actions.WebActionManager.navigateTo;
import static lippia.web.constants.CompraConstants.PRODUCT_1_ID;
import static lippia.web.constants.CompraConstants.PRODUCT_2_ID;
import static lippia.web.constants.CompraConstants.SHOPPING_CART_ID;


public class CompraServices {
    public static void navegarWeb(){
        navigateTo(PropertyManager.getProperty("web.base.url"));
    }

    public static void add_Product_1 (){
        click(PRODUCT_1_ID);
    }

    public static void add_Product_2 (){
        click(PRODUCT_2_ID);
    }

    public static void cart_Button (){
        click(SHOPPING_CART_ID);
    }

}
