package webtests.tests;


import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import webtests.app.Application;

public class TestBase {

    protected static final Application app =
            new Application(System.getProperty("browser", BrowserType.CHROME));

    @BeforeMethod
    public void setUp() throws Exception {
        app.init();
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        app.stop();
    }
}
