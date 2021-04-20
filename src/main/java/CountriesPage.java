import org.openqa.selenium.By;

public class CountriesPage {
    private By  addNewCountry = By.xpath("//*[@class=\"button\"]");

    public NewCountryPage addNewCountry() throws InterruptedException {
        Helpers.clickJs(addNewCountry);
        return new NewCountryPage();
    }
}
