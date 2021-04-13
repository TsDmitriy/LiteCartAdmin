import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class MainPage {

    private By menuAll = By.xpath("//*[@id=\"app-\"]/a");
    private By submenu = By.xpath("//a/following-sibling::ul/li/a");
    private By headingPage = By.xpath("//h1");

    public MainPage clickMenuAndCheckHeadingPage() {

        List<WebElement> menuList = new ArrayList<>();
        menuList.addAll(Driver.getInstance().findElements(menuAll));
        List<String> menuListHref = new ArrayList<>();
        for (int i = 0; i < menuList.size(); i++) {
            menuListHref.add(menuList.get(i).getAttribute("href"));
        }

        for (int i = 0; i < menuListHref.size(); i++) {
            Driver.getInstance().get(menuListHref.get(i));

            List<WebElement> subMenuList = new ArrayList<>();
            subMenuList.addAll(Driver.getInstance().findElements(submenu));
            List<String> subMenuHref = new ArrayList<>();

            for (int a = 0; a < subMenuList.size(); a++) {
                subMenuHref.add(subMenuList.get(a).getAttribute("href"));

            }
            for (int b = 0; b < subMenuHref.size(); b++) {
                Driver.getInstance().get(subMenuHref.get(b));
                Helpers.presenceOfElementLocatedAmdFindElement(headingPage);
            }

        }
        return this;
    }

}

