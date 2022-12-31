package co.com.sofka.task.offers;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.DoubleClick;
import net.serenitybdd.screenplay.actions.Scroll;


import static co.com.sofka.interactions.Click.clickOn;
import static co.com.sofka.interactions.Scroll.scrollTo;
import static co.com.sofka.userinterfaces.offers.BrowseToTheOffersAddingProducts.*;

public class BrowseToTheOffersAddingProducts implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(OFERTAS),
                DoubleClick.on(OFERTAS),

                Scroll.to(PRODUCT1),
                Click.on(PRODUCT1),

                Scroll.to(CLOSE_BUTTON_CART_POPUP),
                Click.on(CLOSE_BUTTON_CART_POPUP),

                Scroll.to(PRODUCT2),
                Click.on(PRODUCT2),

                Scroll.to(CLOSE_BUTTON_CART_POPUP),
                Click.on(CLOSE_BUTTON_CART_POPUP),

                Scroll.to(PRODUCT3),
                Click.on(PRODUCT3),

                Scroll.to(CLOSE_BUTTON_CART_POPUP),
                Click.on(CLOSE_BUTTON_CART_POPUP),

                Scroll.to(PRODUCT4),
                Click.on(PRODUCT4),

                scrollTo(PURCHASE_BUTTON_CART_POPUP),
                clickOn(PURCHASE_BUTTON_CART_POPUP)
        );
    }

    public static BrowseToTheOffersAddingProducts browseTotheOffersAddingProducts(){
        return new BrowseToTheOffersAddingProducts();
    }
}

