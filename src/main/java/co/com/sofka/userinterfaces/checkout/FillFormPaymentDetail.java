package co.com.sofka.userinterfaces.checkout;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.id;
import static org.openqa.selenium.By.xpath;

public class FillFormPaymentDetail extends PageObject {

    public static final Target FIRST_NAME = Target
            .the("FIRST_NAME")
            .located(id("BillingNewAddress_FirstName"));

    public static final Target LAST_NAME = Target
            .the("LAST_NAME")
            .located(id("BillingNewAddress_LastName"));

    public static final Target EMAIL = Target
            .the("EMAIL")
            .located(id("BillingNewAddress_Email"));

    public static final Target COUNTRY = Target
            .the("COUNTRY")
            .located(id("BillingNewAddress_CountryId"));

    public static final Target CITY = Target
            .the("CITY")
            .located(id("BillingNewAddress_City"));

    public static final Target ADDRESS = Target
            .the("ADDRESS")
            .located(id("BillingNewAddress_Address1"));

    public static final Target ZIP_CODE = Target
            .the("ZIP_CODE")
            .located(id("BillingNewAddress_ZipPostalCode"));

    public static final Target PHONE_NUMBER = Target
            .the("PHONE_NUMBER")
            .located(id("BillingNewAddress_PhoneNumber"));

    public static final Target CONTINUE_BUTTON1 = Target
            .the("CONTINUE_BUTTON1")
            .located(xpath("//*[@id=\"billing-buttons-container\"]/input"));

    public static final Target CONTINUE_BUTTON2 = Target
            .the("CONTINUE_BUTTON2")
            .located(xpath("//*[@id=\"shipping-buttons-container\"]/input"));

    public static final Target CONTINUE_BUTTON3 = Target
            .the("CONTINUE_BUTTON3")
            .located(xpath("//*[@id=\"shipping-method-buttons-container\"]/input"));

    public static final Target CONTINUE_BUTTON4 = Target
            .the("CONTINUE_BUTTON4")
            .located(xpath("//*[@id=\"payment-method-buttons-container\"]/input"));

    public static final Target CONTINUE_BUTTON5 = Target
            .the("CONTINUE_BUTTON5")
            .located(xpath("//*[@id=\"payment-info-buttons-container\"]/input"));

    public static final Target CONTINUE_BUTTON6 = Target
            .the("CONTINUE_BUTTON6")
            .located(xpath("//*[@id=\"confirm-order-buttons-container\"]/input"));

    public static final Target FIRST_NAME_WARN_MESSAGE = Target
            .the("FIRST_NAME_WARN_MESSAGE")
            .located(xpath("//*[@id=\"billing-new-address-form\"]/div/div/div/div[1]/span[2]"));

    public static final Target COUNTRY_WARN_MESSAGE = Target
            .the("COUNTRY_WARN_MESSAGE")
            .located(xpath("//*[@id=\"billing-new-address-form\"]/div/div/div/div[5]/span[2]"));




}
