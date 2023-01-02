package co.com.sofka.task.checkout;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;


import static co.com.sofka.interactions.Click.clickOn;
import static co.com.sofka.interactions.Scroll.scrollTo;
import static co.com.sofka.userinterfaces.checkout.CheckoutCompleted.ORDER_DETAILS_LINK;
import static co.com.sofka.userinterfaces.checkout.FillFormPaymentDetail.*;

public class FillFormPaymentDetail implements Task {

    private String firstName;
    private String lastName;
    private String email;
    private String city;
    private String country;
    private String address;
    private String zipCode;
    private String celular;

    public FillFormPaymentDetail usingFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public FillFormPaymentDetail usingLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public FillFormPaymentDetail usingEmail(String email) {
        this.email = email;
        return this;
    }

    public FillFormPaymentDetail usingCity(String city) {
        this.city = city;
        return this;
    }

    public FillFormPaymentDetail usingCountry(String country) {
        this.country = country;
        return this;
    }

    public FillFormPaymentDetail usingAddress(String address) {
        this.address = address;
        return this;
    }

    public FillFormPaymentDetail usingZipCode(String zipCode) {
        this.zipCode = zipCode;
        return this;
    }
    public FillFormPaymentDetail andUsingCelular(String celular) {
        this.celular = celular;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(FIRST_NAME),
                Enter.theValue(firstName).into(FIRST_NAME),

                Scroll.to(LAST_NAME),
                Enter.theValue(lastName).into(LAST_NAME),

                Scroll.to(EMAIL),
                Enter.theValue(email).into(EMAIL),

                Scroll.to(COUNTRY),
                SelectFromOptions.byVisibleText(country).from(COUNTRY),

                Scroll.to(CITY),
                Enter.theValue(city).into(CITY),

                Scroll.to(ADDRESS),
                Enter.theValue(address).into(ADDRESS),

                Scroll.to(ZIP_CODE),
                Enter.theValue(zipCode).into(ZIP_CODE),

                Scroll.to(PHONE_NUMBER),
                Enter.theValue(celular).into(PHONE_NUMBER),

                Scroll.to(CONTINUE_BUTTON1),
                Click.on(CONTINUE_BUTTON1),

                Scroll.to(CONTINUE_BUTTON2),
                Click.on(CONTINUE_BUTTON2),

                Scroll.to(CONTINUE_BUTTON3),
                Click.on(CONTINUE_BUTTON3),

                Scroll.to(CONTINUE_BUTTON4),
                Click.on(CONTINUE_BUTTON4),

                Scroll.to(CONTINUE_BUTTON5),
                Click.on(CONTINUE_BUTTON5),

                Scroll.to(CONTINUE_BUTTON6),
                Click.on(CONTINUE_BUTTON6),

                Scroll.to(ORDER_DETAILS_LINK),
                Click.on(ORDER_DETAILS_LINK)

        );
    }

    public static FillFormPaymentDetail fillFormPaymentDetail(){
        return new FillFormPaymentDetail();
    }
}
