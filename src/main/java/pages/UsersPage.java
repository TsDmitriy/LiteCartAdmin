package pages;

import org.junit.Assert;
import org.openqa.selenium.By;

public class UsersPage extends MainPage {
    public UsersPage() {
        Helpers.waitLoadPage();
    }
    private By headingPage = By.xpath("//h1[contains(.,\" Users\")]");
    private By vQmods =By.xpath("//span[contains(.,'vQmods')]");


    public UsersPage checkHeadingUsersPage() {
        Assert.assertEquals("Некорректный заголовок страницы", "Users", Helpers.presenceOfElementLocated(headingPage).getText());
        return this;
    }

    public MainPage returnMainPage() {
        return new MainPage();
    }

}
