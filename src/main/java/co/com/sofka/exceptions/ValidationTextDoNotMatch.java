package co.com.sofka.exceptions;

import co.com.sofka.models.UserInformation;

import static co.com.sofka.userinterfaces.orderdetails.OrderDetails.*;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ValidationTextDoNotMatch extends AssertionError{

    public static final String VALIDATION_DO_NOT_MATCH = "The validation don't match. %s";

    public ValidationTextDoNotMatch(String message, Throwable cause) {
        super(message, cause);
    }

    public static  String compareInWithSystemOutcome(){
        return "\n" + "Data for test : System outcome"
                + "\n" + UserInformation.FIRST_NAME+ " " +UserInformation.LAST_NAME+ " : " + FULL_NAME.resolveFor(theActorInTheSpotlight()).getText()
                + "\n" + UserInformation.EMAIL + " : " + EMAIL_USER.resolveFor(theActorInTheSpotlight()).getText()
                + "\n" + UserInformation.CELULAR + " : " + PHONE.resolveFor(theActorInTheSpotlight()).getText()
                + "\n" + UserInformation.ADDRESS + " : " + ADDRESS.resolveFor(theActorInTheSpotlight()).getText()
                + "\n" + UserInformation.COUNTRY + " : " + COUNTRY.resolveFor(theActorInTheSpotlight()).getText()
                ;
    }
}
