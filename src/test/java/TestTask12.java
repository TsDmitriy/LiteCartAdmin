import org.junit.Test;


public class TestTask12 extends TestBase{


    @Test
    public void test() throws InterruptedException {
        new LoginPage()
                .inputLoginAndPassword()
                .goToCatalogPage()
                .goToNewProductPage()
                .fillingFieldsProduct()
                .goToTabGeneralOnNewProductPage()
                .fillingFieldsProductOnTabGeneral()
                .goToTabGeneralOnNewProductPage()
                .fillingFieldsProductOnTabGeneral()
                .checkNoticeAboutGoodCreateProduct()
                .checkGoodCreateProductInCatalog()
                .goToLiteCart()
                .checkMyProductInLiteCart();


    }
}