import org.openqa.selenium.By;

public class CatalogPage {

    private By catalog = By.xpath("//*[@class=\"button\"][text()=' Add New Product']");
    private By notice = By.xpath("//*[@class=\"notice success\"][text()=' Changes were successfully saved.']");

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
}
