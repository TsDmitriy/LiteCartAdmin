package pages;

import org.junit.Assert;
import org.openqa.selenium.By;

public class TaxPage {
    public TaxPage() {
        Helpers.waitLoadPage();
    }
    private By headingPage = By.xpath("//h1[contains(.,\" Tax Classes\")]");
    private By taxRates = By.xpath("//*[@class=\"docs\"]//*[@id=\"doc-tax_rates\"]");


    public TaxPage checkHeadingTaxPage() {
        Assert.assertEquals("Некорректный заголовок страницы", "Tax Classes", Helpers.presenceOfElementLocated(headingPage).getText());
        return this;
    }

    public TaxRatesPage goToTaxRatesPage () {
        Helpers.click(taxRates);
        return new TaxRatesPage();
    }

    public MainPage returnMainPage() {
        return new MainPage();
    }

}
