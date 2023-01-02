package co.com.sofka.stepdefinitions;

import co.com.sofka.questions.checkout.OrderDetails;
import co.com.sofka.setupui.Setup;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;

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
    public void finalizaLaCompraYLlenandoElFormularioDeDetallesDePago() throws InterruptedException {
        theActorInTheSpotlight().attemptsTo(
                fillFormPaymentDetail()
                        .usingFirstName("pepe")
                        .usingLastName("perez")
                        .usingEmail("pepe@yopmail.com")
                        .usingCountry("Colombia")
                        .usingCity("Bogota")
                        .usingAddress("calle 123")
                        .usingZipCode("123123")
                        .andUsingCelular("1234567890")
                //crear modelo
        );
    }

    @Entonces("el sistema mostrara un resumen del pedido")
    public void elSistemaMostraraUnResumenDelPedido() {
        theActorInTheSpotlight().should(
                seeThat("nombre completo del usuario", OrderDetails.fullNameUser(), equalTo("pepe perez"))
                );

    }
}
