package co.com.sofka.stepdefinitions;

import co.com.sofka.exceptions.ValidationTextDoNotMatch;
import co.com.sofka.models.UserInformation;
import co.com.sofka.questions.checkout.FormWarningMessages;
import co.com.sofka.setupui.Setup;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import org.apache.log4j.Logger;
import org.assertj.core.api.Assertions;

import static co.com.sofka.exceptions.ValidationTextDoNotMatch.VALIDATION_DO_NOT_MATCH;
import static co.com.sofka.exceptions.ValidationTextDoNotMatch.compareInWithSystemOutcome;
import static co.com.sofka.questions.checkout.UserDetailsOnBilling.userDetailsOnBilling;
import static co.com.sofka.task.books.BrowseTotheBooksPageAddingProducts.browseTotheBooksPageAddingProducts;
import static co.com.sofka.task.checkout.FillFormPaymentDetail.fillFormPaymentDetail;
import static co.com.sofka.task.checkout.FillFormSomePaymentDetail.fillFormSomePaymentDetail;
import static co.com.sofka.task.landingpage.OpenLandingPage.openLandingPage;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.core.IsEqual.equalTo;

public class PedidoDemoWebShopStepDefinition extends Setup {

    private static final Logger LOGGER = Logger.getLogger(PedidoDemoWebShopStepDefinition.class);
    private static final String ACTOR_NAME = "pepe";

    @Dado("que el usuario esta en la landing page")
    public void queElUsuarioEstaEnLaLandingPage() {
        try {
            actorSetupTheBrowser(ACTOR_NAME);
            theActorInTheSpotlight().wasAbleTo(
                    openLandingPage()
            );
        }catch (Exception e){
            LOGGER.error(e.getMessage(),e);
            Assertions.fail(e.getMessage(),e);
        }
    }

    @Cuando("se dirige a la pagina de books añadiendo productos al carrito")
    public void seDirigeALaPaginaDeOfertasAnhadiendoProductosAlCarrito() {
        try {
            theActorInTheSpotlight().attemptsTo(
                    browseTotheBooksPageAddingProducts()
            );
        }catch (Exception e){
            LOGGER.error(e.getMessage(),e);
            Assertions.fail(e.getMessage(),e);
        }
    }

    @Y("finaliza la compra llenando el formulario de detalles de pago")
    public void finalizaLaCompraYLlenandoElFormularioDeDetallesDePago() {
        try {
            theActorInTheSpotlight().attemptsTo(
                    fillFormPaymentDetail()
                            .usingFirstName(UserInformation.FIRST_NAME)
                            .usingLastName(UserInformation.LAST_NAME)
                            .usingEmail(UserInformation.EMAIL)
                            .usingCountry(UserInformation.COUNTRY)
                            .usingCity(UserInformation.CITY)
                            .usingAddress(UserInformation.ADDRESS)
                            .usingZipCode(UserInformation.ZIP_CODE)
                            .andUsingCelular(UserInformation.CELULAR)
            );
        }catch (Exception e){
            LOGGER.error(e.getMessage(),e);
            Assertions.fail(e.getMessage(),e);
        }
    }

    @Entonces("el sistema mostrara un resumen del pedido")
    public void elSistemaMostraraUnResumenDelPedido() {
        try {
            theActorInTheSpotlight()
                    .should(
                            seeThat(
                                    userDetailsOnBilling()
                                            .wasFiledWithFirstName(UserInformation.FIRST_NAME)
                                            .andWithLastName(UserInformation.LAST_NAME)
                                            .andWithEmail(UserInformation.EMAIL)
                                            .andWithCountry(UserInformation.COUNTRY)
                                            .andWithCity(UserInformation.CITY)
                                            .andWithAddress(UserInformation.ADDRESS)
                                            .andWithZipCode(UserInformation.ZIP_CODE)
                                            .andWithCelular(UserInformation.CELULAR)
                                            .is(), equalTo(true)
                            ).orComplainWith(
                                    ValidationTextDoNotMatch.class,
                                    String.format(VALIDATION_DO_NOT_MATCH, compareInWithSystemOutcome())
                            )
                    );
        }catch (Exception e){
            LOGGER.error(e.getMessage(),e);
            Assertions.fail(e.getMessage(),e);
        }
    }

    @Y("finaliza la compra llenando algunos campos del formulario de detalles de pago")
    public void finalizaLaCompraLlenandoAlgunosCamposDelFormularioDeDetallesDePago() {
        try {
            theActorInTheSpotlight().attemptsTo(
                    fillFormSomePaymentDetail()
                            .usingLastName(UserInformation.LAST_NAME)
                            .usingEmail(UserInformation.EMAIL)
                            .usingCity(UserInformation.CITY)
                            .usingAddress(UserInformation.ADDRESS)
                            .usingZipCode(UserInformation.ZIP_CODE)
                            .andUsingCelular(UserInformation.CELULAR)
            );
        }catch (Exception e){
            LOGGER.error(e.getMessage(),e);
            Assertions.fail(e.getMessage(),e);
        }
    }

    @Entonces("el sistema mostrara un mensaje en los campos obligatorios vacios")
    public void elSistemaMostraraUnMensajeEnLosCamposObligatoriosVacios() {
        try {
            theActorInTheSpotlight().should(
                    seeThat("mensaje de advertencia en el campo first name por estar vacio",
                            FormWarningMessages.warnMessageFromFirstNameInput(),
                            equalTo("First name is required.")),
                    seeThat("mensaje de advertencia en el campo country por estar vacio",
                            FormWarningMessages.warnMessageFromCountrySelectInput(),
                            equalTo("Country is required."))
            );
        }catch (Exception e){
            LOGGER.error(e.getMessage(),e);
            Assertions.fail(e.getMessage(),e);
        }
    }
}

