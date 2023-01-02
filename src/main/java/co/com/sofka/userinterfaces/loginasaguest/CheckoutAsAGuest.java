package co.com.sofka.userinterfaces.loginasaguest;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.xpath;

public class CheckoutAsAGuest extends PageObject {
    public static final Target CHECKOUT_AS_A_GUEST_BUTTON = Target
            .the("CHECKOUT_AS_A_GUEST_BUTTON")
            .located(xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[1]/div[3]/input[1]"));
}
