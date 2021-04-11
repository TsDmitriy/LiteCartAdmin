package pages;

import org.junit.Assert;
import org.openqa.selenium.By;

public class MostSoldProductsPage extends ReportsPages {

    public MostSoldProductsPage() {
        Helpers.waitLoadPage();
    }

    private By headingPage = By.xpath("//h1[contains(.,\" Most Sold Products\")]");

    public MostSoldProductsPage checkHeadingMostSoldProductsPage() {
        Assert.assertEquals("Некорректный заголовок страницы", "Most Sold Products", Helpers.presenceOfElementLocated(headingPage).getText());
        return this;
    }

    public ReportsPages returnReportsPages() {
        return new ReportsPages();
    }

}
