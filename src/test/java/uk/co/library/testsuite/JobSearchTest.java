package uk.co.library.testsuite;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import resources.testdata.TestData;
import uk.co.library.pages.HomePage;
import uk.co.library.pages.ResultPage;
import uk.co.library.testbase.TestBase;

public class JobSearchTest extends TestBase {
    HomePage homePage;
    ResultPage resultPage;

    @BeforeMethod
    public void inIt(){
        homePage = new HomePage();
        resultPage= new ResultPage();
    }
    @Test(groups = {"smoke","sanity","regression"},dataProvider = "jobSearchData",dataProviderClass = TestData.class)
    public void verifyJobSearchResultUsingDifferentDataSet(String jobTitle, String location, String
            distance, String salaryMin, String salaryMax, String salaryType, String jobType,
                                               String result) throws InterruptedException {
//        Thread.sleep(5000);
        homePage.clickAcceptCookies();
     //   homePage.clickOnAcceptAll();
        homePage.clickOnJobTitle(jobTitle);
        homePage.clickOnLocationField(location);
        homePage.clickOndistanceFiels(distance);
        homePage.moreOptionField();
        homePage.clickOnSalaryMinField(salaryMin);
        homePage.clickOnsalaryMaxField(salaryMax);
        homePage.salaryTypeDropDownField(salaryType);
        homePage.jobTypeDropdownField(jobType);
        homePage.clickOnFindJobButton();
       // homePage.enerdetailsToApplication(jobTitle,location,distance, salaryMin, salaryMax, salaryType,  jobType, result);
    String actaulResult =resultPage.messageField(result);
    String expectedResult = result;
        Assert.assertEquals(actaulResult,expectedResult);


    }

}
