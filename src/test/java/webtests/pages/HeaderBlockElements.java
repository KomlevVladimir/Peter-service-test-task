package webtests.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HeaderBlockElements  extends BasePage{


    public HeaderBlockElements(WebDriver wd) {
        super(wd);
        PageFactory.initElements(wd, this);
    }

    @FindBy (xpath = "//a[@id='nav-link-accountList']/span[@class='nav-line-1']")
    public WebElement linkSignIn;

}
