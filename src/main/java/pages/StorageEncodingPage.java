package pages;

import org.junit.Assert;
import org.openqa.selenium.By;

public class StorageEncodingPage extends LanguagesPage{

    public StorageEncodingPage() {
        Helpers.waitLoadPage();
    }

    private By headingPage = By.xpath("//h1[contains(.,\" Storage Encoding\")]");

    public StorageEncodingPage checkHeadingStorageEncodingPage() {
        Assert.assertEquals("Некорректный заголовок страницы", "Storage Encoding", Helpers.presenceOfElementLocated(headingPage).getText());
        return this;
    }
}
