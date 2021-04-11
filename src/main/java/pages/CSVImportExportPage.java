package pages;

import org.junit.Assert;
import org.openqa.selenium.By;

public class CSVImportExportPage extends CatalogPage{

    public CSVImportExportPage() {
        Helpers.waitLoadPage();
    }

    private By headingPage = By.xpath("//h1[contains(.,\" CSV Import/Export\")]");

    public CSVImportExportPage checkHeadingCSVImportExportPage() {
        Assert.assertEquals("Некорректный заголовок страницы", "CSV Import/Export", Helpers.presenceOfElementLocated(headingPage).getText());
        return this;
    }
}
