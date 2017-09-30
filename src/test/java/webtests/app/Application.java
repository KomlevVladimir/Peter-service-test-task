package webtests.app;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;
import webtests.model.UserData;
import webtests.pages.HeaderBlockElements;
import webtests.pages.LoginPage;
import webtests.pages.MainPage;

public class Application {

    private WebDriver wd;
    private String browser;

    private HeaderBlockElements headerBlockElements;
    private LoginPage loginPage;
    private MainPage mainPage;

    public Application (String browser) {
        this.browser = browser;
    }

    public void init() {

        switch (browser) {
            case BrowserType.FIREFOX:
                wd = new FirefoxDriver();
                break;

            case BrowserType.CHROME:
                wd = new ChromeDriver();
                break;

            case BrowserType.IE:
                wd = new InternetExplorerDriver();
                break;
        }

        headerBlockElements = new HeaderBlockElements(wd);
        loginPage = new LoginPage(wd);
        mainPage = new MainPage(wd);
    }

    public void stop() {
        wd.quit();
    }

    public void userIsOnTheMainPage() {
        mainPage.open();
    }

    public void userLoginWithData(UserData data) {
        headerBlockElements.linkSignIn.click();
        loginPage.inputEmail.sendKeys(data.getEmail());
        loginPage.inputPassword.sendKeys(data.getPassword());
        loginPage.checkBoxSetValue(data.getKeepMeSignedIn());
        loginPage.buttonSignIn.click();
    }

    public boolean isSignInLinkPresent() {
        return headerBlockElements.linkSignIn.getText().equals("Hello. Sign in");
    }

    public boolean isLoggedIn() {
        return mainPage.isProfilePresentOnPage();
    }
}
