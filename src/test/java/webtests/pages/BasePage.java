package webtests.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    protected WebDriver wd;
    protected WebDriverWait wait;

    public BasePage(WebDriver wd) {
        this.wd = wd;
        wait = new WebDriverWait(wd, 10);
    }

    protected void click(By locator)
    {
        wd.findElement(locator).click();
    }

    protected void checkboxSetValue(By locator, String value) {
        if (!wd.findElement(locator).isSelected() && value.equals("checked")
                || wd.findElement(locator).isSelected() && value.equals("unchecked")) {
            click(locator);
        }
    }

    protected boolean isElementPresent(By locator) {
        try {
            wd.findElement(locator);
            return true;
        } catch (NoSuchElementException ex) {
            return false;
        }
    }
}
