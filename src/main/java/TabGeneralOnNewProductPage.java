import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class TabGeneralOnNewProductPage {

    public TabGeneralOnNewProductPage() {
        Helpers.visibilityOf(manufacturer);
    }

    private By manufacturer= By.name("manufacturer_id");
    private By keywords= By.name("keywords");
    private By shortDescription= By.name("short_description[en]");
    private By description= By.xpath("//*[@class=\"trumbowyg-editor\"]");
    private By headTitle= By.name("head_title[en]");
    private By metaDescription= By.name("meta_description[en]");
    private By prices =By.xpath("//*[@href=\"#tab-prices\"]");


    public TabGeneralOnNewProductPage fillingFieldsProductOnTabGeneral()  {
        Select select = new Select(Helpers.presenceOfElementLocated(manufacturer));
        select.selectByIndex(1);
        Helpers.sendKeys(keywords, "лучший товар");
        Helpers.sendKeys(shortDescription, "Мяч игровой");
        Helpers.sendKeys(description, "Мяч игровой,предназначен для игры в баскетбол");
        Helpers.sendKeys(headTitle,"Spalding");
        Helpers.sendKeys(metaDescription, "metaDescription");
        Helpers.click(prices);
        return this;
    }

    public TabPricesOnNewProductPage goToTabGeneralOnNewProductPage() {
        Helpers.click(prices);
        return new TabPricesOnNewProductPage();
    }
}
