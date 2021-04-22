import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class NewProductPage {

    private By radioButton = By.xpath("//*[text()=\" Enabled\"]");
    private By name = By.name("name[en]");
    private By code = By.name("code");
    private By categories = By.xpath("//*[@data-name=\"Rubber Ducks\"]");
    private By productGroups = By.xpath("//*[text()='Female']//..//input");
    private By quantity = By.name("quantity");
    private By type = By.xpath("//*[@type=\"file\"]");
    private By dateValidFrom = By.name("date_valid_from");
    private By dateValidTo = By.name("date_valid_to");
    private By date = By.xpath("//*[@type=\"date\"]");
    private By informationTab = By.xpath("//*[@href=\"#tab-information\"]");
    private Path path = Paths.get("ball.jpg");
    private By quantityUnitId = By.name("quantity_unit_id");


    public NewProductPage fillingFieldsProduct() throws InterruptedException {
        Thread.sleep(2000);
        String nameProduct = "MyProduct" + Integer.toString(TabPricesOnNewProductPage.generateRandomValue());
        Stash.put("myProduct", nameProduct);
        Helpers.click(radioButton);
        Helpers.sendKeys(name, Stash.getValue("myProduct"));
        Helpers.sendKeys(code, Integer.toString(TabPricesOnNewProductPage.generateRandomValue()));
        Helpers.click(categories);
        Helpers.click(productGroups);
        Helpers.presenceOfElementLocated(quantity).clear();
        Helpers.sendKeys(quantity, "20");
        Helpers.sendKeys(type, path.toAbsolutePath().toString());
        Helpers.sendKeys(dateValidFrom, getCurrentDateMinus1day());
        Helpers.sendKeys(dateValidTo, getCurrentDatePlus1day());
        return this;
    }


    public String getCurrentDateMinus1day() throws InterruptedException {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDateTime now = LocalDateTime.now().minusDays(3);
        now.minusDays(1);
        String strDate = now.format(dtf);
        return strDate;
    }


    public String getCurrentDatePlus1day() throws InterruptedException {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDateTime now = LocalDateTime.now().plusDays(3);
        String strDate = now.format(dtf);
        return strDate;
    }

    public TabGeneralOnNewProductPage goToTabGeneralOnNewProductPage() {
        Helpers.click(informationTab);
        return new TabGeneralOnNewProductPage();
    }
}
