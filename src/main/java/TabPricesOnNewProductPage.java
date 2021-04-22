import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;

public class TabPricesOnNewProductPage {
    public TabPricesOnNewProductPage() {
        Helpers.visibilityOf(purchasePriceSum);
    }

    private By purchasePriceSum= By.name("purchase_price");
    private By purchasePriceСurrency= By.name("purchase_price_currency_code");
    private By priseUSD = By.name("prices[USD]");
    private By priseEUR = By.name("prices[EUR]");

    private By saveButton = By.name("save");
    private By notice = By.xpath("//*[@class=\"notice success\"][text()=' Changes were successfully saved.']");

    public TabPricesOnNewProductPage fillingFieldsProductOnTabGeneral() {
        Helpers.presenceOfElementLocated(purchasePriceSum).clear();
        Helpers.sendKeys(purchasePriceSum, "20");
        Select select = new Select(Helpers.presenceOfElementLocated(purchasePriceСurrency));
        select.selectByIndex(2);
        Helpers.sendKeys(priseUSD, "20");
        Helpers.sendKeys(priseEUR, "20");
        Helpers.click(saveButton);
        Helpers.presenceOfElementLocated(notice);
        return this;
    }

    public static Integer generateRandomValue() {
        Random random = new Random();
        Integer number = random.nextInt(999);
        return number;
    }

    public LiteCart goToLiteCart () {
        String url = "http://localhost/litecart/en/";
        Driver.getInstance().get(url);
        return new LiteCart();
    }
}
