package pages;


import org.openqa.selenium.By;

public class GoToLoginPage {

    private String url = "http://localhost/litecart/admin/";
    private By buttonLogin = By.name("login");


    public MainPage getpage() {
        Driver.getInstance().get(url);
        Helpers.presenceOfElementLocated(buttonLogin);
        return new MainPage();
    }
}
