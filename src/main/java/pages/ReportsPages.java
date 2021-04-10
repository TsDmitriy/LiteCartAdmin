package pages;

import org.junit.Assert;
import org.openqa.selenium.By;

public class ReportsPages {

    public ReportsPages() {
        Helpers.waitLoadPage();
    }

    private By headingPage = By.xpath("//h1[contains(.,\" Monthly Sales\")]");
    private By mostSoldProducts = By.id("doc-most_sold_products");
    private By mostShoppingCustomers = By.xpath("//*[@class=\"docs\"]//*[@id=\"doc-most_shopping_customers\"]");


    public ReportsPages checkHeadingReportsPages() {
        Assert.assertEquals("Некорректный заголовок страницы", "Monthly Sales", Helpers.presenceOfElementLocated(headingPage).getText());
        return this;
    }

    public MostSoldProductsPage goToMostSoldProductsPage() {
        Helpers.click(mostSoldProducts);
        return new MostSoldProductsPage();
    }

    public MostShoppingCustomersPage goToMostShoppingCustomersPage() {
        Helpers.click(mostShoppingCustomers);
        return new MostShoppingCustomersPage();
    }

    public MainPage returnMainPage() {
        return new MainPage();
    }
}
