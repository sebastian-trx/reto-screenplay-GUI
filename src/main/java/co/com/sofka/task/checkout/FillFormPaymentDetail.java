package co.com.sofka.task.checkout;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;


import static co.com.sofka.interactions.Click.clickOn;
import static co.com.sofka.interactions.Scroll.scrollTo;
import static co.com.sofka.userinterfaces.checkout.FillFormPaymentDetail.*;

public class FillFormPaymentDetail implements Task {

    private String documento;
    private String correo;
    private String nombre;
    private String apellido;
    private String departamento;
    private String poblacion;
    private String direccion;
    private String celular;

    public FillFormPaymentDetail usingDocumento(String documento) {
        this.documento = documento;
        return this;
    }

    public FillFormPaymentDetail usingCorreo(String correo) {
        this.correo = correo;
        return this;
    }

    public FillFormPaymentDetail usingNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public FillFormPaymentDetail usingApellido(String apellido) {
        this.apellido = apellido;
        return this;
    }

    public FillFormPaymentDetail usingDepartamento(String departamento) {
        this.departamento = departamento;
        return this;
    }

    public FillFormPaymentDetail usingPoblacion(String poblacion) {
        this.poblacion = poblacion;
        return this;
    }

    public FillFormPaymentDetail usingDireccion(String direccion) {
        this.direccion = direccion;
        return this;
    }

    public FillFormPaymentDetail andUsingCelular(String celular) {
        this.celular = celular;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(DOCUMENTO),
                Enter.theValue(documento).into(DOCUMENTO),

                Scroll.to(CORREO),
                Enter.theValue(correo).into(CORREO),

                Scroll.to(NOMBRE),
                Enter.theValue(nombre).into(NOMBRE),

                Scroll.to(APELLIDO),
                Enter.theValue(apellido).into(APELLIDO),

                Scroll.to(DEPARTAMENTO),
                SelectFromOptions.byVisibleText(departamento).from(DEPARTAMENTO),

                Scroll.to(POBLACION),
                SelectFromOptions.byVisibleText(poblacion).from(POBLACION),

                Scroll.to(DIRECCION),
                Enter.theValue(direccion).into(DIRECCION),

                Scroll.to(CELULAR),
                Enter.theValue(celular).into(CELULAR),

                scrollTo(TERMS_AND_CONDITION),
                clickOn(TERMS_AND_CONDITION),

                scrollTo(BOTON_REALIZAR_PEDIDO),
                clickOn(BOTON_REALIZAR_PEDIDO)
        );
    }

    public static FillFormPaymentDetail fillFormPaymentDetail(){
        return new FillFormPaymentDetail();
    }
}
