package co.com.sofka.stepdefinitions;

import co.com.sofka.setupui.Setup;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;

import static co.com.sofka.task.checkout.FillFormPaymentDetail.fillFormPaymentDetail;
import static co.com.sofka.task.landingpage.OpenLandingPage.openLandingPage;
import static co.com.sofka.task.offers.BrowseToTheOffersAddingProducts.browseTotheOffersAddingProducts;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class PedidoExitosoZonafitStepDefinition extends Setup {

    private static final String ACTOR_NAME = "pepe";


    @Dado("que el usuario esta en la landing page")
    public void queElUsuarioEstaEnLaLandingPage() {
        actorSetupTheBrowser(ACTOR_NAME);
        theActorInTheSpotlight().wasAbleTo(
                openLandingPage()
        );
    }

    @Cuando("se dirige a la pagina de ofertas añadiendo productos al carrito")
    public void seDirigeALaPaginaDeOfertasAñadiendoProductosAlCarrito() {
        theActorInTheSpotlight().attemptsTo(
                browseTotheOffersAddingProducts()
        );
    }

    @Y("finaliza la compra llenando el formulario de detalles de pago")
    public void finalizaLaCompraYLlenandoElFormularioDeDetallesDePago() {
        theActorInTheSpotlight().attemptsTo(
                fillFormPaymentDetail()
                        .usingDocumento("1234567890")
                        .usingCorreo("pepe@yopmail.com")
                        .usingNombre("pepe")
                        .usingApellido("perez")
                        .usingDepartamento("Amazonas")
                        .usingPoblacion("Leticia - 910001")
                        .usingDireccion("calle falsa 123")
                        .andUsingCelular("1234567890")
                //crear modelo
        );
    }

    @Entonces("el sistema mostrara un resumen del pedido")
    public void elSistemaMostraraUnResumenDelPedido() {
        /*
        theActorInTheSpotlight().should(
                seeThat()
                );


         */
    }
}
