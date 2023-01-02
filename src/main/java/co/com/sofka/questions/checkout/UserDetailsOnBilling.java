package co.com.sofka.questions.checkout;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.sofka.userinterfaces.orderdetails.OrderDetails.*;

public class UserDetailsOnBilling implements Question<Boolean> {

    private String firstName;
    private String lastName;
    private String email;
    private String country;
    private String city;
    private String address;
    private String zipCode;
    private String celular;

    public UserDetailsOnBilling wasFiledWithFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public UserDetailsOnBilling andWithLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public UserDetailsOnBilling andWithEmail(String email) {
        this.email = email;
        return this;
    }

    public UserDetailsOnBilling andWithCountry(String country) {
        this.country = country;
        return this;
    }

    public UserDetailsOnBilling andWithCity(String city) {
        this.city = city;
        return this;
    }

    public UserDetailsOnBilling andWithAddress(String address) {
        this.address = address;
        return this;
    }

    public UserDetailsOnBilling andWithZipCode(String zipCode) {
        this.zipCode = zipCode;
        return this;
    }

    public UserDetailsOnBilling andWithCelular(String celular) {
        this.celular = celular;
        return this;
    }

    public UserDetailsOnBilling is() {
        return this;
    }


    @Override
    public Boolean answeredBy(Actor actor) {
        return (FULL_NAME.resolveFor(actor).containsOnlyText(firstName+ " "+lastName)
                && EMAIL_USER.resolveFor(actor).containsOnlyText("Email: "+email)
                && PHONE.resolveFor(actor).containsOnlyText("Phone: "+ celular)
                && ADDRESS.resolveFor(actor).containsOnlyText(address)
                && COUNTRY.resolveFor(actor).containsOnlyText(country)
        );
    }

    public static UserDetailsOnBilling userDetailsOnBilling() {
        return new UserDetailsOnBilling();
    }

}
