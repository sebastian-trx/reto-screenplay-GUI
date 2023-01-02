package co.com.sofka.userinterfaces.checkout;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.id;
import static org.openqa.selenium.By.xpath;

public class CheckoutCompleted extends PageObject {
    public static final Target ORDER_DETAILS_LINK = Target
            .the("ORDER_DETAILS_LINK")
            .located(xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/ul/li[2]/a"));
}
