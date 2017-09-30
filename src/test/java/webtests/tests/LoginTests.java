package webtests.tests;

import org.testng.annotations.Test;
import webtests.data.DataProviders;
import webtests.model.UserData;

import static org.testng.Assert.*;


public class LoginTests extends TestBase {

    @Test(dataProvider = "loginWithValidCredentials", dataProviderClass = DataProviders.class)
    public void testLogin(UserData user) {
        app.userIsOnTheMainPage();
        app.userLoginWithData(user);

        assertTrue(app.isLoggedIn());
        assertFalse(app.isSignInLinkPresent());
    }
}
