package co.com.sofka.userinterfaces.checkout;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.id;
import static org.openqa.selenium.By.xpath;

public class FillFormPaymentDetail extends PageObject {

    public static final Target DOCUMENTO = Target
            .the("DOCUMENTO")
            .located(id("billing_myfield12"));

    public static final Target CORREO = Target
            .the("CORREO")
            .located(id("billing_email"));

    public static final Target NOMBRE = Target
            .the("NOMBRE")
            .located(id("billing_first_name"));

    public static final Target APELLIDO = Target
            .the("APELLIDO")
            .located(id("billing_last_name"));

    public static final Target DEPARTAMENTO = Target
            .the("DEPARTAMENTO")
            .located(id("billing_state"));

    public static final Target POBLACION = Target
            .the("POBLACION")
            .located(id("billing_city"));

    public static final Target DIRECCION = Target
            .the("DIRECCION")
            .located(id("billing_address_1"));

    public static final Target CELULAR = Target
            .the("CELULAR")
            .located(id("billing_phone"));

    public static final Target TERMS_AND_CONDITION = Target
            .the("TERMS_AND_CONDITIONS")
            .located(id("terms"));

    public static final Target BOTON_REALIZAR_PEDIDO = Target
            .the("BOTON_REALIZAR_PEDIDO")
            .located(id("place_order"));
}
