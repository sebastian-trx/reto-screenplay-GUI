package co.com.sofka.questions.checkout;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

import static co.com.sofka.userinterfaces.orderdetails.OrderDetails.FULL_NAME;

public class OrderDetails {

    public static Question<String> fullNameUser() {
        return actor -> TextContent.of(FULL_NAME).viewedBy(actor).asString().trim();
    }


}
