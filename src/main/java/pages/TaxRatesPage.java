package pages;

import org.junit.Assert;
import org.openqa.selenium.By;

public class TaxRatesPage {
    public TaxRatesPage() {
        Helpers.waitLoadPage();
    }
    private By headingPage = By.xpath("//h1[contains(.,\" Tax Rates\")]");

    public TaxRatesPage checkHeadingTaxRatesPage() {
        Assert.assertEquals("Некорректный заголовок страницы", "Tax Rates", Helpers.presenceOfElementLocated(headingPage).getText());
        return this;
    }

    public TaxPage returnTaxPage() {
        return new TaxPage();
    }


}
