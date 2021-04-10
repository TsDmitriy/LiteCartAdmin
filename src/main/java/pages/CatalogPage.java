package pages;

import org.junit.Assert;
import org.openqa.selenium.By;

public class CatalogPage {

    public CatalogPage() {
        Helpers.waitLoadPage();
    }

    private By headingPage = By.xpath("//h1[contains(.,\" Catalog\")]");
    private By productGroups = By.id("doc-product_groups");
    private By optionGroups = By.id("doc-option_groups");
    private By manufacturers = By.id("doc-manufacturers");
    private By suppliers = By.id("doc-suppliers");
    private By docDeliveryStatuses = By.id("doc-delivery_statuses");
    private By soldOutStatuses = By.id("doc-sold_out_statuses");
    private By quantityUnits = By.id("doc-quantity_units");
    private By cSVImportExport = By.id("doc-csv");


    public CatalogPage checkHeadingCatalogPage() {
        Assert.assertEquals("Некорректный заголовок страницы", "Catalog", Helpers.presenceOfElementLocated(headingPage).getText());
        return this;
    }

    public ProductGroupsPage goToProductGroupsPage() {
        Helpers.click(productGroups);
        return new ProductGroupsPage();
    }

    public OptionGroupsPage goToOptionGroupsPage() {
        Helpers.click(optionGroups);
        return new OptionGroupsPage();
    }

    public ManufacturersPage goToManufacturersPage() {
        Helpers.click(manufacturers);
        return new ManufacturersPage();
    }

    public SuppliersPage goToSuppliersPage() {
        Helpers.click(suppliers);
        return new SuppliersPage();
    }

    public DeliveryStatusesPage goToDeliveryStatusesPage() {
        Helpers.click(docDeliveryStatuses);
        return new DeliveryStatusesPage();
    }

    public SoldOutStatusesPage goToSoldOutStatusesPage() {
        Helpers.click(soldOutStatuses);
        return new SoldOutStatusesPage();
    }

    public QuantityUnitsPage goToQuantityUnitsPage() {
        Helpers.click(quantityUnits);
        return new QuantityUnitsPage();
    }

    public CSVImportExportPage goToCSVImportExportPage() {
        Helpers.click(cSVImportExport);
        return new CSVImportExportPage();
    }

    public MainPage returnMainPage() {
        return new MainPage();
    }

}
