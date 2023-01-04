package co.com.sofka.task.books;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;


import static co.com.sofka.userinterfaces.books.BrowseTotheBooksPageAddingProducts.*;
import static co.com.sofka.userinterfaces.loginasaguest.CheckoutAsAGuest.CHECKOUT_AS_A_GUEST_BUTTON;
import static co.com.sofka.userinterfaces.shoppingcart.AgreeTerms.CHECKOUT_BUTTON;
import static co.com.sofka.userinterfaces.shoppingcart.AgreeTerms.CHECK_TERMS;

public class BrowseTotheBooksPageAddingProducts implements Task {


      @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(BOOKS),
                Click.on(BOOKS),

                Scroll.to(BOOK1),
                Click.on(BOOK1),
                Click.on(CLOSE_MESSAGE),

                Scroll.to(BOOK2),
                Click.on(BOOK2),
                Click.on(CLOSE_MESSAGE),

                Scroll.to(BOOK3),
                Click.on(BOOK3),
                Click.on(CLOSE_MESSAGE),

                WaitUntil.the(SHOPPING_CART, WebElementStateMatchers.isVisible())
                        .forNoMoreThan(20L).seconds(),
                Scroll.to(SHOPPING_CART),
                Click.on(SHOPPING_CART),

                Scroll.to(CHECK_TERMS),
                Click.on(CHECK_TERMS),

                Scroll.to(CHECKOUT_BUTTON),
                Click.on(CHECKOUT_BUTTON),

                Scroll.to(CHECKOUT_AS_A_GUEST_BUTTON),
                Click.on(CHECKOUT_AS_A_GUEST_BUTTON)

        );
    }

    public static BrowseTotheBooksPageAddingProducts browseTotheBooksPageAddingProducts(){
        return new BrowseTotheBooksPageAddingProducts();
    }
}
