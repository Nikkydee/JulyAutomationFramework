package Tests;

import com.POJO.JobDetailsPOJO;
import com.pages.DashboardPage;
import com.pages.GlobalListPage;
import com.pages.LoginPage;

import static java.lang.Thread.sleep;

public class DashboardScript {
    public static void main(String[] args) throws InterruptedException {
        LoginPage loginpage = new LoginPage();
        DashboardPage dashboardPage = loginpage.doLoginAs("iamfd","password");
        System.out.println(dashboardPage.getTotalPendingForDeliveryJobsCount());
        GlobalListPage globalListPage =dashboardPage.searchJobUsing("JOB_20812");
        JobDetailsPOJO data = globalListPage.getJobDetails();
        System.out.println(data);

    }
}
