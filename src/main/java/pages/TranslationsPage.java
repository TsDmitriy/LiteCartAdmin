package pages;

import org.junit.Assert;
import org.openqa.selenium.By;

public class TranslationsPage extends MainPage{
     public TranslationsPage() {
        Helpers.waitLoadPage();
    }
    private By headingPage = By.xpath("//h1[contains(.,\" Search Translations\")]");
    private By scanFiles =By.id("doc-scan");
    private By cSVImportExport =By.id("doc-csv");
    private By users = By.xpath("//span[contains(.,'Users')]");


    public TranslationsPage checkHeadingTranslationsPage() {
        Assert.assertEquals("Некорректный заголовок страницы", "Search Translations", Helpers.presenceOfElementLocated(headingPage).getText());
        return this;
    }

    public ScanFilesPage goToScanFilesPage() {
        Helpers.click(scanFiles);
        return new ScanFilesPage();
    }

    public TranslationsCSVImportExportPage goToTranslationsCSVImportExportPage() {
        Helpers.click(cSVImportExport);
        return new TranslationsCSVImportExportPage();
    }
}
