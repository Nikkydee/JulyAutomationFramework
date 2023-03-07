package Tests;

import com.pages.DashboardPage;
import com.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginUITest {
    LoginPage loginPage;

    @BeforeMethod(description = "Launching the application on the browser")
    public void setUp(){
        loginPage =new LoginPage();

    }
    @Test(description = "Verify that the user can login into the application", priority =1, groups= {"sanity","smoke","regression"})

    public void VerifyLoginTest() {

        Assert.assertEquals(loginPage.doLoginAs("iamfd","password").getUSerName(), "iamfd");

  /*
  *No looping stmt
  *No conditional statement
  *no conditional statement
  * At least one assertion
  */


;    }
}
