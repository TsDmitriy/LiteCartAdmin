import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class CatalogPage {

    private By catalog = By.xpath("//*[@class=\"button\"][text()=' Add New Product']");
    private By notice = By.xpath("//*[@class=\"notice success\"][text()=' Changes were successfully saved.']");
    private By folder = By.xpath("//*[@class=\"fa fa-folder\"]/following-sibling::a");
    private By product = By.xpath("//img/following-sibling::a");



    public NewProductPage goToNewProductPage() {
        Helpers.click(catalog);
        return new NewProductPage();
    }

    public CatalogPage checkNoticeAboutGoodCreateProduct() {
        Helpers.presenceOfElementLocated(notice);
        return this;
    }
    public LiteCart goToLiteCart () {
        String url = "http://localhost/litecart/en/";
        Driver.getInstance().get(url);
        return new LiteCart();
    }

    public CatalogPage checkGoodCreateProductInCatalog() {
        Helpers.presenceOfElementLocated(By.xpath("//a[text()=\""+Stash.getValue("myProduct")+"\"]"));
        return this;
    }

    public CatalogPage openFolder() {
        if (Driver.getInstance().findElements(folder).size()>0) {
            Helpers.click(folder);
        }
        else {
            return this;
        }
        return openFolder();
    }
    public CatalogPage goToProductPageAndCheckErrorInBrowser() {
        List<WebElement> productList =new ArrayList<>();
        productList.addAll(Driver.getInstance().findElements(product));
        List<String> productHrefList =new ArrayList<>();
        for (WebElement a : productList) {
            productHrefList.add(a.getAttribute("href"));
        }
        for (String href: productHrefList){
            Driver.getInstance().get(href);
//            getLogBrowser();
        }

        return this;
    }
    private void getLogBrowser() {
        Assert.assertEquals("Лог браузера содержит сообщения на странице " + Driver.getInstance().getCurrentUrl(),Driver.getInstance().manage().logs().get("browser").getAll().size(),0);
        Driver.getInstance().manage().logs().get("browser").forEach(i-> System.out.println(i));
    }
}
