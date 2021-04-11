package pages;

import org.junit.Assert;
import org.openqa.selenium.By;

public class CurrenciesPage extends MainPage{

    public CurrenciesPage() {
        Helpers.waitLoadPage();
    }

    private By headingPage = By.xpath("//h1[contains(.,\" Currencies\")]");

    public CurrenciesPage checkHeadingCountriesPage() {
        Assert.assertEquals("Некорректный заголовок страницы", "Currencies", Helpers.presenceOfElementLocated(headingPage).getText());
        return this;
    }

    public MainPage returnMainPage() {
        return new MainPage();
    }

}
