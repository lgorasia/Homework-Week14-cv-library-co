package uk.co.library.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import uk.co.library.utility.Utility;

public class ResultPage extends Utility {
    public ResultPage() {
        PageFactory.initElements(driver,this);
    }


    @FindBy(css = "body.site-cvlibrary-uk.header-search-bar-showing:nth-child(2) main.site-main:nth-child(8) div.site-wrapper div.page-wrapper.container-1200.page-wrapper--faceted:nth-child(2) div.page-main:nth-child(4) div.search-header:nth-child(1) div.search-header__left > h1.search-header__title")
    WebElement resultTerxtFields;

    public String messageField(String result){
        Reporter.log("messageField" + resultTerxtFields.toString());
        return getTextFromElement(resultTerxtFields,result);
    }

}
