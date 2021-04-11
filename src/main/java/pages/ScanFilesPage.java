package pages;

import org.junit.Assert;
import org.openqa.selenium.By;

public class ScanFilesPage extends TranslationsPage{
    public ScanFilesPage() {
        Helpers.waitLoadPage();
    }
    private By headingPage = By.xpath("//h1[contains(.,\" Scan Files For Translations\")]");

    public ScanFilesPage checkHeadingScanFilesPage() {
        Assert.assertEquals("Некорректный заголовок страницы", "Scan Files For Translations", Helpers.presenceOfElementLocated(headingPage).getText());
        return this;
    }

}
