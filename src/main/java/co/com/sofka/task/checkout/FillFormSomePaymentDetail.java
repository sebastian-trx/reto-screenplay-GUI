package co.com.sofka.task.checkout;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.sofka.userinterfaces.checkout.FillFormPaymentDetail.*;
import static co.com.sofka.userinterfaces.checkout.FillFormPaymentDetail.CONTINUE_BUTTON1;

public class FillFormSomePaymentDetail implements Task {

    private String lastName;
    private String email;
    private String city;
    private String address;
    private String zipCode;
    private String celular;

   

    public FillFormSomePaymentDetail usingLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public FillFormSomePaymentDetail usingEmail(String email) {
        this.email = email;
        return this;
    }

    public FillFormSomePaymentDetail usingCity(String city) {
        this.city = city;
        return this;
    }

    public FillFormSomePaymentDetail usingAddress(String address) {
        this.address = address;
        return this;
    }

    public FillFormSomePaymentDetail usingZipCode(String zipCode) {
        this.zipCode = zipCode;
        return this;
    }
    public FillFormSomePaymentDetail andUsingCelular(String celular) {
        this.celular = celular;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(LAST_NAME),
                Enter.theValue(lastName).into(LAST_NAME),

                Scroll.to(EMAIL),
                Enter.theValue(email).into(EMAIL),

                Scroll.to(CITY),
                Enter.theValue(city).into(CITY),

                Scroll.to(ADDRESS),
                Enter.theValue(address).into(ADDRESS),

                Scroll.to(ZIP_CODE),
                Enter.theValue(zipCode).into(ZIP_CODE),

                Scroll.to(PHONE_NUMBER),
                Enter.theValue(celular).into(PHONE_NUMBER),

                Scroll.to(CONTINUE_BUTTON1),
                Click.on(CONTINUE_BUTTON1)
        );
    }
    public static FillFormSomePaymentDetail fillFormSomePaymentDetail(){
        return new FillFormSomePaymentDetail();
    }
}
