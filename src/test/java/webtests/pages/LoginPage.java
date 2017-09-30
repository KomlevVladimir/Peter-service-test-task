package webtests.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage extends BasePage {

    public LoginPage(WebDriver wd) {
        super(wd);
        PageFactory.initElements(wd, this);
    }

    @FindBy (xpath = "//input[@id='ap_email']")
    public WebElement inputEmail;

    @FindBy (xpath = "//input[@id='ap_password']")
    public WebElement inputPassword;

    @FindBy (xpath = "//input[@id='signInSubmit']")
    public WebElement buttonSignIn;

    public void checkBoxSetValue(String keepMeSignedIn) {
        checkboxSetValue(By.xpath("//div[@class='a-checkbox']/label/input"), keepMeSignedIn);
    }

}
