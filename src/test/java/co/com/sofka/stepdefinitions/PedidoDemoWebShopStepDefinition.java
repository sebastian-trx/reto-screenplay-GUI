package co.com.sofka.stepdefinitions;

import co.com.sofka.exceptions.ValidationTextDoNotMatch;
import co.com.sofka.models.UserInformation;
import co.com.sofka.setupui.Setup;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;

import static co.com.sofka.exceptions.ValidationTextDoNotMatch.VALIDATION_DO_NOT_MATCH;
import static co.com.sofka.exceptions.ValidationTextDoNotMatch.compareInWithSystemOutcome;
import static co.com.sofka.questions.checkout.UserDetailsOnBilling.userDetailsOnBilling;
import static co.com.sofka.task.books.BrowseTotheBooksPageAddingProducts.browseTotheBooksPageAddingProducts;
import static co.com.sofka.task.checkout.FillFormPaymentDetail.fillFormPaymentDetail;
import static co.com.sofka.task.landingpage.OpenLandingPage.openLandingPage;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.core.IsEqual.equalTo;

public class PedidoDemoWebShopStepDefinition extends Setup {

    private static final String ACTOR_NAME = "pepe";


    @Dado("que el usuario esta en la landing page")
    public void queElUsuarioEstaEnLaLandingPage() {
        actorSetupTheBrowser(ACTOR_NAME);
        theActorInTheSpotlight().wasAbleTo(
                openLandingPage()
        );
    }

    @Cuando("se dirige a la pagina de books añadiendo productos al carrito")
    public void seDirigeALaPaginaDeOfertasAnhadiendoProductosAlCarrito() {
        theActorInTheSpotlight().attemptsTo(
                browseTotheBooksPageAddingProducts()
        );
    }

    @Y("finaliza la compra llenando el formulario de detalles de pago")
    public void finalizaLaCompraYLlenandoElFormularioDeDetallesDePago() {
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
    }

    @Entonces("el sistema mostrara un resumen del pedido")
    public void elSistemaMostraraUnResumenDelPedido() {
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
    }
}
