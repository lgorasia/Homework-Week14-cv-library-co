package uk.co.library.pages;


import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import uk.co.library.customlisteners.CustomListeners;
import uk.co.library.utility.Utility;

import static uk.co.library.driverfactory.ManageDriver.driver;


public class HomePage extends Utility {
    public HomePage() {
        PageFactory.initElements(driver, this);
    }



    @FindBy(xpath = "//input[@id='keywords']")
    WebElement jobTitleField;

    @FindBy(xpath = "//input[@id='location']")
    WebElement locationField;

    @FindBy(xpath = "//select[@id='distance']")
    WebElement distanceDropDown;

    @FindBy(xpath = "//button[@id='toggle-hp-search']")
    WebElement moreSearchOptionsLink;

    @FindBy(xpath = "//input[@id='salarymin']")
    WebElement salaryMinField;

    @FindBy(xpath = "//input[@id='salarymax']")
    WebElement salaryMaxField;

    @FindBy(xpath = "//select[@id='salarytype']")
    WebElement salaryTypeDropDown;

    @FindBy(css = "#tempperm")
    WebElement jobTypeDropDown;

    @FindBy(xpath = "//input[@id='hp-search-btn']")
    WebElement findJobsBtn;

    @FindBy(xpath = "//button[@id='save']")
    WebElement acceptCookies;
    @FindBy(id ="gdpr-consent-notice")
    WebElement iframe;
    public void switchToIframe(WebElement element){

        driver.switchTo().frame(element);
    }
    public void clickAcceptCookies() {
        switchToIframe(iframe);
        clickOnElement(acceptCookies);
        driver.switchTo().defaultContent();
    }





    public void clickOnJobTitle(String jobTitle) {
        Reporter.log("clickOnJobTitle " + jobTitleField.toString());
        sendTextToElement(jobTitleField, jobTitle);
    }

    public void clickOnLocationField(String location) {
        Reporter.log("clickOnLocationField " + locationField.toString());
        sendTextToElement(locationField, location);
    }

    public void clickOndistanceFiels(String distance) {
        Reporter.log("clickOndistanceFiels" + distanceDropDown.toString());
        sendTextToElement(distanceDropDown, distance);
    }

    public void moreOptionField() {
        Reporter.log("moreOptionField" + moreSearchOptionsLink.toString());
        clickOnElement(moreSearchOptionsLink);
    }

    public void clickOnSalaryMinField(String salaryMin) {
        Reporter.log("clickOnSalaryMinField" + salaryMinField.toString());
        sendTextToElement(salaryMinField, salaryMin);
    }

    public void clickOnsalaryMaxField(String salaryMax) {
        Reporter.log("clickOnsalaryMaxField" + salaryMaxField.toString());
        sendTextToElement(salaryMaxField, salaryMax);
    }

    public void salaryTypeDropDownField(String salaryType) {
        Reporter.log("salaryTypeDropDownField" + salaryTypeDropDown.toString());
        sendTextToElement(salaryTypeDropDown, salaryType);
    }
    public void jobTypeDropdownField(String jobType){
        Reporter.log("jobTypeDropdownField" + jobTypeDropDown.toString());
        sendTextToElement(jobTypeDropDown,jobType);
    }
    public void clickOnFindJobButton(){
        Reporter.log("clickOnFindJobButton" + findJobsBtn.toString());
        clickOnElement(findJobsBtn);
    }


}
