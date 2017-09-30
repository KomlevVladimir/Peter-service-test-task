package webtests.data;


import org.testng.annotations.DataProvider;
import webtests.model.UserData;

public class DataProviders {

    @DataProvider(name = "loginWithValidCredentials")
    public static Object[][] validCredentials() {
        String email = "qaa.ps.test@mailinator.com";
        String password = "pstest1";
        String keepMeSignedIn = "checked";
        return new Object[][] {
                new Object[] {new UserData().withEmail(email).withPassword(password)
                        .withKeepMeSignedIn(keepMeSignedIn)}
        };
    }
}
