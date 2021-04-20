import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class NewCountryPage {
    private By href = By.xpath("//*[@id=\"content\"]//table//a[contains(@target,'_blank')]");

    public NewCountryPage goToHrefSwitchToWindowAndClouse(){
        List<WebElement> listHref= new ArrayList<>();
        listHref.addAll(Driver.getInstance().findElements(href));

        for(WebElement link : listHref) {
            String mainWindow = Driver.getInstance().getWindowHandle();
            link.click();
            List<String> handle = new ArrayList<>(Driver.getInstance().getWindowHandles());
             for (int i = 0 ;i<handle.size();i++) {
                 if (handle.get(i).equals(mainWindow))
                     handle.remove(i);
             }
            Driver.getInstance().switchTo().window(handle.get(0));
            Driver.getInstance().close();
            Driver.getInstance().switchTo().window(mainWindow);
        }
        return this;
    }

}
