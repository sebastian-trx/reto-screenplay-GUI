package co.com.sofka.userinterfaces.orderdetails;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.xpath;

public class OrderDetails extends PageObject {

    public static final Target FULL_NAME = Target
            .the("FULL_NAME")
            .located(xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div[2]/table/tbody/tr/td[1]/ul/li[2]"));

    public static final Target EMAIL_USER = Target
            .the("EMAIL_USER")
            .located(xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div[2]/table/tbody/tr/td[1]/ul/li[3]"));

    public static final Target PHONE = Target
            .the("PHONE")
            .located(xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div[2]/table/tbody/tr/td[1]/ul/li[4]"));

    public static final Target ADDRESS = Target
            .the("ADDRESS")
            .located(xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div[2]/table/tbody/tr/td[1]/ul/li[6]"));

    public static final Target COUNTRY = Target
            .the("COUNTRY")
            .located(xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div[2]/table/tbody/tr/td[1]/ul/li[8]"));





}
