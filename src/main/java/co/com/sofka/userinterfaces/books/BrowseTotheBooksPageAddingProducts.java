package co.com.sofka.userinterfaces.books;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.RenderedPageObjectView;
import net.serenitybdd.screenplay.targets.Target;

import java.time.Duration;

import static org.openqa.selenium.By.xpath;

public class BrowseTotheBooksPageAddingProducts extends PageObject {

    public static final Target BOOKS = Target
            .the("BOOKS")
            .located(xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li[1]/a"));

    public static final Target BOOK1 = Target
            .the("BOOK1")
            .located(xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[1]/div/div[2]/div[3]/div[2]/input"));

    public static final Target BOOK2 = Target
            .the("BOOK2")
            .located(xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[3]/div/div[2]/div[3]/div[2]/input"));

    public static final Target BOOK3 = Target
            .the("BOOK3")
            .located(xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[5]/div/div[2]/div[3]/div[2]/input"));

    public static final Target CLOSE_MESSAGE = Target
            .the("CLOSE_MESSAGE")
            .located(xpath("//*[@id=\"bar-notification\"]/span"));


    public static final Target SHOPPING_CART = Target
            .the("SHOPPING_CART")
            .located(xpath("//*[@id=\"topcartlink\"]/a/span[1]"));


}
