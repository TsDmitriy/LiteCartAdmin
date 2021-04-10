package pages;

import org.junit.Assert;
import org.openqa.selenium.By;

public class SettingsPage {
    public SettingsPage() {
        Helpers.waitLoadPage();
    }
    private By headingPage = By.xpath("//h1[contains(.,\" Settings\")]");
    private By defaults = By.id("doc-defaults");
    private By general = By.id("doc-defaults");
    private By listings = By.id("doc-listings");
    private By images = By.id("doc-images");
    private By checkout = By.id("doc-checkout");
    private By advanced = By.id("doc-advanced");
    private By security = By.id("doc-security");



    public SettingsPage checkHeadingSettingsPage() {
        Assert.assertEquals("Некорректный заголовок страницы", "Settings", Helpers.presenceOfElementLocated(headingPage).getText());
        return this;
    }
    public DefaultsPage goToDefaultsPage () {
        Helpers.click(defaults);
        return new DefaultsPage();
    }

    public GeneralPage goToDGeneralPage () {
        Helpers.click(general);
        return new GeneralPage();
    }

    public ListingsPage goToListingsPage () {
        Helpers.click(listings);
        return new ListingsPage();
    }

    public ImagesPage goToImagesPage () {
        Helpers.click(images);
        return new ImagesPage();
    }

    public CheckoutPage goToCheckoutPage () {
        Helpers.click(checkout);
        return new CheckoutPage();
    }

    public AdvancedPage goToAdvancedPage () {
        Helpers.click(advanced);
        return new AdvancedPage();
    }

    public SecurityPage goToSecurityPage () {
        Helpers.click(security);
        return new SecurityPage();
    }

    public MainPage returnMainPage() {
        return new MainPage();
    }
}
