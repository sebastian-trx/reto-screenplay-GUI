package co.com.sofka.userinterfaces.offers;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.*;


public class BrowseToTheOffersAddingProducts extends PageObject {

    public static final Target OFERTAS = Target
            .the("OFERTAS")
            .located(xpath("//*[@id=\"mega-menu-item-198556\"]/a"));

    public static final Target PRODUCT1 = Target
            .the("PRODUCT1")
            .located(xpath("//*[@id=\"main\"]/div/div[2]/div/div[3]/div[2]/div/div[2]/div[2]/div[4]/a"));

    public static final Target PRODUCT2 = Target
            .the("PRODUCT2")
            .located(xpath("//*[@id=\"main\"]/div/div[2]/div/div[3]/div[3]/div/div[2]/div[2]/div[4]/a"));

    public static final Target PRODUCT3 = Target
            .the("PRODUCT3")
            .located(xpath("//*[@id=\"main\"]/div/div[2]/div/div[3]/div[17]/div/div[2]/div[2]/div[3]/a"));

    public static final Target PRODUCT4 = Target
            .the("PRODUCT4")
            .located(xpath("//*[@id=\"main\"]/div/div[2]/div/div[3]/div[18]/div/div[2]/div[2]/div[3]/a"));


    public static final Target CLOSE_BUTTON_CART_POPUP = Target
            .the("CLOSE_BUTTON_CART_POPUP")
            .located(xpath("/html/body/div[2]/button"));



    public static final Target PURCHASE_BUTTON_CART_POPUP = Target
            .the("PURCHASE_BUTTON_CART_POPUP")
            .located(xpath("//*[@id=\"cart-popup\"]/div/div[2]/p[2]/a[2]"));



    /*
    filtrar productos en oferta:
    https://www.youtube.com/watch?v=aR9Et181wBI
    public static final Target PRODUCTS = Target
            .the("OFFER_PRODUCTS")
            .locatedBy("div.add-to-cart-button");
     */

}
