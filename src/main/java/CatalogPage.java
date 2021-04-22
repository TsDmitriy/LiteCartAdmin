import org.openqa.selenium.By;

public class CatalogPage {

    private By catalog = By.xpath("//*[@class=\"button\"][text()=' Add New Product']");

    public NewProductPage goToNewProductPage() {
        Helpers.click(catalog);
        return new NewProductPage();
    }
}
