package co.com.sofka.userinterfaces.shoppingcart;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.id;

public class AgreeTerms extends PageObject {

    public static final Target CHECK_TERMS = Target
            .the("CHECK_TERMS")
            .located(id("termsofservice"));

    public static final Target CHECKOUT_BUTTON = Target
            .the("CHECKOUT_BUTTON")
            .located(id("checkout"));
}
