package pages;

import org.openqa.selenium.By;

public class MainPage {

    public MainPage() {
        Helpers.waitLoadPage();
    }

    private By appearence = By.xpath("//span[contains(.,'Appearence')]");
    private By сatalog = By.xpath("//span[contains(.,'Catalog')]");
    private By countries = By.xpath("//span[contains(.,'Countries')]");
    private By currencies = By.xpath("//span[contains(.,\"Currencies\")]");
    private By customers = By.xpath("//span[contains(.,\"Customers\")]");
    private By geoZones = By.xpath("//span[contains(.,'Geo Zones')]");
    private By languages = By.xpath("//span[contains(.,'Languages')]");
    private By modules = By.xpath("//span[contains(.,'Modules')]");
    private By orders = By.xpath("//span[contains(.,'Orders')]");
    private By pages = By.xpath("//span[contains(.,'Pages')]");
    private By report = By.xpath("//span[contains(.,'Reports')]");
    private By settings = By.xpath("//span[contains(.,'Settings')]");
    private By slides = By.xpath("//span[contains(.,'Slides')]");
    private By tax = By.xpath("//span[contains(.,'Tax')]");
    private By translations = By.xpath("//span[contains(.,'Translations')]");
    private By users = By.xpath("//span[contains(.,'Users')]");
    private By vQmods = By.xpath("//span[contains(.,'vQmods')]");

    public AppearencePage goToAppearencePage() {
        Helpers.clickJs(appearence);
        return new AppearencePage();
    }


    public CatalogPage goToCatalogPage() {
        Helpers.clickJs(сatalog);
        return new CatalogPage();
    }

    public CountriesPage goToCountriesPage() {
        Helpers.click(countries);
        return new CountriesPage();
    }

    public CurrenciesPage goToCurrenciesPage() {
        Helpers.clickJs(currencies);
        return new CurrenciesPage();
    }

    public CustomersPage goToCustomersPage() {
        Helpers.clickJs(customers);
        return new CustomersPage();
    }

    public GeoZonesPage goToGeoZonesPage() {
        Helpers.clickJs(geoZones);
        return new GeoZonesPage();
    }

    public LanguagesPage goToLanguagesPage() {
        Helpers.clickJs(languages);
        return new LanguagesPage();
    }

    public ModulesPage goToModulesPage() {
        Helpers.clickJs(modules);
        return new ModulesPage();
    }

    public OrdersPage goToOrdersPage() {
        Helpers.clickJs(orders);
        return new OrdersPage();
    }

    public PagesPage goToPages() {
        Helpers.clickJs(pages);
        return new PagesPage();
    }

    public ReportsPages goToReportsPages() {
        Helpers.clickJs(report);
        return new ReportsPages();
    }

    public SettingsPage goToSettingsPage() {
        Helpers.clickJs(settings);
        return new SettingsPage();
    }

    public SlidesPage goToSlidesPage() {
        Helpers.clickJs(slides);
        return new SlidesPage();
    }

    public TaxPage goToTaxPage() {
        Helpers.clickJs(tax);
        return new TaxPage();
    }

    public TranslationsPage goToTranslationsPage() {
        Helpers.clickJs(translations);
        return new TranslationsPage();
    }

    public UsersPage goToUsersPage() {
        Helpers.click(users);
        return new UsersPage();
    }

    public VQmodsPage goToVQmodsPage() {
        Helpers.clickJs(vQmods);
        return new VQmodsPage();
    }
}
