package pages;

import org.junit.Assert;
import org.openqa.selenium.By;

public class GeoZonesPage {

    public GeoZonesPage() {
        Helpers.waitLoadPage();
    }

    private By headingPage = By.xpath("//h1[contains(.,\" Geo Zones\")]");

    public GeoZonesPage checkHeadingGeoZonesPage() {
        Assert.assertEquals("Некорректный заголовок страницы", "Geo Zones", Helpers.presenceOfElementLocated(headingPage).getText());
        return this;
    }

    public MainPage returnMainPage() {
        return new MainPage();
    }

}
