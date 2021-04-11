package pages;

import org.junit.Assert;
import org.openqa.selenium.By;

public class LanguagesPage extends MainPage{

    public LanguagesPage() {
        Helpers.waitLoadPage();
    }

    private By headingPage = By.xpath("//h1[contains(.,\" Languages\")]");
    private By storageEncoding = By.id("doc-storage_encoding");


    public LanguagesPage checkHeadingLanguagesPage() {
        Assert.assertEquals("Некорректный заголовок страницы", "Languages", Helpers.presenceOfElementLocated(headingPage).getText());
        return this;
    }

    public StorageEncodingPage goToStorageEncodingPage() {
        Helpers.click(storageEncoding);
        return new StorageEncodingPage();
    }
}
