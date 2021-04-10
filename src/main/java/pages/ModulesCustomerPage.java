package pages;

import org.junit.Assert;
import org.openqa.selenium.By;

public class ModulesCustomerPage {

    public ModulesCustomerPage() {
        Helpers.waitLoadPage();
    }

    private By headingPage = By.xpath("//h1[contains(.,\" Customer Modules\")]");

    public ModulesCustomerPage checkHeadingModulesPage() {
        Assert.assertEquals("Некорректный заголовок страницы", "Customer Modules", Helpers.presenceOfElementLocated(headingPage).getText());
        return this;
    }

    public ModulesPage returnModulesPage() {
        return new ModulesPage();
    }

}
