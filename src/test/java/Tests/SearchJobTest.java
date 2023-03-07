package Tests;

import com.POJO.JobDetailsPOJO;
import com.pages.DashboardPage;
import com.pages.GlobalListPage;
import com.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SearchJobTest {
    private LoginPage loginPage;
    private DashboardPage dashboardPage;
    private JobDetailsPOJO actualJobDetailsPOJO;
    private JobDetailsPOJO expectedJobDetailsPOJO;

    @BeforeMethod(description = "set up for the test")
    public void setup(){
        loginPage = new LoginPage();
        dashboardPage =loginPage.doLoginAs("iamfd", "password");
        expectedJobDetailsPOJO = new JobDetailsPOJO("Google", "JOB_14058", "01887466787712", "Nexus 2", "gallexy",
                "In Warrenty", "Pending For Repair");
    }


    @Test(description = "Verify if the user can search for job")
    public void searchJobFunctionalityTest(){

         actualJobDetailsPOJO =dashboardPage.searchJobUsing("JOB_14058").getJobDetails();
         Assert.assertTrue(actualJobDetailsPOJO.equals(expectedJobDetailsPOJO));



    }
}
