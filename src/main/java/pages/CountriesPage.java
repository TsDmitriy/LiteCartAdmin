package pages;

import org.junit.Assert;
import org.openqa.selenium.By;

public class CountriesPage extends MainPage{

    public CountriesPage() {
        Helpers.waitLoadPage();
    }

    private By headingPage = By.xpath("//h1[contains(.,\" Countries\")]");

    public CountriesPage checkHeadingCountriesPage() {
        Assert.assertEquals("Некорректный заголовок страницы", "Countries", Helpers.presenceOfElementLocated(headingPage).getText());
        return this;
    }

}
