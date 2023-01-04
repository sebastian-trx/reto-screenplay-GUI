package co.com.sofka.questions.checkout;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

import java.time.Duration;

import static co.com.sofka.userinterfaces.checkout.FillFormPaymentDetail.COUNTRY_WARN_MESSAGE;
import static co.com.sofka.userinterfaces.checkout.FillFormPaymentDetail.FIRST_NAME_WARN_MESSAGE;

public class FormWarningMessages {

    public static Question<String> warnMessageFromFirstNameInput() {
        return actor -> TextContent.of(FIRST_NAME_WARN_MESSAGE.waitingForNoMoreThan(Duration.ofSeconds(10))).viewedBy(actor).asString().trim();
    }

    public static Question<String> warnMessageFromCountrySelectInput() {
        return actor -> TextContent.of(COUNTRY_WARN_MESSAGE.waitingForNoMoreThan(Duration.ofSeconds(10))).viewedBy(actor).asString().trim();
    }
}
