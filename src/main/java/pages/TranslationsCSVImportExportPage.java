package pages;

import org.junit.Assert;
import org.openqa.selenium.By;

public class TranslationsCSVImportExportPage extends TranslationsPage{
    public TranslationsCSVImportExportPage() {
        Helpers.waitLoadPage();
    }

    private By headingPage = By.xpath("//h1[contains(.,\" CSV Import/Export\")]");

    public TranslationsCSVImportExportPage checkHeadingScanFilesPage() {
        Assert.assertEquals("Некорректный заголовок страницы", "CSV Import/Export", Helpers.presenceOfElementLocated(headingPage).getText());
        return this;
    }

    public TranslationsPage returnTranslationsPage() {
        return new TranslationsPage();
    }


}
