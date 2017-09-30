package webtests.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage extends BasePage{

    public MainPage(WebDriver wd) {
        super(wd);
    }

    public void open() {
        wd.get("https://www.amazon.com");
    }

    public boolean isProfilePresentOnPage() {
        return isElementPresent(By.xpath("//div[@class='hud-profilecard-card']"));
    }
}
