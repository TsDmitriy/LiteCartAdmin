import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class NewCountryPage {
    private By href = By.xpath("//*[@id=\"content\"]//table//a[contains(@target,'_blank')]");

    public NewCountryPage goToHrefSwitchToWindowAndClouse(){
        List<WebElement> listHref= new ArrayList<>();
        listHref.addAll(Driver.getInstance().findElements(href));

        for(WebElement link : listHref) {
            String mainWindowHandle = Driver.getInstance().getWindowHandle();
            Set<String> oldWindowsSet = Driver.getInstance().getWindowHandles();
            link.click();
            String newWindowHandle = (new WebDriverWait(Driver.getInstance(), 15))
                    .until(new ExpectedCondition<String>() {
                               public String apply(WebDriver driver) {
                                   Set<String> newWindowsSet = driver.getWindowHandles();
                                   newWindowsSet.removeAll(oldWindowsSet);
                                   return newWindowsSet.size() > 0 ?
                                           newWindowsSet.iterator().next() : null;
                               }
                           });
            Driver.getInstance().switchTo().window(newWindowHandle);
            Driver.getInstance().close();
            Driver.getInstance().switchTo().window(mainWindowHandle);
        }
        return this;
    }

}
