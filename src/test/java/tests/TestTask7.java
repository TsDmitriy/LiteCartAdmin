package tests;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import pages.Driver;
import pages.GoToLoginPage;
import pages.LoginPage;


public class TestTask7 {
    @BeforeClass
    public static void startDriver() {
        new GoToLoginPage().getpage();

    }

    @Test
    public void test() throws InterruptedException {
        new LoginPage()
                .inputLoginAndPassword()
                .goToAppearencePage()
                .checkHeadingPage()
                .goToLogotypePage()
                .checkHeadingLogotypePage()
                .goToCatalogPage()
                .checkHeadingCatalogPage()
                .goToProductGroupsPage()
                .checkHeadingProductGroupsPage()
                .goToOptionGroupsPage()
                .checkHeadingOptionGroupsPage()
                .goToManufacturersPage()
                .checkHeadingManufacturerPage()
                .goToSuppliersPage()
                .checkHeadingSuppliersPage()
                .goToDeliveryStatusesPage()
                .checkHeadingDeliveryStatusesPage()
                .goToSoldOutStatusesPage()
                .checkHeadingSoldOutStatusesPage()
                .goToQuantityUnitsPage()
                .checkHeadingQuantityUnitsPage()
                .goToCSVImportExportPage()
                .checkHeadingCSVImportExportPage()
                .goToCountriesPage()
                .checkHeadingCountriesPage()
                .goToCustomersPage()
                .checkHeadingCustomersPage()
                .goToCustomersCSVImportExportPage()
                .checkHeadingCustomersCSVImportExportPage()
                .goToGeoZonesPage()
                .checkHeadingGeoZonesPage()
                .goToLanguagesPage()
                .checkHeadingLanguagesPage()
                .goToStorageEncodingPage()
                .checkHeadingStorageEncodingPage()
                .goToModulesPage()
                .checkHeadingModulesPage()
                .goToModulesCustomerPage()
                .checkHeadingModulesPage()
                .goToShippingPage()
                .checkHeadingModulesPage()
                .goToPaymentPage()
                .checkHeadingPaymentPage()
                .goToOrderTotalPage()
                .checkHeadingOrderTotalPage()
                .returnModulesPage()
                .goToOrderSuccessPage()
                .checkHeadingOrderSuccessPage()
                .returnModulesPage()
                .goToOrderActionPage()
                .checkHeadingOrderActionPage()
                .goToOrdersPage()
                .checkHeadingOrdersPage()
                .goToOrderStatusesPage()
                .checkHeadingOrderStatusesPage()
                .goToPages()
                .checkHeadingPages()
                .goToReportsPages()
                .checkHeadingReportsPages()
                .goToMostSoldProductsPage()
                .checkHeadingMostSoldProductsPage()
                .returnReportsPages()
                .goToMostShoppingCustomersPage()
                .checkHeadingMostShoppingCustomersPage()
                .goToSettingsPage()
                .checkHeadingSettingsPage()
                .goToDefaultsPage()
                .checkHeadingDefaultsPage()
                .returnSettingsPage()
                .goToDGeneralPage()
                .checkHeadingGeneralPage()
                .returnSettingsPage()
                .goToListingsPage()
                .checkHeadingListingsPage()
                .returnSettingsPage()
                .goToImagesPage()
                .checkHeadingImagesPage()
                .returnSettingsPage()
                .goToCheckoutPage()
                .checkHeadingImagesPage()
                .returnSettingsPage()
                .goToAdvancedPage()
                .checkHeadingAdvancedPage()
                .returnSettingsPage()
                .goToSecurityPage()
                .checkHeadingSecurityPage()
                .goToSlidesPage()
                .checkHeadingSlidesPage()
                .goToTaxPage()
                .checkHeadingTaxPage()
                .goToTaxRatesPage()
                .checkHeadingTaxRatesPage()
                .goToTranslationsPage()
                .checkHeadingTranslationsPage()
                .goToScanFilesPage()
                .checkHeadingScanFilesPage()
                .goToTranslationsCSVImportExportPage()
                .checkHeadingScanFilesPage()
                .goToUsersPage()
                .checkHeadingUsersPage()
                .goToVQmodsPage()
                .checkHeadingVQmodsPage();
    }

    @AfterClass
    public static void stopDriver() {
        Driver.stopDriver();

    }

}